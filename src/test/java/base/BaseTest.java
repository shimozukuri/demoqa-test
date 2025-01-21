package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

        Map<String, Object> capabilities = new HashMap<>();
        capabilities.put("enableVNC", true);
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", capabilities);

        Configuration.browserCapabilities = options;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
