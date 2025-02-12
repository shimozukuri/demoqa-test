package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    @BeforeClass
    public void setUp(ITestContext context) {
        Configuration.remote = "http://selenoid:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;

        Map<String, Object> capabilities = new HashMap<>();
        capabilities.put("enableVNC", true);
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", capabilities);

        Configuration.browserCapabilities = options;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Arrays.stream(context.getAllTestMethods()).forEach(i -> i.setRetryAnalyzerClass(TestRetry.class));
    }

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            attachScreenshot();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }

}
