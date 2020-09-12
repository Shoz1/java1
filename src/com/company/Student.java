package com.company;

public class Student {
    String surname;
    String initials;
    String facultyname;
    int recordbook;
    int course;
    String nameSubject;
    String nameTeacher;
    String nameRating;


    public boolean isCorrectTitle(String title) {
        for (int i = 0; i < title.length(); i++) {
            if (!Character.isAlphabetic(title.charAt(i)) && !(title.charAt(i) == '-')&& !(title.charAt(i) == ' '))
                return false;
        }
        return true;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = isCorrectTitle(surname) ? surname : "Ïncorrect";
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = isCorrectTitle(initials) ? initials : "Ïncorrect";
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) { this.facultyname = isCorrectTitle(facultyname) ? facultyname : "Ïncorrect";
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) { this.nameSubject = isCorrectTitle(nameSubject) ? nameSubject : "Ïncorrect";
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameSubject) { this.nameTeacher = isCorrectTitle(nameTeacher) ? nameTeacher : "Ïncorrect";
    }

    public String getNameRating() {
        return nameRating;
    }

    public void setNameRating(String nameRating) { this.nameRating = isCorrectTitle(nameRating) ? nameRating : "Ïncorrect";
    }

    public int getRecordbook() {
        return recordbook;
    }

    public void setRecordbook(int recordbook) {
        this.recordbook = recordbook > 0 ? recordbook : -1;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course > 0 ? course : -1;
    }

    Student() {
        this.surname  = "";
        this.initials = "";
        this.facultyname = "";
        this.recordbook = 0;
        this.course = 0;
        this.nameSubject  = "";
        this.nameTeacher  = "";
        this.nameRating  = "";
    }

    public Student(String surname, String initials, String facultyname, int recordbook, int course , String nameSubject , String nameTeacher, String nameRating ) {
        this.setSurname(surname);
        this.setInitials(initials);
        this.setFacultyname(facultyname);
        this.setRecordbook(recordbook);
        this.setCourse(course);
        this.setNameSubject(nameSubject);
        this.setNameTeacher(nameTeacher);
        this.setNameRating(nameRating);
    }


    @Override
    public String toString() {
        return surname + " (" + initials + "), facultyname: " + facultyname +
                ", recordbook: " + recordbook + ", course: " + course + ", name Subject: " + nameSubject + ", name Teacher: " + nameTeacher + ", name Rating: " + nameRating ;
    }
}
