package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.RegistrationResultsModal;
import io.qameta.allure.Step;

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

    @Step("Открываем страницу /automation-practice-form")
    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".text-center").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        return this;
    }
    @Step("Вводим Имя")
    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }
    @Step("Вводим фамилию")
    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }
    @Step("Вводим Email адрес")
    public RegistrationPage setEmail(String value){
        emailInput.setValue(value);
        return this;
    }
    @Step("Вводим номер телефона")
    public RegistrationPage setPhone(String value){
        mobileNumberInput.setValue(value);
        return this;
    }
    @Step("Выбираем гендер")
    public RegistrationPage setGender(String value){
        genderRadio.click() ;
        return this;
    }
    @Step("Выбираем дату рождения")
    public RegistrationPage setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    @Step("Выбираем предмет")
    public RegistrationPage setSubjects(String value){
        subjectsInput.setValue(value);
        subjectText.click();
        return this;
    }
    @Step("Выбираем хобби")
    public RegistrationPage setHobbies(){
        hobbieCheckBox.click();
        return this;
    }
    @Step("Загружаем документы")
    public RegistrationPage uploadFile(String value){
        uploadFile.uploadFromClasspath(value);
        return this;
    }
    @Step("Вводим адрес")
    public RegistrationPage setAddress(String value){
        addressInput.setValue(value);
        return this;
    }
    @Step("Выбираем регион проживания")
    public RegistrationPage stateChooser(){
        stateChooser.click();
        return this;
    }
    @Step("Выбираем город проживания")
    public RegistrationPage cityChooser(){
        cityChooser.click();
        return this;
    }
    @Step("Выбираем wtf")
    public RegistrationPage wtf(String value){
        wtf.setValue(value);
        return this;
    }
    @Step("Нажимаем кнопку подтверждения")
    public RegistrationPage submitRegDateButton(){
        submitRegDateButton.click();
        return this;
    }

    @Step("Проверяем, что окно с данными введенными при регистрации отобразилось")
    public RegistrationPage verifyResultsModalAppears(){
        registrationResultsModal.verifyModalAppears();
        return this;
    }
    @Step("Сверяем введенные данные с отображаемыми")
    public RegistrationPage verifyResults(String key, String value){
        registrationResultsModal.verifyResult(key, value);
        return this;
    }

    public void clearLastname(){
        lastNameInput.clear();
    }

}
