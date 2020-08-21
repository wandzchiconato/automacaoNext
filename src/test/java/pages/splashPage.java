package pages;

import appiumCore.basePage;
import appiumCore.driverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class splashPage extends basePage {
    public void selecionarEsteira() {
        clicar(By.id("br.com.bradesco.next:id/back_progress"));

        //AndroidTouchAction touch = new AndroidTouchAction (driverFactory.getDriver());
        //touch.longPress(LongPressOptions.longPressOptions()
          //      .withElement (ElementOption.element ())
            //    .perform ());
    }

    public void enviarTxtEsteira(String esteira) {
        escrever(By.id("android:id/text1"), esteira);
    }

    public void confirmarEsteira() {
        clicar(By.id("br.com.bradesco.next:id/bt_ok"));
    }

    public void clicarJaTenhoConta() {
        clicar(By.id("br.com.bradesco.next:id/nb_enter"));
    }

    public void clicarCriarConta() {
        clicar(By.id("br.com.bradesco.next:id/nb_create_account"));
    }

    public void validarTitulo() {
        obterTexto(By.id("br.com.bradesco.next:id/iv_next"));
    }

}
