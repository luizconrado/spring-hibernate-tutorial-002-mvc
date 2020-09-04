package main.java.com.luizconrado.springmvc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Student {

    private static final Map<String, String> professionMap = new LinkedHashMap<>();

    private static final Map<String, String> genderMap = new LinkedHashMap<>();

    // @Values is used to initiate variable with values from another file
    // @Value("#{programingLanguageOptions}")
    private static final Map<String, String> programingLanguageOptions = new LinkedHashMap<>();

    private static final Map<String, String> laptopScreenSizeOptions = new LinkedHashMap<>();

    static {

        professionMap.put("Developer", "Developer");
        professionMap.put("Web Designer", "Web Designer");
        professionMap.put("Engineer", "Engineer");

        genderMap.put("Female", "Female");
        genderMap.put("Male", "Male");

        programingLanguageOptions.put("Java", "Java");
        programingLanguageOptions.put("CPP", "C++");
        programingLanguageOptions.put("JS", "JavaScript");
        programingLanguageOptions.put("Python", "Python");

        laptopScreenSizeOptions.put("XS", "12");
        laptopScreenSizeOptions.put("S", "13.3");
        laptopScreenSizeOptions.put("M", "14");
        laptopScreenSizeOptions.put("L", "15");
        laptopScreenSizeOptions.put("XL", "16");
        laptopScreenSizeOptions.put("XXL", "17");
    }

    // https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
    // https://www.baeldung.com/spring-mvc-form-tags
    private static final List<String> countryList = new ArrayList<>(Arrays.asList("Brazil", "France", "Germany", "India", "USA"));


    // @Values is used to initiate variable with values from another file
    // @Value("#{screenSizeOptions}")
    // private Map<String, String> laptopScreenSizeOptions;
    private String firstName;
    private String lastName;
    private String country;
    private String email;
    private String password;


    //    https://vladmihalcea.com/date-timestamp-jpa-hibernate/
    //    https://thorben-janssen.com/whats-new-in-jpa-2-2/
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registeredTimestamp;

    private String profession;
    private String favoriteProgramingLanguage;
    private boolean married;
    private String gender;
    private String laptopScreenSize;
    private String note;

    public Student() {

    }

    public static Map<String, String> getProfessionMap() {
        return professionMap;
    }

    public static Map<String, String> getGenderMap() {
        return genderMap;
    }

    public static Map<String, String> getProgramingLanguageOptions() {
        return programingLanguageOptions;
    }

    public static Map<String, String> getLaptopScreenSizeOptions() {
        return laptopScreenSizeOptions;
    }

    public static List<String> getCountryList() {
        return countryList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getRegisteredTimestamp() {
        return registeredTimestamp;
    }

    public void setRegisteredTimestamp(LocalDateTime registeredTimestamp) {
        this.registeredTimestamp = registeredTimestamp;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFavoriteProgramingLanguage() {
        return favoriteProgramingLanguage;
    }

    public void setFavoriteProgramingLanguage(String favoriteProgramingLanguage) {
        this.favoriteProgramingLanguage = favoriteProgramingLanguage;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLaptopScreenSize() {
        return laptopScreenSize;
    }

    public void setLaptopScreenSize(String laptopScreenSize) {
        this.laptopScreenSize = laptopScreenSize;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return married == student.married &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(country, student.country) &&
                Objects.equals(email, student.email) &&
                Objects.equals(password, student.password) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(registeredTimestamp, student.registeredTimestamp) &&
                Objects.equals(profession, student.profession) &&
                Objects.equals(favoriteProgramingLanguage, student.favoriteProgramingLanguage) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(laptopScreenSize, student.laptopScreenSize) &&
                Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, country, email, password, birthday, registeredTimestamp, profession, favoriteProgramingLanguage, married, gender, laptopScreenSize, note);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", registeredTimestamp=" + registeredTimestamp +
                ", profession='" + profession + '\'' +
                ", favoriteProgramingLanguage='" + favoriteProgramingLanguage + '\'' +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                ", laptopScreenSize='" + laptopScreenSize + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
