package demoqa.tests;

import com.github.javafaker.Faker;
import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static io.qameta.allure.Allure.step;

public class PracticeFormWithJavaFakerTests extends TestBaseExtendedRemoteForFilingForm {
@Tag("Filling_form")
    @Test
    void FillingFormPracticeTest() {
        //Faker faker = new Faker();
        Faker faker = new Faker(new Locale("en"));
        TestData testData = new TestData();
        String Address = faker.address().fullAddress();

        String Subject = "a";
        String WtfValue = ("Pan");
        new RegistrationPage()
                .openPage()
                .clearingPageFromAdvertising()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.Email)
                .setPhone(testData.mobile)
                .setGender(testData.gender)
                .setBirthDate(testData.day, testData.month, testData.year)
                .setSubjects(Subject)
                .setHobbies()
                .uploadFile(testData.FileName)
                .setAddress(Address)
                .stateChooser()
                .cityChooser()
                .wtf(WtfValue)
                .submitRegDateButton();




        //$("#file-upload").uploadFromClasspath("readme.txt");
        // don't forget to submit!


        registrationPage.verifyResultsModalAppears().
                verifyResults("Student Name", testData.firstName + " " + testData.lastName)
               .verifyResults("Gender", testData.gender)
                .verifyResults("Student Email", testData.Email)
               .verifyResults("Mobile", testData.mobile)
                .verifyResults("Address", Address)
                .verifyResults("Picture", testData.FileName)
               .verifyResults("Date of Birth", testData.dateBirth );



    }

}

/*/@Test
        void FillingFormPracticeTest(){

        String userName = "Firstname";
        String LastName = "Lastname";
        String Email = "Firstname@gmail.com";
        String Mobile = "7123456789";
        String Address = "Dom ololoshi";
        //File file = new File("src/test/resources/FOMA.jpg");

        new RegistrationPage().openPage();

        registrationPage.setFirstName(userName);
        registrationPage.setLastName(LastName);
        registrationPage.setEmail(Email);
        registrationPage.setPhone(Mobile);
        registrationPage.setGender("Female");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("2000");
        //actions().moveToElement($(byText("2000"))).click();
        //$(".react-datepicker__month-select").click();
        //actions().moveToElement($(byText("February"))).click();
        $(".react-datepicker__month-select").selectOption("February");
        //$("[id=dateOfBirthInput]").click();
        $(".react-datepicker__day--024:not(.react-datepicker__day--outside-month)").click();
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
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(userName), text(LastName), text(Email), text("Arts"),text(Address), text("24 February,2000"), text("FOMA.jpg"), text(Mobile));
       $("#closeLargeModal").click();


    }/*/