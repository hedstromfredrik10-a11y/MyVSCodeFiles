package Ovning1_4_overlagring_konstruktorer;

public class Main {
    public static void main(String[] args) {
        Trad gran = new Trad("Gran", 20);

        gran.aldras(7);
        gran.aldras();

        System.out.println(gran.getAlder());
    }
    
}
