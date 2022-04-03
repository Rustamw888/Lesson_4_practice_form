package quru.qa.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Practice_Form_Tests extends Student implements IPractice_Form_Selectors {

    @BeforeAll
    static void setUp() {
        holdBrowserOpen = true;
        baseUrl = "https://demoqa.com";
        browserSize = "1920x1080";
    }

    @BeforeEach
    void closeFooterAndBanner() {
        open("/automation-practice-form");
        executeJavaScript("document.querySelector(\"footer\").hidden = 'true';" +
                "document.querySelector(\"#fixedban\").hidden = 'true'");

        // students data
        student.setFirstName("Rustam");
        student.setLastName("Tyapaev");
        student.setEmail("test@gmail.com");
        student.setGender("Other");
        student.setMobileNumber("1234567890");
        student.setBirthDay("19");
        student.setBirthMonth("December");
        student.setBirthYear("1988");
        subjects.add("Computer Science");
        subjects.add("English");
        hobbies.add("Sports");
        hobbies.add("Reading");
        hobbies.add("Music");
        student.setCurrentAddress("ulica Pushkina dom Kolotushkina");
        student.setState("NCR");
        student.setCity("Delhi");
    }

    Student student = new Student();
    private static final String PICNAME = "testPic.png";
    private final ArrayList<String> subjects = new ArrayList<>();
    private final ArrayList<String> hobbies = new ArrayList<>();

    @Test
    public void practiceFormTest() {
        // form fields filling
        firstname.setValue(student.getFirstName());
        lastName.setValue(student.getLastName());
        email.setValue(student.getEmail());
        gender(student.getGender()).click();
        phoneNumber.setValue(student.getMobileNumber());
        dateOfBirthInput.click();
        birthYear.selectOption(student.getBirthYear());
        birthMonth.selectOption(student.getBirthMonth());
        birthDay(student.getBirthDay()).click();
        for (String value : subjects) {
            subjectsForm.click();
            subjectsForm.setValue(value)
                    .pressEnter();
        }
        myHobbies(hobbies.get(0)).click();
        myHobbies(hobbies.get(1)).click();
        myHobbies(hobbies.get(2)).click();
        picture.uploadFromClasspath("testPic.png");
        currentAddress.setValue(student.getCurrentAddress());
        stateInput.setValue(student.getState()).pressEnter();
        cityInput.setValue(student.getCity()).pressEnter();
        submitBtn.click();

        // asserts
        resultTable.get(1).shouldHave(text(student.getFirstName()));
        resultTable.get(1).shouldHave(text(student.getLastName()));
        resultTable.get(2).shouldHave(text(student.getEmail()));
        resultTable.get(3).shouldHave(text(student.getGender()));
        resultTable.get(4).shouldHave(text(student.getMobileNumber()));
        resultTable.get(5).shouldHave(text(student.getBirthYear()));
        resultTable.get(5).shouldHave(text(student.getBirthMonth()));
        resultTable.get(5).shouldHave(text(student.getBirthDay()));
        resultTable.get(6).shouldHave(text(subjects.get(0)));
        resultTable.get(6).shouldHave(text(subjects.get(1)));
        resultTable.get(7).shouldHave(text(hobbies.get(0)));
        resultTable.get(7).shouldHave(text(hobbies.get(1)));
        resultTable.get(7).shouldHave(text(hobbies.get(2)));
        resultTable.get(8).shouldHave(text(PICNAME));
        resultTable.get(9).shouldHave(text(student.getCurrentAddress()));
        resultTable.get(10).shouldHave(text(student.getState()));
        resultTable.get(10).shouldHave(text(student.getCity()));
        closeBtn.click();
    }
}
