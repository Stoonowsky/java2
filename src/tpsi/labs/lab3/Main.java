package tpsi.labs.lab3;
import tpsi.labs.lab2.*;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Set<String> zbiorDni = new HashSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");

        //nazwa przedmiotu mapowana bedzie na nauczyciela prowadzacego

        Student s1 = new Student("Karol", "Kondradzki", "ka.rol@zut.edu.pl", "32");
        Student s2 = new Student("Mateusz", "Lempek", "lemposz@zut.edu.pl", "32");
        Student s3 = new Student("Łukasz","Warchulski", "stun@zut.edu.pl","32");
        Student s4 = new Student("Jakiś", "Jasiek", "leszcze@zut.edu.pl", "31");
        Student s5 = new Student("Inny", "Leszcz", "leszcz@zut.edu.pl","31");

        Teacher t1 = new Teacher("Dobry", "Prowadzący", "dp@zut.edu.pl","PO");
        Teacher t2 = new Teacher("Średni", "Wykładowca", "sr@zut.edu.pl", "POI");

        Map<String, Teacher> przedmioty = new HashMap<>();
        przedmioty.put("POI", t2);
        przedmioty.put("PO",t1);

        Map<Integer, List<Student>> grupy = new HashMap<>();
        List<Student> grupa32 = new ArrayList<>();
        grupa32.add(s1);
        grupa32.add(s2);
        grupa32.add(s3);
        List<Student> grupa31 = new ArrayList<>();
        grupa31.add(s4);
        grupa31.add(s5);

        grupy.put(32, grupa32);
        grupy.put(31, grupa31);


        System.out.println(zbiorDni);
        System.out.println(przedmioty.get("PO"));
        System.out.println(grupy.get(32));
        System.out.println("A tu jakieś leszcze: ");
        System.out.println(grupy.get(31));



    }
}
