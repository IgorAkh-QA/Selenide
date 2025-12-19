package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private String TITLE_TEXT = "Practice Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            mobileNumberInput = $("#userNumber"),
            genderRadio = $("#genterWrapper").$(byText("Female")),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            subjectText = $(byText("Arts")),
            hobbieCheckBox = $(byText("Reading")),
            uploadFile = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateChooser = $(byText("Select State")),
            cityChooser = $(byText("Haryana")),
            wtf = $("#react-select-4-input"),
    submitRegDateButton = $("#submit");

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".text-center").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value){
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setPhone(String value){
        mobileNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value){
        genderRadio.click() ;
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String value){
        subjectsInput.setValue(value);
        subjectText.click();
        return this;
    }

    public RegistrationPage setHobbies(){
        hobbieCheckBox.click();
        return this;
    }

    public RegistrationPage uploadFile(String value){
        uploadFile.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setAddress(String value){
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage stateChooser(){
        stateChooser.click();
        return this;
    }

    public RegistrationPage cityChooser(){
        cityChooser.click();
        return this;
    }

    public RegistrationPage wtf(String value){
        wtf.setValue(value);
        return this;
    }

    public RegistrationPage submitRegDateButton(){
        submitRegDateButton.click();
        return this;
    }


    public RegistrationPage verifyResultsModalAppears(){
        registrationResultsModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResults(String key, String value){
        registrationResultsModal.verifyResult(key, value);
        return this;
    }

    public void clearLastname(){
        lastNameInput.clear();
    }

}
