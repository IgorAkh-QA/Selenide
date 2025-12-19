package demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v140.page.Page;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestBoxTests {

    @BeforeAll
    static void beforeAll(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        Configuration.browserCapabilities=options;
        Configuration.browser="chrome";
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl="https://demoqa.com";
        }



    @Test
    void fillFormTest(){
        String userName = "Ololosha";
        String userEmail = "ololosha@gmail.com";
        String userAddress = "OloloshaHome";
        String userPermanentAddress = "OloloshaApp";

        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));
        $("#userName").setValue(userName);
        $("#userEmail").setValue(userEmail);
        $("#currentAddress").setValue(userAddress);
        $("#permanentAddress").setValue(userPermanentAddress);
        $("#submit").click();
        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave(text(userName));
        $("#output #email").shouldHave(text(userEmail));
        $("#output #currentAddress").shouldHave(text(userAddress));
        $("#output #permanentAddress").shouldHave(text(userPermanentAddress));
    }
}
