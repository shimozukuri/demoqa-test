package page;

import com.codeborne.selenide.SelenideElement;
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

    public PracticeFormPage fillFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public PracticeFormPage fillLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public PracticeFormPage fillUserEmailField(String email) {
        userEmailField.sendKeys(email);
        return this;
    }

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
        }

        return this;
    }

    public PracticeFormPage fillUserNumberField(String number) {
        userNumberField.sendKeys(number);
        return this;
    }

    public PracticeFormPage fillDateOfBirthInput() {
        dateOfBirthInput.click();
        dateOfBirthMonthDecember.click();
        dateOfBirthYear1969.click();
        dateOfBirthDay28.click();
        return this;
    }

    public PracticeFormPage fillSubjectsField(String subject) {
        subjectsField.sendKeys(subject);
        subjectsField.pressEnter();
        return this;
    }

    public PracticeFormPage selectHobbiesSports() {
        hobbiesSports.click();
        return this;
    }

    public PracticeFormPage selectHobbiesReading() {
        hobbiesReading.click();
        return this;
    }

    public PracticeFormPage selectHobbiesMusic() {
        hobbiesMusic.click();
        return this;
    }

    public PracticeFormPage uploadPicture(File file) {
        uploadPictureField.uploadFile(file);
        return this;
    }

    public PracticeFormPage fillCurrentAddressField(String address) {
        currentAddressField.sendKeys(address);
        return this;
    }

    public PracticeFormPage fillStateField(String state) {
        stateField.sendKeys(state);
        stateField.pressEnter();
        return this;
    }

    public PracticeFormPage fillCityField(String city) {
        cityField.sendKeys(city);
        cityField.pressEnter();
        return this;
    }

    public PracticeFormPage clickSubmitButton() {
        submit.click();
        return this;
    }

    public String getStudentName() {
        return studentName.getText();
    }

    public String getStudentEmail() {
        return studentEmail.getText();
    }

    public String getStudentGender() {
        return studentGender.getText();
    }

    public String getStudentNumber() {
        return studentNumber.getText();
    }

    public String getStudentDateOfBirth() {
        return studentDateOfBirth.getText();
    }

    public String getStudentSubjects() {
        return studentSubjects.getText();
    }

    public String getStudentHobbies() {
        return studentHobbies.getText();
    }

    public String getStudentPicture() {
        return studentPicture.getText();
    }

    public String getStudentAddress() {
        return studentAddress.getText();
    }

    public String getStudentStateAndCity() {
        return studentStateAndCity.getText();
    }

}
