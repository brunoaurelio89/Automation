package modulos.produto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Produto {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){

        System.setProperty( "webdriver.chrome.driver","F:\\DRIVERS\\edgedriver_win64\\msedgedriver.exe");
        this.navegador = new EdgeDriver();

        // Abrir o navegador, maximizar a tela e acessa o site Automation
        this.navegador.manage().window().maximize();
        this.navegador.get("https://automationexercise.com/");
    }


    @Test
    @DisplayName("Página de produto")
    public void testNavegaremProdutos(){


    }


    @AfterEach
    public void afterEach(){
        /*fecha o navegador no final da execução*/
        this.navegador.quit();
    }
}
