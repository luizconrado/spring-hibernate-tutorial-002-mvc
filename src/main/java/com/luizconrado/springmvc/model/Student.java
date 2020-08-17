package main.java.com.luizconrado.springmvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private static final Map<String, String> professionMap =
            new LinkedHashMap<>(Map.of("Developer", "Developer", "Web Designer", "Web Designer", "Engineer", "Engineer"));

    private static final Map<String, String> genderMap =
            new LinkedHashMap<>(Map.of("Female", "Female", "Male", "Male"));

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //    https://vladmihalcea.com/date-timestamp-jpa-hibernate/
    //    https://thorben-janssen.com/whats-new-in-jpa-2-2/
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registeredTimestamp;

    private String profession;
    private boolean married;
    private String gender;
    private String note;

    public Student() {
    }

    public static Map<String, String> getProfessionMap() {
        return professionMap;
    }

    public static Map<String, String> getGenderMap() {
        return genderMap;
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
                Objects.equals(email, student.email) &&
                Objects.equals(password, student.password) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(registeredTimestamp, student.registeredTimestamp) &&
                Objects.equals(profession, student.profession) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, password, birthday, registeredTimestamp, profession, married, gender, note);
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", registeredTimestamp=" + registeredTimestamp +
                ", profession='" + profession + '\'' +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
