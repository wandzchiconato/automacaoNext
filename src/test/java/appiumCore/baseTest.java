package appiumCore;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import steps.login;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class baseTest extends driverFactory {


    @AfterClass

    public void fecharAppium() throws IOException {
        print();
        driverFactory.killDriver();
    }

    public void print() throws IOException {

        login testname = new login();//verificar
        String caminhoPrint = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
        File foto = ((TakesScreenshot) driverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(foto, new File("out/prints/" + caminhoPrint + "/" + testname + ".png"));
    }

    public void esperar(long tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}