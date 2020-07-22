package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("Fullname = " + person.getFullName());
        System.out.println("Is a teen? = " + person.isTeen());

        person.setFirstName("Chase");
        person.setAge(18);

        System.out.println("Fullname = " + person.getFullName());
        System.out.println("Is a teen? = " + person.isTeen());

        person.setLastName("Richards");
        System.out.println("Fullname = " + person.getFullName());
    }
}
