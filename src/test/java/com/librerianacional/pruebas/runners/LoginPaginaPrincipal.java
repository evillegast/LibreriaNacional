package com.librerianacional.pruebas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/loginLibreriaNacional/loginPaginaPpal.feature",
        glue = "com.librerianacional.pruebas.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class LoginPaginaPrincipal {


}
