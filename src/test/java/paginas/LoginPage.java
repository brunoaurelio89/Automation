package paginas;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*Padrão Page Objects - Design Patterns
* */
public class LoginPage {
  private WebDriver navegador;

  public LoginPage (WebDriver navegador){
      this.navegador = navegador;
  }

  public LoginPage informaUsuario(String usuario, String email){
      /* Clicar em Signup / Login | Informa um Nome e E-mail
           Para buscar essa tag a href é necessário ir cascateando para chegar nela, indo na div para ul depois il depois na a href
           pesquisa por " div ul li a[href='/login'] " */
      navegador.findElement(By.cssSelector("div ul li a[href=\"/login\"]")).click();

      /*Informa Nome e E-mail para criação*/
      navegador.findElement(By.cssSelector("input[type='text']")).sendKeys(usuario);
      navegador.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys(email);
    return this; /* Para retornar e ficar na mesma página*/
  }

  public Conta clicarSignup(){
      navegador.findElement(By.cssSelector("button[data-qa='signup-button']")).click();

      return new Conta(navegador); /*Retorna e direciona para a nova página onde será preenchido os dados da conta*/
  }
}
