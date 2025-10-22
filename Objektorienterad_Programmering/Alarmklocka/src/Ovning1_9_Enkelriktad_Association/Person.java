package Ovning1_9_Enkelriktad_Association;

public class Person {
    String namn;
    private Hund hund;

    public Person(String namn) {
        this.namn = namn;
    }

    @Override
    public String toString() {
        return namn + " med hunden " + hund;
    }

    public void nyHund(Hund hund) {
        this.hund = hund;

    }

}
