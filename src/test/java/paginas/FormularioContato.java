package paginas;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

@DisplayName("Acessar formulário de contato")
public class FormularioContato {
    /*Atributo para utilização sempre do navegador*/
    private WebDriver navegador;


    public FormularioContato (WebDriver navegador){
        this.navegador = navegador;
    }

    public void testPreencheFormularioContato(String nome, String email, String assunto, String texto, String arquivo){

        navegador.findElement(By.cssSelector("div ul li a[href=\"/contact_us\"]")).click();
        navegador.findElement(By.cssSelector("input[name='name']")).sendKeys(nome);
        navegador.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(email);
        navegador.findElement(By.cssSelector("input[placeholder='Subject']")).sendKeys(assunto);
        navegador.findElement(By.cssSelector("#message")).sendKeys(texto);

        /*Forma simples de fazer um upload de arquivo
        * Possível refatoração: Criar uma classe Upload para utilizar em mais páginas do site*/
        navegador.findElement(By.cssSelector("input[name='upload_file']")).sendKeys(arquivo);
        /*Estabelecido esse tempo para verificar se é mostrado o arquivo como  upload */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        navegador.findElement(By.cssSelector("input[value='Submit']")).click();
        /*Estabelecido esse tempo de espera para verificar a abertura do Alert está sendo mostrada*/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Janela pop up que é aberta / pega o texto da janela e clica em Ok*/
        navegador.switchTo().alert().getText();
        navegador.switchTo().alert().accept();

        /*Clica no Botão Home da página que aparece*/
        navegador.findElement(By.cssSelector("a[class='btn btn-success'] span")).click();

    }
}
