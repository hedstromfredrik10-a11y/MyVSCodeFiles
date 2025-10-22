package Ovning1_4_overlagring_konstruktorer;

public class Car {
    private String color;

    public Car() {
        
    }

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        if (color == null) {
            System.out.println("THe color has not been set yet");
        }
        return color;
    }
}
