package appiumCore;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class driverFactory {
        private static AndroidDriver<MobileElement> driver;
        private static Object IOException;

        public static AndroidDriver<MobileElement> getDriver() {
            if (driver == null) {
                createDriver();

            }
            return driver;
        }

        private static void createDriver() {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("platformVersion", "9.0");
            desiredCapabilities.setCapability("automationName", "uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, "");


            URL remoteUrl = null;
            try {
                remoteUrl = new URL("http://localhost:4723/wd/hub");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
        }

        public static void killDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }




        }

    }



