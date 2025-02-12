package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;

public class TabButtonPage {

    private final SelenideElement sampleHeadingMessage = $(By.id("sampleHeading"));

    @Step("Getting message from 'New Tab' tab")
    public String getSampleHeadingMessage() {
        String message = sampleHeadingMessage.getText();

        closeWindow();

        return message;
    }

}
