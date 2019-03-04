package tpsi.labs.lab2;

public class Person implements EmailRecipient {

    private String emailAddress;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public static void main(String[] args) {

        University zut = new University("Zachodniopomorski Uniwersytet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologi Stosowanej w Koluszkach", "wsks@wsks.edu.pl");

        Person s1 = new Student("Jan", "Kowalski", "jan.kowalski@zu.edu.pl", "32B");
        Person s2 = new Student("Hermenegilda", "Nowak", "hermenegilda.nowak@zut.edu.pl", "32B");
        Person t1 = new Teacher("Brajan", "Kocur", "brajan.kocur@zut.edu.pl", "PTD");

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

        ((Student) s1).addGrade(3.0);
        ((Student) s1).addGrade(4.5);
        ((Student) s1).addGrade(2.5);

        System.out.println(((Student) s1).getGrades());
        System.out.println(((Student) s1).getGradesAverage());
        System.out.println("sprawdzanko gita ffs!");


    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
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
}

