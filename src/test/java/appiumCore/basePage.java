package appiumCore;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.List;

import static appiumCore.driverFactory.getDriver;

public class basePage {
    public void escrever(By by, String texto) {
        getDriver().findElement(by).sendKeys(texto);
    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();

    }

    public void clicar(By by) {
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto) {
        clicar(By.xpath("//*[@text='" + texto + "']"));
    }


    public void clicarPorIndex(int index) {
        List<MobileElement> elementosencontrados = getDriver().findElements(By.className("android.widget.TextView"));
        elementosencontrados.get(index).click();
    }

    public void clicarLongo(){

    }

    public void selecionarCombo(By by, String valor) {
        getDriver().findElement(by).click();
        clicarPorTexto(valor);

    }

    public boolean isCheckMarcado(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");

    }

    public boolean validarElementoTexto(String texto) {
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
        return elementos.size() > 0;
    }
}