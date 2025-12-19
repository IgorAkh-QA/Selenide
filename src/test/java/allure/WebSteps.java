package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {


    @Step ("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step ("Ищем репозиторий {repo}")
    public void searchForRepository (String repo) {
        $(".search-input").click();
        $("#query-builder-test").sendKeys(repo);
        $("#query-builder-test").submit();
    }

    @Step ("Кликаем по ссылке репозитория {repo}")
    public void clickOnRepositoryLink(String repo) {
        $(linkText(repo)).click();
    }

    @Step ("Открываем там Pull-requests")
    public void openPullRequestsTab(){
        $("#pull-requests-tab").click();
    }

    @Step ("Проверяем наличие Pull-requests с номером {pullRequestNumber}")
    public void shouldSeePullRequestWithNumber(int pullRequestNumber) {
        $(withText("#" + pullRequestNumber)).should(Condition.exist);
    }
    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreensgot(){
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
