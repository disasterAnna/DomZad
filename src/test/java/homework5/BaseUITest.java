package homework5;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseUITest {
    WebDriver driver;

    @BeforeTest
    public void beforeT() {
        System.out.println("Действие перед началом UI теста");
        //указываем на драйвер хрома - что-то типа map
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        ChromeOptions chrmOpt = new ChromeOptions();
//        DesiredCapabilities dc = DesiredCapabilities.chrome(); не нужОн он туть
        chrmOpt.setCapability(ChromeOptions.CAPABILITY, chrmOpt);
        driver = new ChromeDriver();

//        chrmOpt.setCapability("version","99.0");
//
//        URL hub = null;
//        try {
//            hub = new URL("http://localhost:4444/wd/hub");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//        driver = new RemoteWebDriver(hub,chrmOpt);
    }


    @AfterTest
    public void afterT() {
        System.out.println("Действие после UI теста");
        driver.quit();
        if (driver != null) {
            driver.quit(); //Иногда бывает сразу не закрывает (с)
        }
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
