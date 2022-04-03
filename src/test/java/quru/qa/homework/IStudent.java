package quru.qa.homework;

import java.util.ArrayList;

public interface IStudent {
    ArrayList<String> subjects();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getGender();
    String getMobileNumber();
    String getBirthDay();
    String getBirthMonth();
    String getBirthYear();
    ArrayList<String> hobbies();
    String getCurrentAddress();
    String getState();
    String getCity();

    void practiceFormTest();
}
