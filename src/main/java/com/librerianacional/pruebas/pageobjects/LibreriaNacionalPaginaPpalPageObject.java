package com.librerianacional.pruebas.pageobjects;


import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://librerianacional.com/")


public class LibreriaNacionalPaginaPpalPageObject extends PageObject {

    By btnMiCuenta = By.xpath("//div[@class='row mx-0']//button[@id='dropdownMenuLogin']");
    By btnIniciarSeccion = By.xpath("//body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
    By btnIngresarMailContrasena = By.xpath("//body/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/app-ingreso[1]/div[1]/div[2]/div[1]/div[5]/a[1]");
    By inpIngresarDireccionEmail = By.xpath("//input[@placeholder='nombre@correo.com']");
    By inpIngresarContrasena2 = By.xpath("//input[@placeholder='Ingresar contraseña']");
    By btnIngresoSeccion = By.xpath("//button[@type='submit']");
    By btnMsjEdison = By.xpath("//div[@class='row mx-0']//i[@class='icon-user-login mr-1 text-white text--sml']");
    By msjHolaEdison = By.xpath("//div[@class='col-12 px-0 text--extrabold text--lgx text--lh-1 text--blue']");
    By textBarraBusqueda = By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[2]");
    By msjLibros = By.xpath("//h4[contains(text(),'\"Libros\"')]");
    By btnClicBusqueda = By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[2]");
    By btnCerrarSeccionEdison = By.xpath("//div[@class='row mx-0']//a[@class='d-flex text-white text--xl px-0 pt-2 link-perfil'][normalize-space()='Edison']");



    public By getBtnMiCuenta() {return btnMiCuenta;}

    public By getBtnIniciarSeccion() {return btnIniciarSeccion;}

    public By getBtnIngresarMailContrasena() {return btnIngresarMailContrasena;}

    public By getInpIngresarDireccionEmail() {return inpIngresarDireccionEmail;}

    public By getInpIngresarContrasena2() {return inpIngresarContrasena2;}

    public By getBtnIngresoSeccion() {return btnIngresoSeccion;}

    public By getBtnMsjEdison() {return btnMsjEdison;}

    public By getMsjHolaEdison() {return msjHolaEdison;}

    public By getTextBarraBusqueda() {return textBarraBusqueda;}

    public By getMsjLibros() {return msjLibros;}

    public By getBtnClicBusqueda() {return btnClicBusqueda;}

    public By getBtnCerrarSeccionEdison() {return btnCerrarSeccionEdison;}

}
