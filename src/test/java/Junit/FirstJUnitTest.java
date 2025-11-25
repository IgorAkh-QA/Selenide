package Junit;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
    }

    @AfterAll
    static void afterAll() {
        Configuration.browser = null;
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }

    @Test
    void firstTest() {
        System.out.println("First test");
        Assertions.assertTrue(true);
    }
}
