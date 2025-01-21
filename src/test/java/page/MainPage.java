package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement elementsCard = $x("//h5[1]");
    private final SelenideElement formsCard = $x("//h5[text()='Forms']");
    private final SelenideElement windowsCard = $x("//h5[contains(text(), 'Alerts')]");
    private final SelenideElement widgetsCard = $x("//h5[text()='Widgets']");
    private final SelenideElement interactionsCard = $x("//h5[text()='Interactions']");
    private final SelenideElement bookStoreCard = $x("//h5[contains(text(), 'Book')]");

    public MainPage() {
        Selenide.open("https://demoqa.com/");
    }

    public ElementsPage openElementPage() {
        elementsCard.click();
        return new ElementsPage();
    }

    public FormsPage openFormsPage() {
        formsCard.click();
        return new FormsPage();
    }

    public WindowsPage openWindowsPage() {
        windowsCard.click();
        return new WindowsPage();
    }

    public WidgetsPage openWidgetsPage() {
        widgetsCard.click();
        return new WidgetsPage();
    }

    public InteractionsPage openInteractionsPage() {
        interactionsCard.click();
        return new InteractionsPage();
    }

    public BookStorePage openBookStorePage() {
        bookStoreCard.scrollTo().click();
        return new BookStorePage();
    }

}
