package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Conta {
    private WebDriver navegador;

    public Conta (WebDriver navegador){
        this.navegador = navegador;
    }

    public CadastroUsuario novoCadastroUsuario (String password, String nome, String sobrenome, String empresa,
        String endereco, String endereco2, String estado, String cidade, String cep, String celular){
//        navegador.findElement(By.cssSelector("input[id='id_gender1']")).click();
//       WebElement RadioButton = navegador.findElement(By.xpath("input[@id='id_gender1']"));
//       RadioButton.click();
//        navegador.findElement(By.id("id_gender1")).click();

        navegador.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        /*Date of Birth*/
        /*Checkbox 1 */
        /*Checkbox 2 */
        navegador.findElement(By.cssSelector("input[data-qa='first_name']")).sendKeys(nome);
        navegador.findElement(By.cssSelector("input[data-qa='last_name']")).sendKeys(sobrenome);
        navegador.findElement(By.cssSelector("input[data-qa='company']")).sendKeys(empresa);
        navegador.findElement(By.cssSelector("input[data-qa='address']")).sendKeys(endereco);
        navegador.findElement(By.cssSelector("input[data-qa='address2']")).sendKeys(endereco2);
        /*Country*/
        navegador.findElement(By.cssSelector("input[data-qa='state")).sendKeys(estado);
        navegador.findElement(By.cssSelector("input[data-qa='city")).sendKeys(cidade);
        navegador.findElement(By.cssSelector("input[data-qa='zipcode")).sendKeys(cep);
        navegador.findElement(By.cssSelector("input[data-qa='mobile_number")).sendKeys(celular);

        return new CadastroUsuario(navegador);
    }
}
