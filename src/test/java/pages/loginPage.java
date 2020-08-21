package pages;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class loginPage extends basePage {

    public void digitarCPF(String CPF) {
        escrever(By.id("br.com.bradesco.next:id/et_username"), CPF);
    }
    public void digitarSenha(String Senha) {
        escrever(By.id("br.com.bradesco.next:id/et_password"), Senha);
    }
    public void clicarEntrar(){
        clicar(By.id("br.com.bradesco.next:id/bt_login"));
    }

}


