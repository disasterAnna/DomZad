package homework8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseUITest {
    WebDriver driver;

    @BeforeTest
    public void beforeT() {
        System.out.println("Действие перед началом UI теста");

        FirefoxOptions frfOpt = new FirefoxOptions();

        frfOpt.setCapability(FirefoxOptions.FIREFOX_OPTIONS, frfOpt);
        frfOpt.setCapability("version","98.0");

        URL hub;
        try {
            hub = new URL("http://127.0.0.1:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        driver = new RemoteWebDriver(hub, frfOpt);
    }


    @AfterTest
    public void afterT() {
        System.out.println("Действие после UI теста");
        driver.quit();
        if (driver != null) {
            driver.quit(); //Иногда бывает сразу не закрывает (с)
        }
        System.out.println("Nikolas, see build settings on src/main/resources/screenForNikolas.png");
    }

    public WebDriver getDriver() {
        return driver;
    }

//
//
//
//    @Attachment(value = "Page screenshot", type = "image/png")
//    public byte[] getScreenshot(){
//        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    }
//
//    @BeforeMethod
//    public void beforeM(){
//        System.out.println("Действие перед вызовом метода");
//    }
//
//    @AfterMethod
//    public void afterM(){
//        System.out.println("Действие после вызова метода");
//    }
}
