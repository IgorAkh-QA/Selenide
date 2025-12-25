package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class StepsTest {

    final static String REPOSITORY = "eroshenkoam/allure-example";
    final static int PULL_REQUEST_NUMBER = 91;
    final static String PULL_REQUEST_TITLE = "Fix pull request close test";
    @Test
    public void testLambdaStep(){
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".search-input").click();
            $("#query-builder-test").sendKeys(REPOSITORY);
            $("#query-builder-test").submit();
        });
        step("Кликаем по ссылке репозитория " + REPOSITORY, () -> {
            $(linkText("eroshenkoam/allure-example")).click();
        });
        step("Открываем там Pull-requests",() -> {
            $("#pull-requests-tab").click();
        });
        step("Проверяем наличие Pull-requests с номером " + PULL_REQUEST_NUMBER, () -> {
            $(withText("#" + PULL_REQUEST_NUMBER)).should(Condition.exist);
        });
        step("Проверяем, что тайт Pull-requset с номером " + PULL_REQUEST_NUMBER +
                " содержит текст: " + PULL_REQUEST_TITLE, () -> {
            $("#issue_91_link").shouldHave(text(PULL_REQUEST_TITLE));
        });
    }

    @Test
    public void testAnnotatedStep(){
        WebSteps steps = new WebSteps();
        SelenideLogger.addListener("allure", new AllureSelenide());

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openPullRequestsTab();
        steps.shouldSeePullRequestWithNumber(PULL_REQUEST_NUMBER);
        steps.pullRequestTitleIsCorrect(PULL_REQUEST_TITLE);
    }
}
