package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class BrowserWindowsPage {

    private final SelenideElement tabButton = $(By.id("tabButton"));
    private final SelenideElement windowButton = $(By.id("windowButton"));

    @Step("Opening 'New Tab' tab")
    public TabButtonPage openTabButtonPage() {
        tabButton.click();
        switchTo().window(1);
        return new TabButtonPage();
    }

    @Step("Opening 'New Window' window")
    public WindowButtonPage openWindowButtonPage() {
        windowButton.click();
        switchTo().window(1);
        return new WindowButtonPage();
    }

}
