package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ButtonsPage {

    private final SelenideElement doubleClickButton = $(By.id("doubleClickBtn"));
    private final SelenideElement rightClickButton = $(By.id("rightClickBtn"));
    private final SelenideElement dynamicClickButton = $x("//button[text()='Click Me']");
    private final SelenideElement doubleClickMessage = $(By.id("doubleClickMessage"));
    private final SelenideElement rightClickMessage = $(By.id("rightClickMessage"));
    private final SelenideElement dynamicClickMessage = $(By.id("dynamicClickMessage"));

    public ButtonsPage clickDoubleClickButton() {
        doubleClickButton.doubleClick();
        return this;
    }

    public ButtonsPage clickRightClickButton() {
        rightClickButton.contextClick();
        return this;
    }

    public ButtonsPage clickDynamicClickButton() {
        dynamicClickButton.click();
        return this;
    }

    public String getDoubleClickMessage() {
        return doubleClickMessage.getText();
    }

    public String getRightClickMessage() {
        return rightClickMessage.getText();
    }

    public String getDynamicClickMessage() {
        return dynamicClickMessage.getText();
    }

}
