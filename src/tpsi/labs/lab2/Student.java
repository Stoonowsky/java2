package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements EmailRecipient{


    private String groupId;
    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;

    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    private List<Double> grades = new ArrayList<>();
    public List<Double> getGrades(){
        return grades;
    }
    public void addGrade(double grade){
        grades.add(grade);
    }
    public double getGradesAverage(){
        double suma=0.0;
        List<Double> grades = getGrades();
        for (Double d : grades) {
            suma += d;
        }
        return suma /grades.size();





    }




}
