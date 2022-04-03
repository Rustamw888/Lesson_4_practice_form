package quru.qa.docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXPathExamples {

    void cssXPathExamples() {
        $("[data-testid=email]").setValue("123");
        $(by("data-testid", "123"));

        $("[id=email]").setValue("123");
        $("#email").setValue("123");
        $(byId("email")).setValue("123");
        $(By.id("email")).setValue("123");
        $x("//*[@id='email']").setValue("123");
        $(byXpath("//*[@id='email']")).setValue("123");

        $("[name=email]").setValue("123");
        $(byName("email")).setValue("123");

        $("[class=login_form_input_box]").setValue("123");
        $(".login_form_input_box").setValue("123");
        $(".inputtext.login_form_input_box").setValue("123");
        $("input.inputtext.login_form_input_box").setValue("123");
        $x("//input[@class='login_form_input_box']").setValue("123");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("123");

        $(".inputtext .login_form_input_box").setValue("123");

        $("input.inputtext.login_form_input_box#email[name=email][data-testid=email]").setValue("123");

        $x("//div[text()='Hello qa.guru']");
        $x("//div[contains(text(),'ello qa.gur')]");
        $x("//div[text()[contains(.,'ello qa.gur')]]");
        $(byText("//div[text()='Hello qa.guru']"));
        $(withText("//div[text()='Hello qa.guru']"));
    }

}
