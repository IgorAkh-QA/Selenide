package demoqa.tests;


import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static demoqa.utils.RandomUtils.randomEmail;
import static demoqa.utils.RandomUtils.randomString;

//public class PracticeFormWithTestDataTests extends TestBase {
//    //    String userName = "Firstname",
////            userLastName = "Lastname",
////            Email = "Firstname@gmail.com",
////            Mobile = "7123456789",
////            Address = "Dom ololoshi",
////            Subject = "a",
////            FileName = ("FOMA.jpg"),
////            WtfValue = ("Pan"),
////            Day = "24",
////            Month = "February",
////            Year = "2000";
//    //Можно объявить без присваивания значений
//    static String
//        userName = randomString(10),
//        userLastName = randomString(10),
//        Address,
//        Email = randomEmail(),
//        Mobile,
//        Subject,
//        FileName,
//        WtfValue,
//            Month;
//    static int
//    Day,
//
//        Year;
//    @Test
//    void FillingFormPracticeTest() {
//
////        String userName = "Firstname";
////        String userLastName = "Lastname";
////        String Email = "Firstname@gmail.com";
////        String Mobile = "7123456789";
////        String Address = "Dom ololoshi";
////        String Subject = "a";
////        String FileName = ("FOMA.jpg");
////        String WtfValue = ("Pan");
////        String Day = "24";
////        String Month = "February";
////        String Year = "2000";
//
//        //File file = new File("src/test/resources/FOMA.jpg");
//
//        new RegistrationPage().openPage()
//                .setFirstName(userName)
//                .setLastName(userLastName)
//                .setEmail(Email)
//                .setPhone(Mobile)
//                .setGender("Female")
//                .setBirthDate(Day,Month,Year)
//                .setSubjects(Subject)
//                .setHobbies()
//                .uploadFile(FileName)
//                .setAddress(Address)
//                .stateChooser()
//                .cityChooser()
//                .wtf(WtfValue)
//                .submitRegDateButton();
//
//
//
//
//        //$("#file-upload").uploadFromClasspath("readme.txt");
//        // don't forget to submit!
//
//
//        registrationPage.verifyResultsModalAppears().
//                verifyResults("Student Name", userName + " " + userLastName)
//               .verifyResults("Gender", "Female")
//                .verifyResults("Student Email", Email)
//               .verifyResults("Mobile", Mobile)
//                .verifyResults("Address", Address)
//                .verifyResults("Picture", FileName)
//               .verifyResults("Date of Birth", Day + " " + Month + "," + Year);
//
//
//
//    }
//}

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