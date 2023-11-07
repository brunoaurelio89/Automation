package modulos.FormularioContato;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class Upload {

    private WebDriver navegador;

    public Upload (WebDriver navegador){
        this.navegador = navegador;
    }

@Test
@DisplayName("Teste Upload")
    public void fileUploadTest() {

    }
}