package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FramesPage {

    private final SelenideElement frameText = $(By.id("sampleHeading"));


    public String getFirstFrameText() {
        switchTo().frame(0);
        return frameText.getText();
    }

    public String getSecondFrameText() {
        switchTo().frame(1);
        return frameText.getText();
    }

}
