package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage {

    private final SelenideElement textBoxCard = $(By.id("item-0"));
    private final SelenideElement radioButtonCard = $(By.id("item-2"));
    private final SelenideElement buttonsCard = $(By.id("item-4"));

    @Step("Opening 'Text Box' page")
    public TextBoxPage openTextBoxPage() {
        textBoxCard.click();
        return new TextBoxPage();
    }

    @Step("Opening 'Radio Button' page")
    public RadioButtonPage openRadioButtonPage() {
        radioButtonCard.click();
        return new RadioButtonPage();
    }

    @Step("Opening 'Buttons' page")
    public ButtonsPage openButtonsPage() {
        buttonsCard.click();
        return new ButtonsPage();
    }

}
