package main.java.com.luizconrado.springmvc.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private String fullName;
    private String email;
    private String password;

    //    https://vladmihalcea.com/date-timestamp-jpa-hibernate/
    private LocalDate birthday;

    private String profession;
    private boolean married;
    private String gender;
    private String note;

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
                Objects.equals(fullName, student.fullName) &&
                Objects.equals(email, student.email) &&
                Objects.equals(password, student.password) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(profession, student.profession) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, email, password, birthday, profession, married, gender, note);
    }


    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", profession='" + profession + '\'' +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
