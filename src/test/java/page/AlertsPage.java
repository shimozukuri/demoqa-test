package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class AlertsPage {

    private final SelenideElement alertButton = $(By.id("alertButton"));
    private final SelenideElement timerAlertButton = $(By.id("timerAlertButton"));
    private final SelenideElement confirmButton = $(By.id("confirmButton"));
    private final SelenideElement promtButton = $(By.id("promtButton"));
    private final SelenideElement confirmResult = $(By.id("confirmResult"));
    private final SelenideElement promptResult = $(By.id("promptResult"));

    @Step("Opening 'Alert' message")
    public AlertsPage openAlertMessage() {
        alertButton.click();
        return this;
    }

    @Step("Opening 'Timer Alert' message")
    public AlertsPage openTimerAlertMessage() {
        timerAlertButton.click();
        Wait().withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        return this;
    }

    @Step("Opening 'Confirm' message")
    public AlertsPage openConfirmMessage() {
        confirmButton.click();
        return this;
    }

    @Step("Opening 'Promt' message")
    public AlertsPage openPromtMessage() {
        promtButton.click();
        return this;
    }

    @Step("Getting alert message text")
    public String getMessageText() {
        return switchTo().alert().getText();
    }

    @Step("Accepting alert")
    public AlertsPage acceptAlert() {
        switchTo().alert().accept();
        return this;
    }

    @Step("Dismissing alert")
    public AlertsPage dismissAlert() {
        switchTo().alert().dismiss();
        return this;
    }

    @Step("Getting 'Confirm' alert text")
    public String getConfirmResult() {
        return confirmResult.getText();
    }

    @Step("Filling 'promt' message field")
    public AlertsPage fillPromtMessage(String name) {
        switchTo().alert().sendKeys(name);
        return this;
    }

    @Step("Getting 'Promt' alert text")
    public String getPromtResult() {
        return promptResult.getText();
    }

}
