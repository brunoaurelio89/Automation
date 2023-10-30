package modulos.login;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

@DisplayName("Teste web para acessar o login")
public class UserLogin {

    @Test
    @DisplayName("Caso de Teste 1 - Acessar página e criar login ")
    public void testRealizarLogin (){

        // Abrir Navegador Chrome **Verificar a versão do Chrome
        //System.setProperty( "webdriver.chrome.driver","F:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
        //WebDriver navegador = new ChromeDriver();
        // Abrir Navegador Edge
        System.setProperty( "webdriver.chrome.driver","F:\\DRIVERS\\edgedriver_win64\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();

        // Abrir o navegador e maximizar a tela
        navegador.manage().window().maximize();
        navegador.get("https://automationexercise.com/");

        // Clicar em Signup e Criar usuário
        // Para buscar essa tag a href é necessário ir cascateando para chegar nela, indo na div para ul depois il depois na a href
        // pesquisa por " div ul li a[href='/login'] "
        navegador.findElement(By.cssSelector("div ul li a[href=\"/login\"]")).click();
       //navegador.findElement(By.id("signup-name")).sendKeys("Bruno");

        // Verificar o usuário



    }
}
