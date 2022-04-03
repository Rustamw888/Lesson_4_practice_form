package quru.qa.homework;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public interface IPractice_Form_Selectors {

    SelenideElement firstname = $("#firstName");

    SelenideElement lastName = $("#lastName");

    SelenideElement email = $("#userEmail");

    default SelenideElement gender(String text) {
        return $(withText(text));
    }

    SelenideElement phoneNumber = $("#userNumber");

    SelenideElement dateOfBirthInput = $("#dateOfBirthInput");

    SelenideElement subjectsForm = $("#subjectsInput");

    default SelenideElement myHobbies(String text) {
        return $(withText(text));
    }

    SelenideElement picture = $("#uploadPicture");

    SelenideElement currentAddress = $("#currentAddress");

    SelenideElement stateInput = $("#state input");

    SelenideElement cityInput = $("#city input");

    SelenideElement submitBtn = $("#submit");

    SelenideElement birthYear = $(".react-datepicker__year-select");

    SelenideElement birthMonth = $(".react-datepicker__month-select");

    default SelenideElement birthDay(String day) {
        return $x("//*[text()='" + day + "']");
    }

    ElementsCollection resultTable = $$("table tr");

    SelenideElement closeBtn = $("#closeLargeModal");
}
