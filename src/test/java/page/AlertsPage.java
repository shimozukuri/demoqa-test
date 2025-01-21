package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AlertsPage {

    private final SelenideElement alertButton = $(By.id("alertButton"));
    private final SelenideElement timerAlertButton = $(By.id("timerAlertButton"));
    private final SelenideElement confirmButton = $(By.id("confirmButton"));
    private final SelenideElement promtButton = $(By.id("promtButton"));
    private final SelenideElement confirmResult = $(By.id("confirmResult"));
    private final SelenideElement promptResult = $(By.id("promptResult"));

    public AlertsPage openAlertMessage() {
        alertButton.click();
        return this;
    }

    public AlertsPage openTimerAlertMessage() {
        timerAlertButton.click();
        Wait().withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        return this;
    }

    public AlertsPage openConfirmMessage() {
        confirmButton.click();
        return this;
    }

    public AlertsPage openPromtMessage() {
        promtButton.click();
        return this;
    }

    public String getMessageText() {
        return switchTo().alert().getText();
    }

    public AlertsPage acceptAlert() {
        switchTo().alert().accept();
        return this;
    }

    public AlertsPage dismissAlert() {
        switchTo().alert().dismiss();
        return this;
    }

    public String getConfirmResult() {
        return confirmResult.getText();
    }

    public AlertsPage fillPromtMessage(String name) {
        switchTo().alert().sendKeys(name);
        return this;
    }

    public String getPromtResult() {
        return promptResult.getText();
    }

}
