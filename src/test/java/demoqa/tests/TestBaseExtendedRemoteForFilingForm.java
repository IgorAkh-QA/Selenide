package demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import demoqa.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.baseUrl;

public class TestBaseExtendedRemoteForFilingForm extends TestBase {

    @BeforeAll
    static void beforeAll() {
         String selenoidLogin = "user1";
         String selenoidPassword = "1234";

        baseUrl = System.getProperty("base_url", "selenoid.autotests.cloud/wd/hub");
        selenoidLogin = System.getProperty("selenoid_login", selenoidLogin);
        selenoidPassword = System.getProperty("selenoid_password", selenoidPassword);
        Configuration.remote= "https://"+selenoidLogin+":" + selenoidPassword +"@" + baseUrl;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
               "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
