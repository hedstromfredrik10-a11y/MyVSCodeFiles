package Ovning1_6_interface_abstakt_klass_och_arv;

public class Main {
    public static void main(String[] args) {
        Feedable cat1 = new Cat();
        Animal cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.feed();
        cat2.feed();
        cat3.feed();
        
        // cat1.purr();    //Kan bara komma åt metoder i interfacet Feedable
        // cat2.purr();    //kan bara komma åt metoder i klassen Animal
        cat3.purr();    //Kan bara komma åt metoder i klassen Cat d.v.s den kan nå purr()

        Feedable dog = new Dog();
        Animal dog2 = new Dog();
        dog.feed();
        dog2.feed();
    }
}
