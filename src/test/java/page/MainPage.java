package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement elementsCard = $x("//h5[1]");
    private final SelenideElement formsCard = $x("//h5[text()='Forms']");
    private final SelenideElement windowsCard = $x("//h5[contains(text(), 'Alerts')]");
    private final SelenideElement widgetsCard = $x("//h5[text()='Widgets']");
    private final SelenideElement interactionsCard = $x("//h5[text()='Interactions']");

    public MainPage() {
        Selenide.open("https://demoqa.com/");
    }

    @Step("Opening 'Elements' page")
    public ElementsPage openElementPage() {
        elementsCard.click();
        return new ElementsPage();
    }

    @Step("Opening 'Forms' page")
    public FormsPage openFormsPage() {
        formsCard.click();
        return new FormsPage();
    }

    @Step("Opening 'Alerts, Frame & Windows' page")
    public WindowsPage openWindowsPage() {
        windowsCard.click();
        return new WindowsPage();
    }

    @Step("Opening 'Widgets' page")
    public WidgetsPage openWidgetsPage() {
        widgetsCard.click();
        return new WidgetsPage();
    }

    @Step("Opening 'Interactions' page")
    public InteractionsPage openInteractionsPage() {
        interactionsCard.click();
        return new InteractionsPage();
    }

}
