package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProgressBarPage {

    private final SelenideElement progressBar = $x("//div[@id='progressBar']/div");
    private final SelenideElement startStopButton = $(By.id("startStopButton"));
    private final SelenideElement resetButton = $(By.id("resetButton"));

    @Step("Clicking 'Start' button")
    public ProgressBarPage clickStartButton() {
        startStopButton.click();
        return this;
    }

    @Step("Clicking 'Stop' button")
    public ProgressBarPage clickStopButton() {
        startStopButton.click();
        return this;
    }

    @Step("Clicking 'Reset' button")
    public ProgressBarPage clickResetButton() {
        resetButton.click();
        return this;
    }

    @Step("Getting 'Progress Bar' value")
    public String getProgressBarValue() {
        return progressBar.getAttribute("aria-valuenow");
    }

    @Step("Waiting 'Progress Bar' filling")
    public ProgressBarPage waitProgressBar(int seconds) {
        sleep(seconds * 1000L);
        return this;
    }

}
