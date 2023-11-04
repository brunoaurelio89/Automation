package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Conta {
    private WebDriver navegador;

    public Conta (WebDriver navegador){
        this.navegador = navegador;
    }

    public CadastroUsuario novoCadastroUsuario (String password, String nome, String sobrenome, String empresa,
        String endereco, String endereco2, String estado, String cidade, String cep, String celular, String dia, String mes, String ano){
//        navegador.findElement(By.cssSelector("input[id='id_gender1']")).click();
//       WebElement RadioButton = navegador.findElement(By.xpath("input[@id='id_gender1']"));
//       RadioButton.click();
//        navegador.findElement(By.id("id_gender1")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        /*Radio Button
        * Selecionando o gênero Mr. | se for gender2 = Mrs*/
        navegador.findElement(By.cssSelector("#id_gender1")).click();
        /*Password*/
        navegador.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        /*Date of Birth drop*/
        navegador.findElement(By.xpath("//select[@id='days']")).sendKeys(dia);
        navegador.findElement(By.xpath("//select[@id='months']")).sendKeys(mes);
        navegador.findElement(By.xpath("//select[@id='years']")).sendKeys(ano);
        /*Checkbox 1 */
        navegador.findElement(By.id("newsletter")).click();
        /*Checkbox 2 */
        navegador.findElement(By.id("optin")).click();
        navegador.findElement(By.cssSelector("input[data-qa='first_name']")).sendKeys(nome);
        navegador.findElement(By.cssSelector("input[data-qa='last_name']")).sendKeys(sobrenome);
        navegador.findElement(By.cssSelector("input[data-qa='company']")).sendKeys(empresa);
        navegador.findElement(By.cssSelector("input[data-qa='address']")).sendKeys(endereco);
        navegador.findElement(By.cssSelector("input[data-qa='address2']")).sendKeys(endereco2);
        /*Country Drop*/
        navegador.findElement(By.id("country")).sendKeys("Singapore");
        navegador.findElement(By.cssSelector("input[data-qa='state")).sendKeys(estado);
        navegador.findElement(By.cssSelector("input[data-qa='city")).sendKeys(cidade);
        navegador.findElement(By.cssSelector("input[data-qa='zipcode")).sendKeys(cep);
        navegador.findElement(By.cssSelector("input[data-qa='mobile_number")).sendKeys(celular);
        navegador.findElement(By.cssSelector("button[data-qa='create-account']")).click();

        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        /*Confirma o cadastro*/
        navegador.findElement(By.cssSelector("a[data-qa='continue-button']")).click();

        /*Adicionando tempo espera para aparecer o ad*/
//        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*Fecha o ad que aparece na tela*/
        navegador.findElement(By.cssSelector("div[id='report-button']")).click();
        //navegador.findElement(By.cssSelector("div[id='dismiss-button']")).click();

        return new CadastroUsuario(navegador);
    }



}
