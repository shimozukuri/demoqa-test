package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AccordianPage {

    private final SelenideElement firstSectionBlock = $(By.id("section1Heading"));
    private final SelenideElement secondSectionBlock = $(By.id("section2Heading"));
    private final SelenideElement thirdSectionBlock = $(By.id("section3Heading"));
    private final SelenideElement firstSectionContent = $(By.id("section1Content"));
    private final SelenideElement secondSectionContent = $(By.id("section2Content"));
    private final SelenideElement thirdSectionContent = $(By.id("section3Content"));

    @Step("Clicking first block")
    public AccordianPage clickFirstSectionBlock() {
        firstSectionBlock.click();
        return this;
    }

    @Step("Clicking second block")
    public AccordianPage clickSecondSectionBlock() {
        secondSectionBlock.click();
        return this;
    }

    @Step("Clicking third block")
    public AccordianPage clickThirdSectionBlock() {
        thirdSectionBlock.click();
        return this;
    }

    @Step("Getting first block text")
    public String getFirstSectionContent() {
        return firstSectionContent.shouldBe(visible).getText();
    }

    @Step("Getting second block text")
    public String getSecondSectionContent() {
        return secondSectionContent.shouldBe(visible).getText();
    }

    @Step("Getting third block text")
    public String getThirdSectionContent() {
        return thirdSectionContent.shouldBe(visible).getText();
    }

}
