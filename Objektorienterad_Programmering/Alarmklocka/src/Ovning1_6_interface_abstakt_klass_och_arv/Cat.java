package Ovning1_6_interface_abstakt_klass_och_arv;

public class Cat extends Animal {
    int ett = 1;
    public Cat() {
        super("Mjau");
    }

    public void purr() {
        System.out.println("prrrr");
    }

    public int test(int ett) {
        this.ett = ett;

        return super(ett);
        
    }
}
