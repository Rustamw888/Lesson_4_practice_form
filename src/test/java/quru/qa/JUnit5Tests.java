package quru.qa;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class JUnit5Tests {

    @BeforeAll
    static void initDB() {
        System.out.println("### BeforeAll");
    }

    @BeforeEach
    void openWindow() {
        System.out.println("### BeforeEach");
        open("https://ya.ru");
    }

    @AfterEach
    void close() {
        System.out.println("### AfterEach");
        closeWindow();
    }

    @AfterAll
    static void cleanDB() {
        System.out.println("### AfterAll");
    }

    @Test
    void assertTest1() {
        System.out.println("###     test 1");
    }

    @Test
    void assertTest2() {
        System.out.println("###     test 2");
    }

    @Test
    void assertTest3() {
        System.out.println("###     test 3");
    }

    @Test
    void assertTest4() {
        System.out.println("###     test 4");
    }
}
