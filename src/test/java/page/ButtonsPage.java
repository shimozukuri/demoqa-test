package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
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

    @Step("Clicking 'Double Click Me' button")
    public ButtonsPage clickDoubleClickButton() {
        doubleClickButton.doubleClick();
        return this;
    }

    @Step("Clicking 'Right Click Me' button")
    public ButtonsPage clickRightClickButton() {
        rightClickButton.contextClick();
        return this;
    }

    @Step("Clicking 'Click Me' button")
    public ButtonsPage clickDynamicClickButton() {
        dynamicClickButton.click();
        return this;
    }

    @Step("Getting 'Double Click Me' message")
    public String getDoubleClickMessage() {
        return doubleClickMessage.getText();
    }

    @Step("Getting 'Right Click Me' message")
    public String getRightClickMessage() {
        return rightClickMessage.getText();
    }

    @Step("Getting 'Click Me' message")
    public String getDynamicClickMessage() {
        return dynamicClickMessage.getText();
    }

}
