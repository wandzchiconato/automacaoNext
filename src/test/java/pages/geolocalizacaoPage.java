package pages;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class geolocalizacaoPage extends basePage {

    public void clicarBtnOk(){
        clicar(By.id("br.com.bradesco.next:id/bt_next"));
    }

    public void allowAccess(){
        clicar(By.id("com.android.packageinstaller:id/permission_allow_button"));
    }
}
