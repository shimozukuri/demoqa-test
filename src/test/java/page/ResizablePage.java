package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ResizablePage {

    private final SelenideElement resizableBoxWithRestriction = $(By.id("resizableBoxWithRestriction"));
    private final SelenideElement resizableBoxWithoutRestriction = $(By.id("resizable"));
    private final SelenideElement resizableBoxWithRestrictionHandle = $x("//div[@id='resizableBoxWithRestriction']/span");
    private final SelenideElement resizableBoxWithoutRestrictionHandle = $x("//div[@id='resizable']/span");

    @Step("Moving handle")
    public ResizablePage moveResizableBoxWithRestrictionHandle(int x, int y) {
        actions()
                .moveToElement(resizableBoxWithRestrictionHandle)
                .dragAndDropBy(resizableBoxWithRestrictionHandle, x, y)
                .perform();

        return this;
    }

    @Step("Moving handle")
    public ResizablePage moveResizableBoxWithoutRestrictionHandle(int x, int y) {
        actions()
                .moveToElement(resizableBoxWithoutRestrictionHandle)
                .dragAndDropBy(resizableBoxWithoutRestrictionHandle, x, y)
                .perform();

        return this;
    }

    @Step("Get box size")
    public String getResizableBoxWithRestrictionSize() {
        return resizableBoxWithRestriction.getAttribute("style");
    }

    @Step("Get box size")
    public String getResizableBoxWithoutRestrictionSize() {
        return resizableBoxWithoutRestriction.getAttribute("style");
    }

}
