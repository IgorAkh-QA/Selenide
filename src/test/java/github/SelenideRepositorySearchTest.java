package github;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.*;

class SelenideRepositorySearchTest {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

            open("https://github.com");
            $(".search-input").click();
            $("#query-builder-test").setValue("selenide").pressEnter();
            $("data-testid=results-list");
            $(".search-match" ).click();
            $("#repository-container-header").shouldHave(text("selenide / selenide"));//.$("[itemprop=name]").$("a").click();

    }
}