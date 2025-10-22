package Ovning1_9_Enkelriktad_Association;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tintin");
        person.nyHund(new Hund("Milou"));

        System.out.println(person.toString());

    }
}
