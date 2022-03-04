package com.librerianacional.pruebas.stepdefinitions;

import com.librerianacional.pruebas.steps.LoginPaginaPpalStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class LoginPaginaPrincipalStepDefinitions {


    @Steps
    LoginPaginaPpalStep loginPaginaPpalStep;


    @Dado("que el usuario se encuentra en la pagina web de libreria nacional")
    public void queElUsuarioSeEncuentraEnLaPaginaWebDeLibreriaNacional() {
        loginPaginaPpalStep.openBrowser();
        loginPaginaPpalStep.clicMiCuenta();
    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales() throws IOException {

        loginPaginaPpalStep.ingresarDireccionEmail();
        loginPaginaPpalStep.ingresarContrasena2();
        loginPaginaPpalStep.ingresoSeccion();

    }

    @Entonces("se visualiza el panel principal con logo bienvenido Edison")
    public void seVisualizaElPanelPrincipalConLogoBienvenidoEdison() throws IOException {
        loginPaginaPpalStep.msjEdison();
        loginPaginaPpalStep.validarMensajeHolaEdison();
        loginPaginaPpalStep.barraBusqueda();
        loginPaginaPpalStep.clicBusqueda();
        loginPaginaPpalStep.verificacionBusquedaLibro();
        loginPaginaPpalStep.cerrarSeccionEdison();


    }


}
