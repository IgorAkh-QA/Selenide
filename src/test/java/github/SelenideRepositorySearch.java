package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class SelenideRepositorySearch {

    @Test
    public void shouldFindSelenideRepositoryAtTheTop() {
    Selenide.open("https://github.com");
    Selenide.$("[data-target=qbsearch-input.hotkeyIndicator]").setValue("selenide").pressEnter();
    }
}
