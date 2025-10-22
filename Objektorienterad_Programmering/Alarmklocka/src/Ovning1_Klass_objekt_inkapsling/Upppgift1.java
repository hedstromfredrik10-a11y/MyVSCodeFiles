package Ovning1_Klass_objekt_inkapsling;

public class Upppgift1 {
    public static void main(String[] args) {
        Tree bjork = new Tree(11, "Björk");
        Tree tall = new Tree(1, "TALL");

        bjork.ageTreeOneYear();
        tall.ageTreeOneYear();

        System.out.println("Björkens ålder: " + bjork.getAge() + "\n" + "Tallens ålder: " + tall.getAge());
        
        bjork.setNewAge(50);

        System.out.println(bjork.getAge());

        System.out.println(bjork.getAge());

        bjork.setNewAge(60);

        bjork.setNewType("Ek");

        System.out.println(bjork.getType());

    }
}
