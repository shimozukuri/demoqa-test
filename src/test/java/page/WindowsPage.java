package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class WindowsPage {

    private final SelenideElement browserWindowsCard = $x("//span[text()='Browser Windows']");
    private final SelenideElement alertsCard = $x("//span[text()='Alerts']");
    private final SelenideElement framesCard = $x("//span[text()='Frames']");

    @Step("Opening 'Browser Windows' page")
    public BrowserWindowsPage openBrowserWindowsPage() {
        browserWindowsCard.click();
        return new BrowserWindowsPage();
    }

    @Step("Opening 'Alerts' page")
    public AlertsPage openAlertsPage() {
        alertsCard.click();
        return new AlertsPage();
    }

    @Step("Opening 'Frames' page")
    public FramesPage openFramesPage() {
        framesCard.click();
        return new FramesPage();
    }

}
