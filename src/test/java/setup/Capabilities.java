package setup;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    public DesiredCapabilities localAndroid(){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "M2010J19CG");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.pure.indosat.care");
        capabilities.setCapability("appActivity", "com.pure.indosat.care.activities.SplashActivity");
        capabilities.setCapability("appium:ignoreHiddenApiPolicyError", "true");

        return capabilities;
    }
}
