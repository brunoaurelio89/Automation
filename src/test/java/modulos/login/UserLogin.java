package modulos.login;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import paginas.CadastroUsuario;
import paginas.Conta;
import paginas.LoginPage;

@DisplayName("Teste web para acessar o login")
public class UserLogin {

    /*Atributo para utilização sempre do navegador*/
    private WebDriver navegador;

    /*Before Each utiliza dentro da função tudo que precisa para o inicio dos testes*/
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
    @DisplayName("Caso de Teste 1 - Acessar página e criar login ")
    public void testRealizarLogin (){

        new LoginPage(navegador)
                .informaUsuario("Bruno","bruno.aurelio@gmail.com")
                .clicarSignup();

        new Conta(navegador)
                .novoCadastroUsuario("1234567890", "Bruno","Aurelio","Bruno Aurelio QA SA",
                        "Rua das Oliveiras","Ao lado de casa",
                        "SP","Araraquara","14811-220","16-998565258","20",
                "April","1989");

    }


//    @AfterEach
//    public void afterEach(){
//        /*fecha o navegador no final da execução*/
//        this.navegador.quit();
//    }
}
