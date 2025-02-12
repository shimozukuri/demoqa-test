package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SliderPage {

    private final SelenideElement sliderContainer = $(By.id("sliderContainer"));
    private final SelenideElement sliderValue = $(By.id("sliderValue"));
    private final SelenideElement cardMenu = $x("//div[contains(@class, 'col-12 mt-4  col-md-3')]");

    @Step("Dragging slider")
    public SliderPage moveSlider(String value) {
        switch (value) {
            case "max":
                actions().moveToElement(sliderContainer).dragAndDrop(sliderContainer, sliderValue).perform();
                return this;
            case "min":
                actions().moveToElement(sliderContainer).dragAndDrop(sliderContainer, cardMenu).perform();
                return this;
            default:
                return this;
        }
    }

    @Step("Getting slider value")
    public String getSliderValue() {
        return sliderValue.getValue();
    }

}
