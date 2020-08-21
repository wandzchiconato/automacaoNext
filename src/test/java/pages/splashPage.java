package pages;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class splashPage extends basePage {
    public void selecionarEsteira(){
        clicar(By.id("br.com.bradesco.next:id/back_progress"));
    }
   public void enviarTxtEsteira(String esteira){
        escrever(By.id("android:id/text1"),esteira);
   }
   public void confirmarEsteira(){
        clicar(By.id("br.com.bradesco.next:id/bt_ok"));
   }
   public void clicarJaTenhoConta(){
        clicar(By.id("br.com.bradesco.next:id/nb_enter"));
   }
    public void clicarCriarConta(){
        clicar(By.id("br.com.bradesco.next:id/nb_create_account"));
    }

}
