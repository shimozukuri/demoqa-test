package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class InteractionsPage {

    private final SelenideElement sortableCard = $x("//span[text()='Sortable']");
    private final SelenideElement selectableCard = $x("//span[text()='Selectable']");
    private final SelenideElement resizableCard = $x("//span[text()='Resizable']");

    @Step("Opening 'Sortable' page")
    public SortablePage openSortablePage() {
        sortableCard.click();
        return new SortablePage();
    }

    @Step("Opening 'Selectable' page")
    public SelectablePage openSelectablePage() {
        selectableCard.click();
        return new SelectablePage();
    }

    @Step("Opening 'Resizable' page")
    public ResizablePage openResizablePage() {
        resizableCard.click();
        return new ResizablePage();
    }

}
