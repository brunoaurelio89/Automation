package modulos.FormularioContato;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import paginas.FormularioContato;

@DisplayName("Informações que serão digitadas no formulário de contato")
public class Infos {

    private WebDriver navegador;
    @BeforeEach
    public void beforeEach(){
        // Abrir Navegador Chrome **Verificar a versão do Chrome
        // System.setProperty( "webdriver.chrome.driver","F:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
        // WebDriver navegador = new ChromeDriver();
        // Abrir Navegador Edge
        System.setProperty( "webdriver.chrome.driver","F:\\DRIVERS\\edgedriver_win64\\msedgedriver.exe");
        this.navegador = new EdgeDriver();

        // Abrir o navegador, maximizar a tela e acessa o site Automation
        this.navegador.manage().window().maximize();
        this.navegador.get("https://automationexercise.com/");
    }

    @Test
    @DisplayName("Caso de Teste 4 - Formulário de Contato")
    public void infosFormContato(){
        new FormularioContato(navegador)
                .testPreencheFormularioContato("Bruno Aurelio", "bruno.aurelio@gmail.com", "Acompanhamento do pedido 85698",
                        "Quero saber mais informações do pedido 85698 que foi efetuado e não foi informado um prazo de entrega",
                        "C:\\Users\\bruno\\IdeaProjects\\Automation\\src\\main\\resources\\Imagens\\Screenshot_10.png");
    }

    @AfterEach
    public void afterEach(){
        /*fecha o navegador no final da execução*/
        this.navegador.quit();
    }
}
