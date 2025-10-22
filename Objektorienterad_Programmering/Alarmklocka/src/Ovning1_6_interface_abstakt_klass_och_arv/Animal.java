package Ovning1_6_interface_abstakt_klass_och_arv;

public class Animal implements Feedable{
    private String noise;

    public Animal(String noise) {
        this.noise = noise;
    }

    public void feed() {
        System.out.println(noise);
    }

    public int hej() {
        return 1;
    }

}
