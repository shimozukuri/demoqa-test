package page;

import com.codeborne.selenide.SelenideElement;
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

    public TextBoxPage fillUsernameField(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public TextBoxPage fillEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public TextBoxPage fillCurrentAddress(String currentAddress) {
        currentAddressField.sendKeys(currentAddress);
        return this;
    }

    public TextBoxPage fillPermanentAddress(String permanentAddress) {
        permanentAddressField.sendKeys(permanentAddress);
        return this;
    }

    public TextBoxPage submit() {
        submitButton.click();
        return this;
    }

    public String getName() {
        return name.getText().split(":")[1];
    }

    public String getEmail() {
        return email.getText().split(":")[1];
    }

    public String getCurrentAddress() {
        return currentAddress.getText().split(":")[1];
    }

    public String getPermanentAddress() {
        return permanentAddress.getText().split(":")[1];
    }

}
