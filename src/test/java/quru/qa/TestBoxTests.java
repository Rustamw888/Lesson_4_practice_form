package quru.qa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBoxTests {

    @BeforeAll
    static void setUp() {
        holdBrowserOpen = true;
        baseUrl = "https://demoqa.com";
        browserSize = "1920x1080";
    }

    @Test
    void fieldFormTest() {
        String name = "Tyapaev Rustam";
        String email = "tyapaev@Rustam.ru";
        String currentAddress = "Pushkina 1";
        String permanentAddress = "Pushkina 2";

        open("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue(email);
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=permanentAddress]").setValue(permanentAddress);
        $("[id=submit]").click();

        // Asserts
        $("[id=output]").shouldHave(
                text(name),
                text(email),
                text(currentAddress),
                text(permanentAddress));

        $("[id=output] [id=name]").shouldHave(text(name));
        $("[id=output]").$("[id=email]").shouldHave(text(email));
        $("[id=output] [id=currentAddress]").shouldHave(text(currentAddress));

//        $("[id=permanentAddress]").shouldHave(text(permanentAddress)); //wrong
        $("p[id=permanentAddress]").shouldHave(text(permanentAddress));
        $("[id=permanentAddress]", 1).shouldHave(text(permanentAddress));

        String expectedPerAd = "Permananet Address :Pushkina 2";
        String actualPerAd = $("p[id=permanentAddress]").text();
        assertEquals(expectedPerAd, actualPerAd);
    }
}
