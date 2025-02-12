package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WindowButtonPage {

    private final SelenideElement sampleHeadingMessage = $(By.id("sampleHeading"));

    @Step("Getting message from 'New Window' window")
    public String getSampleHeadingMessage() {
        return sampleHeadingMessage.getText();
    }

}
