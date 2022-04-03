package quru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @Test
    void fieldFormTest() {
        open("https://demoqa.com/text-box");
        System.out.println("");
    }
}
