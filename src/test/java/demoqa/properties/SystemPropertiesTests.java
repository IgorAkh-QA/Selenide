package demoqa.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void simplePropertyTest() {
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simplePropertySetBrowserTest() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simplePropertySetDefaultBrowserTest() {

        String browserName = System.getProperty("browser", "chrome");
        System.out.println(browserName);
    }

    @Test
    void simplePropertyOverRideDefaultBrowserTest() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "chrome");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property")
    void ssimplePropertySetBrowserFromTerminalTest() {

        String browserName = System.getProperty("browser", "chrome");
        System.out.println(browserName);
        // ./gradlew clean one_property_test -Dbrowser=Safari
    }
@Test
    @Tag("hello")
    void helloTest() {
    System.out.println("Hello, " + System.getProperty("user_name", "unknown student"));
    /*
    ./gradlew clean hello_test

    ./gradlew clean hello_test -Duser_name=Alex
     */
}
}
