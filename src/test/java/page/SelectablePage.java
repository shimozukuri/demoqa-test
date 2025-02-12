package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class SelectablePage {

    private final SelenideElement listPanel = $(By.id("demo-tab-list"));
    private final SelenideElement gridPanel = $(By.id("demo-tab-grid"));
    private final ElementsCollection listTabCollection = $$x("//ul[@id='verticalListContainer']//li");
    private final ElementsCollection gridTabCollection = $$x("//div[contains(@id, 'row')]//li");

    @Step("Clicking 'List' panel")
    public SelectablePage clickListPanel() {
        listPanel.click();
        return this;
    }

    @Step("Clicking 'Grid' panel")
    public SelectablePage clickGridPanel() {
        gridPanel.click();
        return this;
    }

    @Step("Clicking 'List' tabs")
    public SelectablePage clickListTabs() {
        for (SelenideElement listTab : listTabCollection) {
            listTab.click();
        }

        return this;
    }

    @Step("Clicking 'Grid' tabs")
    public SelectablePage clickGridTabs() {
        for (SelenideElement gridTab : gridTabCollection) {
            gridTab.click();
        }

        return this;
    }

    @Step("Getting 'List' tabs colors")
    public List<String> getListTabsColors() {
        return listTabCollection.stream()
                .map(i -> i.getCssValue("background-color"))
                .collect(Collectors.toList());
    }

    @Step("Getting 'Grid' tabs colors")
    public List<String> getGridTabsColors() {
        return gridTabCollection.stream()
                .map(i -> i.getCssValue("background-color"))
                .collect(Collectors.toList());
    }

}
