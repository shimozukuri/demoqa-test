import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;
import page.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DemoqaTest extends BaseTest {

    @Test
    @Owner("shimozukuri")
    @Description("All fields are filled in and the results are checked")
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
                .fillCurrentAddressField(currentAddress)
                .fillPermanentAddressField(permanentAddress)
                .clickSubmitButton();

        assertEquals(name, textBoxPage.getName());
        assertEquals(email, textBoxPage.getEmail());
        assertEquals(currentAddress, textBoxPage.getCurrentAddress());
        assertEquals(permanentAddress, textBoxPage.getPermanentAddress());
    }

    @Test
    @Owner("shimozukuri")
    @Description("The 'Yes' button is pressed and the output text is checked")
    public void radioButtonYesTest() {
        String text = "Ye";

        String actualText = new MainPage()
                .openElementPage()
                .openRadioButtonPage()
                .clickYesRadio()
                .getTextSuccess();

        assertEquals(text, actualText);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The 'Impressive' button is pressed and the output text is checked")
    public void radioButtonImpressiveTest() {
        String text = "Impressive";

        String actualText = new MainPage()
                .openElementPage()
                .openRadioButtonPage()
                .clickImpressiveRadio()
                .getTextSuccess();

        assertEquals(text, actualText);
    }

    @Test
    @Owner("shimozukuri")
    @Description("All buttons are pressed and the output text is checked")
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
    @Owner("shimozukuri")
    @Description("The form is filled out completely and the results are checked")
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
    @Owner("shimozukuri")
    @Description("The button is pressed, the tab opens and the text is checked from it")
    public void browserWindowsTabButtonTest() {
        String message = "This is a sample page";

        String actualMessage = new MainPage()
                .openWindowsPage()
                .openBrowserWindowsPage()
                .openTabButtonPage()
                .getSampleHeadingMessage();

        assertEquals(message, actualMessage);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The button is pressed, the window opens and the text is checked from it")
    public void browserWindowsWindowButtonTest() {
        String message = "This is a sample page";

        WindowButtonPage windowButtonPage = new MainPage()
                .openWindowsPage()
                .openBrowserWindowsPage()
                .openWindowButtonPage();

        assertEquals(message, windowButtonPage.getSampleHeadingMessage());
    }

    @Test
    @Owner("shimozukuri")
    @Description("The button is pressed and the text of the alert message is checked")
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
    @Owner("shimozukuri")
    @Description("The button is pressed and after waiting, the text of the alert message is checked")
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
    @Owner("shimozukuri")
    @Description("The button is pressed, the alert message is accept and the output text is checked")
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
    @Owner("shimozukuri")
    @Description("The button is pressed, the alert message is dismiss and the output text is checked")
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
    @Owner("shimozukuri")
    @Description("The button is pressed, the alert message field is filled in and the output text is checked")
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
    @Owner("shimozukuri")
    @Description("The text is obtained from the first frame and checked")
    public void firstFrameTest() {
        String text = "This is a sample page";

        String actualText = new MainPage()
                .openWindowsPage()
                .openFramesPage()
                .getFirstFrameText();

        assertEquals(text, actualText);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The text is obtained from the second frame and checked")
    public void secondFrameTest() {
        String text = "This is a sample page";

        String actualText = new MainPage()
                .openWindowsPage()
                .openFramesPage()
                .getSecondFrameText();

        assertEquals(text, actualText);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The first text block is opened and the text is checked")
    public void accordianFirstBlockTest() {
        String sentence = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

        String text = new MainPage()
                .openWidgetsPage()
                .openAccordianPage()
                .clickSecondSectionBlock()
                .clickFirstSectionBlock()
                .getFirstSectionContent();

        assertTrue(text.contains(sentence));
    }

    @Test
    @Owner("shimozukuri")
    @Description("The second text block is opened and the text is checked")
    public void accordianSecondBlockTest() {
        String sentence = "Contrary to popular belief, Lorem Ipsum is not simply random text.";

        String text = new MainPage()
                .openWidgetsPage()
                .openAccordianPage()
                .clickSecondSectionBlock()
                .getSecondSectionContent();

        assertTrue(text.contains(sentence));
    }

    @Test
    @Owner("shimozukuri")
    @Description("The third text block is opened and the text is checked")
    public void accordianThirdBlockTest() {
        String sentence = "It is a long established fact that a reader will be distracted";

        String text = new MainPage()
                .openWidgetsPage()
                .openAccordianPage()
                .clickThirdSectionBlock()
                .getThirdSectionContent();

        assertTrue(text.contains(sentence));
    }

    @Test
    @Owner("shimozukuri")
    @Description("Moves the slider to the minimum and the value is checked")
    public void sliderMinTest() {
        String value = "0";

        String actualValue = new MainPage()
                .openWidgetsPage()
                .openSliderPage()
                .moveSlider("min")
                .getSliderValue();

        assertEquals(value, actualValue);
    }

    @Test
    @Owner("shimozukuri")
    @Description("Moves the slider to the maximum and the value is checked")
    public void sliderMaxTest() {
        String value = "100";

        String actualValue = new MainPage()
                .openWidgetsPage()
                .openSliderPage()
                .moveSlider("max")
                .getSliderValue();

        assertEquals(value, actualValue);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The start button is pressed and after 5 seconds the stop button is pressed and the value is checked")
    public void progressBarHalfTest() {
        String value = "50";

        String actualValue = new MainPage()
                .openWidgetsPage()
                .openProgressBarPage()
                .clickStartButton()
                .waitProgressBar(5)
                .clickStopButton()
                .getProgressBarValue();

        assertEquals(value, actualValue);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The start button is pressed and after 10 seconds the value is checked")
    public void progressBarMaxTest() {
        String value = "100";

        String actualValue = new MainPage()
                .openWidgetsPage()
                .openProgressBarPage()
                .clickStartButton()
                .waitProgressBar(10)
                .getProgressBarValue();

        assertEquals(value, actualValue);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The start button is pressed and after 11 seconds the reset button is pressed and the value is checked")
    public void progressBarResetTest() {
        String value = "0";

        String actualValue = new MainPage()
                .openWidgetsPage()
                .openProgressBarPage()
                .clickStartButton()
                .waitProgressBar(11)
                .clickResetButton()
                .getProgressBarValue();

        assertEquals(value, actualValue);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The first tab is dragged 3 times to the end and their values are checked")
    public void sortableListTest() {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("Four", "Five", "Six", "One", "Two", "Three")
        );

        List<String> actualList = new MainPage()
                .openInteractionsPage()
                .openSortablePage()
                .clickListPanel()
                .moveListTabDown(3)
                .getListTabsTextCollection();

        assertEquals(list, actualList);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The first tab is dragged 5 times to the end and their values are checked")
    public void sortableGridTest() {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("Six", "Seven", "Eight", "Nine", "One", "Two", "Three", "Four", "Five")
        );

        List<String> actualList = new MainPage()
                .openInteractionsPage()
                .openSortablePage()
                .clickGridPanel()
                .moveGridTabDown(5)
                .getGridTabsTextCollection();

        assertEquals(list, actualList);
    }

    @Test
    @Owner("shimozukuri")
    @Description("All tabs are clicked and their color is checked")
    public void selectableListTest() {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList(
                        "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)",
                        "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)"
                )
        );

        List<String> actualList = new MainPage()
                .openInteractionsPage()
                .openSelectablePage()
                .clickListPanel()
                .clickListTabs()
                .getListTabsColors();

        assertEquals(list, actualList);
    }

    @Test
    @Owner("shimozukuri")
    @Description("All tabs are clicked and their color is checked")
    public void selectableGridTest() {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList(
                        "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)",
                        "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)",
                        "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)", "rgba(0, 123, 255, 1)"
                )
        );

        List<String> actualList = new MainPage()
                .openInteractionsPage()
                .openSelectablePage()
                .clickGridPanel()
                .clickGridTabs()
                .getGridTabsColors();

        assertEquals(list, actualList);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The box is resized to the maximum and the size is checked")
    public void resizeableBoxWithRestrictionMaxTest() {
        String size = "width: 500px; height: 300px;";

        String actualSize = new MainPage()
                .openInteractionsPage()
                .openResizablePage()
                .moveResizableBoxWithRestrictionHandle(300, 100)
                .getResizableBoxWithRestrictionSize();

        assertEquals(size, actualSize);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The box is resized to the minimum and the size is checked")
    public void resizeableBoxWithRestrictionMinTest() {
        String size = "width: 150px; height: 150px;";

        String actualSize = new MainPage()
                .openInteractionsPage()
                .openResizablePage()
                .moveResizableBoxWithRestrictionHandle(-200, -200)
                .getResizableBoxWithRestrictionSize();

        assertEquals(size, actualSize);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The box is resized and the size is checked")
    public void resizeableBoxWithoutRestrictionTest() {
        String size = "width: 500px; height: 300px;";

        String actualSize = new MainPage()
                .openInteractionsPage()
                .openResizablePage()
                .moveResizableBoxWithoutRestrictionHandle(300, 100)
                .getResizableBoxWithoutRestrictionSize();

        assertEquals(size, actualSize);
    }

    @Test
    @Owner("shimozukuri")
    @Description("The box is resized to the minimum and the size is checked")
    public void resizeableBoxWithoutRestrictionMinTest() {
        String size = "width: 20px; height: 20px;";

        String actualSize = new MainPage()
                .openInteractionsPage()
                .openResizablePage()
                .moveResizableBoxWithoutRestrictionHandle(-200, -200)
                .getResizableBoxWithoutRestrictionSize();

        assertEquals(size, actualSize);
    }

}
