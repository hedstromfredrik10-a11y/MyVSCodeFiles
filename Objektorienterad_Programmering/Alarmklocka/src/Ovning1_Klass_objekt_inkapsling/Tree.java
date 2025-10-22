package Ovning1_Klass_objekt_inkapsling;

public class Tree {
    private int age;
    private String type;

    public Tree(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void ageTreeOneYear() {
        this.age++;
    }

    public void setNewAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Åldern kan inte vara negativ");
        } else {
            this.age = newAge;
        }
    }

    public void setNewType(String newType) {
        this.type = newType;
    }
}
