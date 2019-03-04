package tpsi.labs.lab2;

public class Teacher extends Person implements EmailRecipient{
    private String courseName;

    public Teacher(String firstName, String lastName,String emailAddress, String courseName){
        super(firstName, lastName, emailAddress);
        this.courseName=courseName;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
}
