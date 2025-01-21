package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage {

    private final SelenideElement textBoxCard = $(By.id("item-0"));
    private final SelenideElement radioButtonCard = $(By.id("item-2"));
    private final SelenideElement buttonsCard = $(By.id("item-4"));

    public TextBoxPage openTextBoxPage() {
        textBoxCard.click();
        return new TextBoxPage();
    }

    public RadioButtonPage openRadioButtonPage() {
        radioButtonCard.click();
        return new RadioButtonPage();
    }

    public ButtonsPage openButtonsPage() {
        buttonsCard.click();
        return new ButtonsPage();
    }

}
