package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class FormsPage {

    private final SelenideElement practiceFormCard = $x("//span[text()='Practice Form']");

    @Step("Opening 'Practice Form' page")
    public PracticeFormPage openPracticeFormPage() {
        practiceFormCard.click();
        return new PracticeFormPage();
    }

}
