package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    private final SelenideElement usernameField = $(By.id("userName"));
    private final SelenideElement emailField = $(By.id("userEmail"));
    private final SelenideElement currentAddressField = $x("//textarea[@id='currentAddress']");
    private final SelenideElement permanentAddressField = $x("//textarea[@id='permanentAddress']");
    private final SelenideElement submitButton = $(By.id("submit"));
    private final SelenideElement name = $(By.id("name"));
    private final SelenideElement email = $(By.id("email"));
    private final SelenideElement currentAddress = $x("//p[@id='currentAddress']");
    private final SelenideElement permanentAddress = $x("//p[@id='permanentAddress']");

    @Step("Filling 'Full Name' field")
    public TextBoxPage fillUsernameField(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    @Step("Filling 'Email' field")
    public TextBoxPage fillEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    @Step("Filling 'Current Address' field")
    public TextBoxPage fillCurrentAddressField(String currentAddress) {
        currentAddressField.sendKeys(currentAddress);
        return this;
    }

    @Step("Filling 'Permanent Address' field")
    public TextBoxPage fillPermanentAddressField(String permanentAddress) {
        permanentAddressField.sendKeys(permanentAddress);
        return this;
    }

    @Step("Clicking 'Submit' button")
    public TextBoxPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    @Step("Getting 'Name' result value")
    public String getName() {
        return name.getText().split(":")[1];
    }

    @Step("Getting 'Email' result value")
    public String getEmail() {
        return email.getText().split(":")[1];
    }

    @Step("Getting 'Current Address' result value")
    public String getCurrentAddress() {
        return currentAddress.getText().split(":")[1];
    }

    @Step("Getting 'Permanent' result value")
    public String getPermanentAddress() {
        return permanentAddress.getText().split(":")[1];
    }

}
