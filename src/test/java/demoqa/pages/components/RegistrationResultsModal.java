package demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {
    private String TITLE_TEXT = "Thanks for submitting the form";

    public SelenideElement
            modalWindow = $(".modal-dialog"),
            modalTitle = $(".modal-header"),
            resultRowText = $(".table-responsive");


    public void verifyModalAppears() {
        modalWindow.should(appear);
        modalTitle.shouldHave(text(TITLE_TEXT));
    }

    public void verifyResult(String key, String value) {
        resultRowText.$(byText(key)).parent()
                .shouldHave(text(value));

    }
}
