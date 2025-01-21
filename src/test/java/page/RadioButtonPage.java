package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonPage {

    private final SelenideElement yesRadio = $x("//input[@id = 'yesRadio']/..");
    private final SelenideElement noRadio = $x("//input[@id = 'impressiveRadio']/..");
    private final SelenideElement textSuccess = $(By.className("text-success"));

    public RadioButtonPage clickYesRadio() {
        yesRadio.click();
        return this;
    }

    public RadioButtonPage clickImpressiveRadio() {
        noRadio.click();
        return this;
    }

    public String getTextSuccess() {
        return textSuccess.getText();
    }

}
