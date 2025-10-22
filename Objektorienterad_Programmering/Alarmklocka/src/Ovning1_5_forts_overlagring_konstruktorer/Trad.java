package Ovning1_5_forts_overlagring_konstruktorer;

public class Trad {
    private String art;
    private int ålder;

    public Trad() {
        this("Tall", 0);
    }

    public Trad(String art, int ålder) {
        this.art = art;
        this.ålder = ålder;
    }

    public void aldras() {
        aldras(1);
    }

    public void aldras(int age) {
        this.ålder = this.ålder + age;
    }

    public String getArt() {
        return art;
    }

    public int getAlder() {
        return ålder;
    }

    public void setAlder(int ålder) {
        if (ålder > 0) {
            this.ålder = ålder;
        }
    }
}
