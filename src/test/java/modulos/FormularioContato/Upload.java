package modulos.FormularioContato;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
@DisplayName("")
    public void fileUploadTest() {
        //WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        navegador.get("https://the-internet.herokuapp.com/upload");
        Path path = Paths.get("D:\\Bruno Aurelio\\Desktop");
        File imagePath = new File(path.toUri());

        //we want to import selenium-snapshot file.
        navegador.findElement(By.id("file-upload")).sendKeys(imagePath.toString());
        navegador.findElement(By.id("file-submit")).submit();
        if(navegador.getPageSource().contains("File Uploaded!")) {
            System.out.println("file uploaded");
        }
        else{
            System.out.println("file not uploaded");
        }
        navegador.quit();
    }
}