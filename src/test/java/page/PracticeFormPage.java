package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {

    private final SelenideElement firstNameField = $(By.id("firstName"));
    private final SelenideElement lastNameField = $(By.id("lastName"));
    private final SelenideElement userEmailField = $(By.id("userEmail"));
    private final SelenideElement genderMaleRadio = $x("//input[@id='gender-radio-1']/..");
    private final SelenideElement genderFemaleRadio = $x("//input[@id='gender-radio-2']/..");
    private final SelenideElement genderOtherRadio = $x("//input[@id='gender-radio-3']/..");
    private final SelenideElement userNumberField = $(By.id("userNumber"));
    private final SelenideElement dateOfBirthInput = $(By.id("dateOfBirthInput"));
    private final SelenideElement dateOfBirthMonthDecember = $x("//option[@value='11']");
    private final SelenideElement dateOfBirthYear1969 = $x("//option[@value='1969']");
    private final SelenideElement dateOfBirthDay28 = $x("//div[text()='28']");
    private final SelenideElement subjectsField = $(By.id("subjectsInput"));
    private final SelenideElement hobbiesSports = $x("//input[@id='hobbies-checkbox-1']/..");
    private final SelenideElement hobbiesReading = $x("//input[@id='hobbies-checkbox-2']/..");
    private final SelenideElement hobbiesMusic = $x("//input[@id='hobbies-checkbox-3']/..");
    private final SelenideElement uploadPictureField = $x("//input[@id='uploadPicture']");
    private final SelenideElement currentAddressField = $(By.id("currentAddress"));
    private final SelenideElement stateField = $(By.id("react-select-3-input"));
    private final SelenideElement cityField = $(By.id("react-select-4-input"));
    private final SelenideElement submit = $(By.id("submit"));
    private final SelenideElement studentName = $x("//td[text()='Student Name']/../td[2]");
    private final SelenideElement studentEmail = $x("//td[text()='Student Email']/../td[2]");
    private final SelenideElement studentGender = $x("//td[text()='Gender']/../td[2]");
    private final SelenideElement studentNumber = $x("//td[text()='Mobile']/../td[2]");
    private final SelenideElement studentDateOfBirth = $x("//td[text()='Date of Birth']/../td[2]");
    private final SelenideElement studentSubjects = $x("//td[text()='Subjects']/../td[2]");
    private final SelenideElement studentHobbies = $x("//td[text()='Hobbies']/../td[2]");
    private final SelenideElement studentPicture = $x("//td[text()='Picture']/../td[2]");
    private final SelenideElement studentAddress = $x("//td[text()='Address']/../td[2]");
    private final SelenideElement studentStateAndCity = $x("//td[text()='State and City']/../td[2]");

    @Step("Filling 'First Name' field")
    public PracticeFormPage fillFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    @Step("Filling 'Last Name' field")
    public PracticeFormPage fillLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    @Step("Filling 'Email' field")
    public PracticeFormPage fillUserEmailField(String email) {
        userEmailField.sendKeys(email);
        return this;
    }

    @Step("Clicking 'Gender' button")
    public PracticeFormPage selectGender(String gender) {
        switch (gender) {
            case "Male":
                genderMaleRadio.click();
                return this;
            case "Female":
                genderFemaleRadio.click();
                return this;
            case "Other":
                genderOtherRadio.click();
                return this;
            default:
                return this;
        }
    }

    @Step("Filling 'Mobile' field")
    public PracticeFormPage fillUserNumberField(String number) {
        userNumberField.sendKeys(number);
        return this;
    }

    @Step("Specifying date of birth")
    public PracticeFormPage fillDateOfBirthInput() {
        dateOfBirthInput.click();
        dateOfBirthMonthDecember.click();
        dateOfBirthYear1969.click();
        dateOfBirthDay28.click();
        return this;
    }

    @Step("Filling 'Subjects' field")
    public PracticeFormPage fillSubjectsField(String subject) {
        subjectsField.sendKeys(subject);
        subjectsField.pressEnter();
        return this;
    }

    @Step("Selecting 'Hobbies - Sports' check box")
    public PracticeFormPage selectHobbiesSports() {
        hobbiesSports.click();
        return this;
    }

    @Step("Selecting 'Hobbies - Reading' check box")
    public PracticeFormPage selectHobbiesReading() {
        hobbiesReading.click();
        return this;
    }

    @Step("Selecting 'Hobbies - Music' check box")
    public PracticeFormPage selectHobbiesMusic() {
        hobbiesMusic.click();
        return this;
    }

    @Step("Uploading picture")
    public PracticeFormPage uploadPicture(File file) {
        uploadPictureField.uploadFile(file);
        return this;
    }

    @Step("Filling 'Current Address' field")
    public PracticeFormPage fillCurrentAddressField(String address) {
        currentAddressField.sendKeys(address);
        return this;
    }

    @Step("Filling 'State' field")
    public PracticeFormPage fillStateField(String state) {
        stateField.sendKeys(state);
        stateField.pressEnter();
        return this;
    }

    @Step("Filling 'City' field")
    public PracticeFormPage fillCityField(String city) {
        cityField.sendKeys(city);
        cityField.pressEnter();
        return this;
    }

    @Step("Clicking 'Submit' button")
    public PracticeFormPage clickSubmitButton() {
        submit.click();
        return this;
    }

    @Step("Getting resulting 'Student Name' value")
    public String getStudentName() {
        return studentName.getText();
    }

    @Step("Getting resulting 'Student Email' value")
    public String getStudentEmail() {
        return studentEmail.getText();
    }

    @Step("Getting resulting 'Gender' value")
    public String getStudentGender() {
        return studentGender.getText();
    }

    @Step("Getting resulting 'Mobile' value")
    public String getStudentNumber() {
        return studentNumber.getText();
    }

    @Step("Getting resulting 'Date of Birth' value")
    public String getStudentDateOfBirth() {
        return studentDateOfBirth.getText();
    }

    @Step("Getting resulting 'Subjects' value")
    public String getStudentSubjects() {
        return studentSubjects.getText();
    }

    @Step("Getting resulting 'Hobbies' value")
    public String getStudentHobbies() {
        return studentHobbies.getText();
    }

    @Step("Getting resulting 'Picture' value")
    public String getStudentPicture() {
        return studentPicture.getText();
    }

    @Step("Getting resulting 'Address' value")
    public String getStudentAddress() {
        return studentAddress.getText();
    }

    @Step("Getting resulting 'State and City' value")
    public String getStudentStateAndCity() {
        return studentStateAndCity.getText();
    }

}
