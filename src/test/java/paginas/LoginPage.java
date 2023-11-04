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

  public LoginPage informaUsuarioNovo(String usuario, String email){
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
      /*Aguarda um espaço de tempo para a mensagem aparecer*/
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      /*IMPLEMENTAR:
      * 01 - Como remover pop up ad
      * 02- Verificar mensagem no final se realmente usuário existe*/

      /*Verificar se a mensagem que vai ser apresentada é de um usuário já cadastrado ou não */
//      String mensagem = navegador.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).getAttribute("innerHTML");
//      String mensagemUsuarioCadastrado = "Email Address already exist!";
//
//      if (mensagem.contains(mensagemUsuarioCadastrado)){
//          System.out.println("Test Case Passed");
//      }else{
//          System.out.println("Test Case Failed");
//      }

      return new Conta(navegador); /*Retorna e direciona para a nova página onde será preenchido os dados da conta*/
  }
  public LoginPage clicarLogin(){
      navegador.findElement(By.cssSelector("button[data-qa='login-button']")).click();
      /*Aguarda um espaço de tempo para a mensagem aparecer*/
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      return this;
  }

    public LoginPage informaUsuarioExistente(String email, String senha){
      /* Clicar em Signup / Login | Informa um E-mail e Senha que já foi cadastrado */
        navegador.findElement(By.cssSelector("div ul li a[href=\"/login\"]")).click();

        /*Informa E-mail e Senha para acessar*/
        navegador.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys(email);
        navegador.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(senha);
        return this; /* Para retornar e ficar na mesma página*/
    }

    public LoginPage clicarLogout(){
        navegador.findElement(By.cssSelector("div ul li a[href=\"/logout\"]")).click();
        return this;
    }

    public LoginPage clicarDeletarConta(){
        navegador.findElement(By.cssSelector("div ul li a[href=\"/delete_account\"]")).click();
        return this;
    }
}
