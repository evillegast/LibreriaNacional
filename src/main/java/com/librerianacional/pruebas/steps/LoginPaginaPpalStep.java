package com.librerianacional.pruebas.steps;

import com.librerianacional.pruebas.pageobjects.LibreriaNacionalPaginaPpalPageObject;
import com.librerianacional.pruebas.utilidades.EsperasEsplicitas;
import com.librerianacional.pruebas.utilidades.ExcelDatos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.io.IOException;



public class LoginPaginaPpalStep {

    LibreriaNacionalPaginaPpalPageObject libreriaNacionalPaginaPpalPageObject = new LibreriaNacionalPaginaPpalPageObject();
    ExcelDatos excelDatos = new ExcelDatos();
    EsperasEsplicitas esperasEsplicitas = new EsperasEsplicitas();
    private static final String NOMBRE_EXCEL="Datos.xlsx";
    private static final  String NOMBRE_HOJA="usuarios";

    @Step
    public void openBrowser(){libreriaNacionalPaginaPpalPageObject.open();}

    @Step
    public void clicMiCuenta(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnMiCuenta()).click();
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnIniciarSeccion()).click();
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnIngresarMailContrasena()).click();

    }

    @Step
    public void ingresarDireccionEmail() throws IOException {
        esperasEsplicitas.esperaImplicitaTexto(libreriaNacionalPaginaPpalPageObject.getDriver(),libreriaNacionalPaginaPpalPageObject.getInpIngresarDireccionEmail());
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getInpIngresarDireccionEmail()).click();
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getInpIngresarDireccionEmail()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 0));



    }

    @Step
    public void ingresarContrasena2() throws IOException {
        esperasEsplicitas.esperaImplicitaTexto(libreriaNacionalPaginaPpalPageObject.getDriver(),libreriaNacionalPaginaPpalPageObject.getInpIngresarContrasena2());
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getInpIngresarContrasena2()).click();
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getInpIngresarContrasena2()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 1));

    }

    @Step
    public void ingresoSeccion(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnIngresoSeccion()).click();
    }

    @Step
    public void msjEdison(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnMsjEdison()).click();
        Assert.assertThat(libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnMsjEdison()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validarMensajeHolaEdison(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getMsjHolaEdison());
        Assert.assertThat(libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getMsjHolaEdison()).isDisplayed(), Matchers.is(true));

    }

    @Step
    public void barraBusqueda() throws IOException {
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getTextBarraBusqueda()).click();
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getTextBarraBusqueda()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 2));
    }

    @Step
    public void verificacionBusquedaLibro(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getMsjLibros());

    }

    @Step
    public void clicBusqueda(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnClicBusqueda()).sendKeys(Keys.ENTER);

    }

    @Step
    public void cerrarSeccionEdison(){
        libreriaNacionalPaginaPpalPageObject.getDriver().findElement(libreriaNacionalPaginaPpalPageObject.getBtnCerrarSeccionEdison()).click();
    }

}
