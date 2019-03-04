package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends University implements EmailRecipient {
    private List<String> teachers = new ArrayList<String>();

    public Faculty(String name, String emailAddress) {
        super(name, emailAddress);
    }


    public List<String> getTeachers() {
        return teachers;
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }


}
