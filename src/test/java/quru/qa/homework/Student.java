package quru.qa.homework;

import java.util.ArrayList;

public class Student implements IStudent {

    private ArrayList<String> subjects = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobileNumber;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private ArrayList<String> hobbies = new ArrayList<>();
    private String currentAddress;
    private String state;
    private String city;

    public Student() {
    }

    public Student(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public Student(String firstName, ArrayList<String> hobbies) {
        this.firstName = firstName;
        this.hobbies = hobbies;
    }

    @Override
    public ArrayList<String> subjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String getBirthMonth() {
        return birthMonth;
    }

    @Override
    public String getBirthYear() {
        return birthYear;
    }

    @Override
    public ArrayList<String> hobbies() {
        return hobbies;
    }

    @Override
    public String getCurrentAddress() {
        return currentAddress;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void practiceFormTest() {

    }
}
