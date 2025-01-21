package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.http.Message;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class BrowserWindowsPage {

    private final SelenideElement tabButton = $(By.id("tabButton"));
    private final SelenideElement windowButton = $(By.id("windowButton"));

    public TabButtonPage openTabButtonPage() {
        tabButton.click();
        switchTo().window(1);
        return new TabButtonPage();
    }

    public WindowButtonPage openWindowButtonPage() {
        windowButton.click();
        switchTo().window(1);
        return new WindowButtonPage();
    }

}
