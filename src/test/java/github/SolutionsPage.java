package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsPage {

    @BeforeAll
            static void beforeAll() {
        Configuration.baseUrl="https://github.com";
    }

    @Test
    void findPageByTitle() {

        open("/selenide/selenide");
        $(".HeaderMktg").$(byText("Solutions")).hover();
        $(byText("Enterprises")).click();
        $(".HeaderMktg").shouldBe(visible).shouldHave(text("Navigation Menu"));
        //$("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform for the agent-ready enterprise"), Duration.ofSeconds(30));
    }
}
