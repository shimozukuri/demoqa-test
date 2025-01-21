package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FormsPage {

    private final SelenideElement practiceFormCard = $x("//span[text()='Practice Form']");

    public PracticeFormPage openPracticeFormPage() {
        practiceFormCard.click();
        return new PracticeFormPage();
    }

}
