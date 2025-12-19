package allure;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LabelsTest {

    final static String REPOSITORY = "eroshenkoam/allure-example";
    final static int PULL_REQUEST_NUMBER = 91;

    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("qakhmet")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "ARTO", url = "https://ARTO-2201.ru")
    @DisplayName("Создание Issue для авторизованного пользователя")
    public void testStaticLabels() {

    }


    @Test
    public void testDynamicLabels() {
Allure.getLifecycle().updateTestCase(
        t -> t.setName("Создание Issue для авторизованного пользователя"));
   Allure.feature("Issue в репозитории");
   Allure.story("Создание Issue");
   Allure.label("owner", "qakhmet");
   Allure.label("severity", SeverityLevel.BLOCKER.value());
   Allure.link("ARTO","https://ARTO-2201.ru" );

    }
}


