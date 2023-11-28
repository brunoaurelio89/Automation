package modulos.login;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import paginas.LoginPage;

@DisplayName("Acessar Página de Login e Acessar Conta")
public class UserLoginCadastrado {

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
        this.navegador.get("http://automationexercise.com/");
    }

    @Test
    @DisplayName("Caso de Teste 2 - Login utilizando credenciais corretas")
    public void testLoginUsuarioCadastrado(){
        new LoginPage(navegador)
                .informaUsuarioExistente("bruno.aurelio@gmail.com", "1234567890")
                .clicarLogin()
                .clicarLogout();
    }
    @Test
    @DisplayName("Caso de Teste 3 - Deletar usuário")
    public void testDeletaUsuarioCadastrado(){
        new LoginPage(navegador)
                .informaUsuarioExistente("bruno.aurelio@gmail.com", "1234567890")
                .clicarLogin()
                .clicarDeletarConta();
    }
}
