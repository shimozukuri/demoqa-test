package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class SortablePage {

    private final SelenideElement listPanel = $(By.id("demo-tab-list"));
    private final SelenideElement gridPanel = $(By.id("demo-tab-grid"));
    private final SelenideElement firstListTab = $x("//div[@class='vertical-list-container mt-4']//div[1]");
    private final SelenideElement lastListTab = $x("//div[@class='vertical-list-container mt-4']//div[6]");
    private final SelenideElement firstGridTab = $x("//div[@class='create-grid']//div[1]");
    private final SelenideElement lastGridTab = $x("//div[@class='create-grid']//div[9]");
    private final ElementsCollection listTabCollection = $$x("//div[@class='vertical-list-container mt-4']//div");
    private final ElementsCollection gridTabCollection = $$x("//div[@class='create-grid']//div");

    @Step("Clicking 'List' panel")
    public SortablePage clickListPanel() {
        listPanel.click();
        return this;
    }

    @Step("Clicking 'Grid' panel")
    public SortablePage clickGridPanel() {
        gridPanel.click();
        return this;
    }

    @Step("Dragging 'List' tab down")
    public SortablePage moveListTabDown(int quantity) {
        while (quantity > 0) {
            actions().moveToElement(firstListTab).dragAndDrop(firstListTab, lastListTab).perform();
            lastListTab.click();
            quantity--;
        }

        return this;
    }

    @Step("Dragging 'Grid' tab down")
    public SortablePage moveGridTabDown(int quantity) {
        while (quantity > 0) {
            actions().moveToElement(firstGridTab).dragAndDrop(firstGridTab, lastGridTab).perform();
            lastGridTab.click();
            quantity--;
        }

        return this;
    }

    @Step("Getting 'List' tabs texts")
    public List<String> getListTabsTextCollection() {
        return listTabCollection.stream().map(SelenideElement::getText).collect(Collectors.toList());
    }

    @Step("Getting 'Grid' tabs texts")
    public List<String> getGridTabsTextCollection() {
        return gridTabCollection.stream().map(SelenideElement::getText).collect(Collectors.toList());
    }

}
