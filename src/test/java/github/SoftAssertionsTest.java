package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.extension.RegisterExtension;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class SoftAssertionsTest {
    @RegisterExtension
    static SoftAssertsExtension softAsserts = new SoftAssertsExtension();
    @Test
    void junitFiveCodeShouldBeOnSoftAssertionsPage() {
        Configuration.assertionMode = SOFT;
        Configuration.browserSize="2500x1980";
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        sleep(5000);
        $("#wiki-pages-box").$$("ul li button").findBy(visible).shouldHave(text("Show"));
        $(".wiki-more-pages-link").$("button").click();
        $("[data-filterable-for=wiki-pages-filter").$(byText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").preceding(0).shouldHave(text("JUnit5"));
        $("#user-content-3-using-junit5-extend-test-class").click();
        sleep(5000);
    }
}
