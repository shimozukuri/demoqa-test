package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;

public class TabButtonPage {

    private final SelenideElement sampleHeadingMessage = $(By.id("sampleHeading"));

    public String getSampleHeadingMessage() {
        String message = sampleHeadingMessage.getText();

        closeWindow();

        return message;
    }

}
