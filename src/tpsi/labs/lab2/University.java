package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;

public class University implements EmailRecipient {

    private String emailAddress;
    private String name;

    public University(String name, String emailAddress){
        this.name=name;
        this.emailAddress=emailAddress;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    private List<String> faculties = new ArrayList<String>();

    public List<String> getFaculties(){
        return faculties;
    }
    public void addFaculty(String faculty){
        faculties.add(faculty);
    }
}
