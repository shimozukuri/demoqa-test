package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WindowButtonPage {

    private final SelenideElement sampleHeadingMessage = $(By.id("sampleHeading"));

    public String getSampleHeadingMessage() {
        return sampleHeadingMessage.getText();
    }

}
