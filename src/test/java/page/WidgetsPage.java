package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class WidgetsPage {

    private final SelenideElement accordianCard = $x("//span[text()='Accordian']");
    private final SelenideElement sliderCard = $x("//span[text()='Slider']");
    private final SelenideElement progressBarCard = $x("//span[text()='Progress Bar']");

    @Step("Opening 'Accordian' page")
    public AccordianPage openAccordianPage() {
        accordianCard.click();
        return new AccordianPage();
    }

    @Step("Opening 'Slider' page")
    public SliderPage openSliderPage() {
        sliderCard.click();
        return new SliderPage();
    }

    @Step("Opening 'Progress Bar' page")
    public ProgressBarPage openProgressBarPage() {
        progressBarCard.click();
        return new ProgressBarPage();
    }

}
