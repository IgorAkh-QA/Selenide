package demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class PracticeForm {

    @BeforeAll
    static void beforeAll() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        Configuration.browserCapabilities=options;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";

    }
    @Test
        void FillingFormPracticeTest(){

        String FirstName = "Firstname";
        String LastName = "Lastname";
        String Email = "Firstname@gmail.com";
        String Mobile = "7123456789";
        String Address = "Dom ololoshi";
        //File file = new File("src/test/resources/FOMA.jpg");

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        $(".text-center").shouldHave(text("Practice Form"));
        $("#firstName").setValue(FirstName);
        $("#lastName").setValue(LastName);
        $("#userEmail").setValue(Email);
        $("#genterWrapper").$(byText("Female")).click() ;
        $("#userNumber").setValue(Mobile);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("2000");
        //actions().moveToElement($(byText("2000"))).click();
        //$(".react-datepicker__month-select").click();
        //actions().moveToElement($(byText("February"))).click();
        $(".react-datepicker__month-select").selectOption("February");
        //$("[id=dateOfBirthInput]").click();
        $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("a");
        $(byText("Arts")).click();
        $(byText("Reading")).click();
       // $("#uploadPicture").click();
        //$("#uploadPicture").uploadFile(file);
        $("#uploadPicture").uploadFromClasspath("FOMA.jpg");
        //$("#file-upload").uploadFromClasspath("readme.txt");
        // don't forget to submit!
        $("#currentAddress").setValue(Address);
        $(byText("Select State")).click();
        $(byText("Haryana")).click();
        $("#react-select-4-input").setValue("Pan").pressEnter();
        $("#submit").click();



    }
}
