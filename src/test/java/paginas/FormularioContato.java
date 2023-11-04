package paginas;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

@DisplayName("Acessar formulário de contato")
public class FormularioContato {
    /*Atributo para utilização sempre do navegador*/
    private WebDriver navegador;


    public FormularioContato (WebDriver navegador){
        this.navegador = navegador;
    }

    public void testPreencheFormularioContato(String nome, String email, String assunto, String texto){

        navegador.findElement(By.cssSelector("div ul li a[href=\"/contact_us\"]")).click();
        navegador.findElement(By.cssSelector("input[name='name']")).sendKeys(nome);
        navegador.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(email);
        navegador.findElement(By.cssSelector("input[placeholder='Subject']")).sendKeys(assunto);
        navegador.findElement(By.cssSelector("#message")).sendKeys(texto);

        /*IMPLEMENTAÇÃO:
        * 01- Clicar no botão Escolher Arquivo
        * 02- Navegar na pasta e selecionar um arquivo
        * 03- Verificar se o arquivo foi adicionado*/


       // navegador.findElement(By.xpath("input[value='Submit']")).click();

    }
}
