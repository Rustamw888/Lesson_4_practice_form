package quru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB() {
        System.out.println("### BeforeAll");
    }

    @BeforeEach
    void openWindow() {
        System.out.println("### BeforeEach");
        Selenide.open("https://ya.ru");
    }

    @AfterEach
    void close() {
        System.out.println("### AfterEach");
        Selenide.closeWindow();
    }

    @AfterAll
    static void cleanDB() {
        System.out.println("### AfterAll");
    }

    @Test
    void assertTest1() {

        //...1

    }

    @Test
    void assertTest2() {

        //...2

    }
}
