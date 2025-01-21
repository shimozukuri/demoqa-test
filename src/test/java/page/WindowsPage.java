package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WindowsPage {

    private final SelenideElement browserWindowsCard = $x("//span[text()='Browser Windows']");
    private final SelenideElement alertsCard = $x("//span[text()='Alerts']");
    private final SelenideElement framesCard = $x("//span[text()='Frames']");

    public BrowserWindowsPage openBrowserWindowsPage() {
        browserWindowsCard.click();
        return new BrowserWindowsPage();
    }

    public AlertsPage openAlertsPage() {
        alertsCard.click();
        return new AlertsPage();
    }

    public FramesPage openFramesPage() {
        framesCard.click();
        return new FramesPage();
    }

}
