package Ovning1_4_overlagring_konstruktorer;

public class Trad {
    private String art;
    private int alder;

    public Trad(String art, int alder) {
        this.art = art;
        this.alder = alder;
    }

    public void aldras() {
        aldras(1);
    }

    public void aldras(int age) {
        this.alder = this.alder + age;
    }

    public String getArt() {
        return art;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        if (alder > 0) {
            this.alder = alder;
        }
    }
}
