package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FramesPage {

    private final SelenideElement frameText = $(By.id("sampleHeading"));

    @Step("Getting first frame text")
    public String getFirstFrameText() {
        switchTo().frame(0);
        return frameText.getText();
    }

    @Step("Getting second frame text")
    public String getSecondFrameText() {
        switchTo().frame(1);
        return frameText.getText();
    }

}
