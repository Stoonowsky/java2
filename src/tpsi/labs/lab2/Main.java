package tpsi.labs.lab2;

public class Main {

    public static void main(String[] args) {

        University zut = new University("Zachodniopomorski Uniwersytet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologi Stosowanej w Koluszkach", "wsks@wsks.edu.pl");

        Student s1 = new Student("Jan", "Kowalski", "jan.kowalski@zu.edu.pl", "32B");
        Student s2 = new Student("Hermenegilda", "Nowak", "hermenegilda.nowak@zut.edu.pl", "32B");
        Teacher t1 = new Teacher("Brajan", "Kocur", "brajan.kocur@zut.edu.pl", "PTD");

        EmailRecipient[] spamList = new EmailRecipient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;

        for (EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }

        s1.addGrade(3.0);
        s1.addGrade(4.5);
        s1.addGrade(2.5);

        System.out.println(s1.getGrades());
        System.out.println(s1.getGradesAverage());
        System.out.println("sprawdzanko gita ffs!");


    }
}