package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements EmailRecipient {

    private String name;
    private String emailAddress;
    private List<Teacher> teachers = new ArrayList<>();

    public Faculty(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getFacultyName() {
        return name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }


}
