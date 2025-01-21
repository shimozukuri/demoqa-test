import base.BaseTest;
import org.testng.annotations.Test;
import page.*;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class DemoqaTest extends BaseTest {

    @Test
    public void textBoxTest() {
        String name = "Demo";
        String email = "demo@demo.qa";
        String currentAddress = "Moscow";
        String permanentAddress = "Moscow";

        TextBoxPage textBoxPage = new MainPage()
                .openElementPage()
                .openTextBoxPage()
                .fillUsernameField(name)
                .fillEmailField(email)
                .fillCurrentAddress(currentAddress)
                .fillPermanentAddress(permanentAddress)
                .submit();

        assertEquals(name, textBoxPage.getName());
        assertEquals(email, textBoxPage.getEmail());
        assertEquals(currentAddress, textBoxPage.getCurrentAddress());
        assertEquals(permanentAddress, textBoxPage.getPermanentAddress());
    }

    @Test
    public void radioButtonYesTest() {
       String successText = "Yes";

       RadioButtonPage radioButtonPage = new MainPage()
               .openElementPage()
               .openRadioButtonPage()
               .clickYesRadio();

       assertEquals(successText, radioButtonPage.getTextSuccess());
    }

    @Test
    public void radioButtonImpressiveTest() {
        String successText = "Impressive";

        RadioButtonPage radioButtonPage = new MainPage()
                .openElementPage()
                .openRadioButtonPage()
                .clickImpressiveRadio();

        assertEquals(successText, radioButtonPage.getTextSuccess());
    }

    @Test
    public void buttonsTest() {
        String message = "You have done a ";
        String doubleClickMessage = "double click";
        String rightClickMessage = "right click";
        String dynamicClickMessage = "dynamic click";

        ButtonsPage buttonsPage = new MainPage()
                .openElementPage()
                .openButtonsPage()
                .clickDoubleClickButton()
                .clickRightClickButton()
                .clickDynamicClickButton();

        assertEquals(message + doubleClickMessage, buttonsPage.getDoubleClickMessage());
        assertEquals(message + rightClickMessage, buttonsPage.getRightClickMessage());
        assertEquals(message + dynamicClickMessage, buttonsPage.getDynamicClickMessage());
    }

    @Test
    public void practiceFormTest() {
        String studentFirstName = "Linus";
        String studentLastName = "Torvalds";
        String studentEmail = "linus@demo.qa";
        String studentGender = "Male";
        String studentNumber = "8888888888";
        String studentDateOfBirth = "28 December,1969";
        String studentSubject = "Computer Science";
        String studentHobby = "Reading";
        File studentPicture = new File("src/test/resources/picture/picture.jpg");
        String studentCurrentAddress = "Helsinki";
        String studentState = "NCR";
        String studentCity = "Delhi";

        PracticeFormPage practiceFormPage = new MainPage()
                .openFormsPage()
                .openPracticeFormPage()
                .fillFirstNameField(studentFirstName)
                .fillLastNameField(studentLastName)
                .fillUserEmailField(studentEmail)
                .selectGender(studentGender)
                .fillUserNumberField(studentNumber)
                .fillDateOfBirthInput()
                .fillSubjectsField(studentSubject)
                .selectHobbiesReading()
                .uploadPicture(studentPicture)
                .fillCurrentAddressField(studentCurrentAddress)
                .fillStateField(studentState)
                .fillCityField(studentCity)
                .clickSubmitButton();

        assertEquals(studentFirstName + " " + studentLastName, practiceFormPage.getStudentName());
        assertEquals(studentEmail, practiceFormPage.getStudentEmail());
        assertEquals(studentGender, practiceFormPage.getStudentGender());
        assertEquals(studentNumber, practiceFormPage.getStudentNumber());
        assertEquals(studentDateOfBirth, practiceFormPage.getStudentDateOfBirth());
        assertEquals(studentSubject, practiceFormPage.getStudentSubjects());
        assertEquals(studentHobby, practiceFormPage.getStudentHobbies());
        assertEquals(studentPicture.getName(), practiceFormPage.getStudentPicture());
        assertEquals(studentCurrentAddress, practiceFormPage.getStudentAddress());
        assertEquals(studentState + " " + studentCity, practiceFormPage.getStudentStateAndCity());
    }

    @Test
    public void browserWindowsTabButtonTest() {
        String message = "This is a sample page";

        TabButtonPage tabButtonPage = new MainPage()
                .openWindowsPage()
                .openBrowserWindowsPage()
                .openTabButtonPage();

        assertEquals(message, tabButtonPage.getSampleHeadingMessage());
    }

    @Test
    public void browserWindowsWindowButtonTest() {
        String message = "This is a sample page";

        WindowButtonPage windowButtonPage = new MainPage()
                .openWindowsPage()
                .openBrowserWindowsPage()
                .openWindowButtonPage();

        assertEquals(message, windowButtonPage.getSampleHeadingMessage());
    }

    @Test
    public void alertMessageTest() {
        String message = "You clicked a button";

        String actualMessage = new MainPage()
                .openWindowsPage()
                .openAlertsPage()
                .openAlertMessage()
                .getMessageText();

        assertEquals(message, actualMessage);
    }

    @Test
    public void timerAlertMessageTest() {
        String message = "This alert appeared after 5 seconds";

        String actualMessage = new MainPage()
                .openWindowsPage()
                .openAlertsPage()
                .openTimerAlertMessage()
                .getMessageText();

        assertEquals(message, actualMessage);
    }

    @Test
    public void confirmAcceptAlertMessageTest() {
        String result = "You selected Ok";

        String actualResult = new MainPage()
                .openWindowsPage()
                .openAlertsPage()
                .openConfirmMessage()
                .acceptAlert()
                .getConfirmResult();

        assertEquals(result, actualResult);
    }

    @Test
    public void confirmDismissAlertMessageTest() {
        String result = "You selected Cancel";

        String actualResult = new MainPage()
                .openWindowsPage()
                .openAlertsPage()
                .openConfirmMessage()
                .dismissAlert()
                .getConfirmResult();

        assertEquals(result, actualResult);
    }

    @Test
    public void promtAlertMessageTest() {
        String name = "Linus";
        String result = "You entered ";

        String actualResult = new MainPage()
                .openWindowsPage()
                .openAlertsPage()
                .openPromtMessage()
                .fillPromtMessage(name)
                .getPromtResult();

        assertEquals(result + name, actualResult);
    }

    @Test
    public void firstFrameTest() {
        String text = "This is a sample page";

        String actualText = new MainPage()
                .openWindowsPage()
                .openFramesPage()
                .getFirstFrameText();

        assertEquals(text, actualText);
    }

    @Test
    public void secondFrameTest() {
        String text = "This is a sample page";

        String actualText = new MainPage()
                .openWindowsPage()
                .openFramesPage()
                .getSecondFrameText();

        assertEquals(text, actualText);
    }

}
