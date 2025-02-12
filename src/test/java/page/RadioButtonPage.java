package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonPage {

    private final SelenideElement yesRadio = $x("//input[@id = 'yesRadio']/..");
    private final SelenideElement noRadio = $x("//input[@id = 'impressiveRadio']/..");
    private final SelenideElement textSuccess = $(By.className("text-success"));

    @Step("Clicking 'Yes' button")
    public RadioButtonPage clickYesRadio() {
        yesRadio.click();
        return this;
    }

    @Step("Clicking 'Impressive' button")
    public RadioButtonPage clickImpressiveRadio() {
        noRadio.click();
        return this;
    }

    @Step("Getting message")
    public String getTextSuccess() {
        return textSuccess.getText();
    }

}
