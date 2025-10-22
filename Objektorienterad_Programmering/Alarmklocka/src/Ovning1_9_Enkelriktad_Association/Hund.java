package Ovning1_9_Enkelriktad_Association;

public class Hund {
    private String namn;
    private boolean hungrig;

    public Hund(String namn) {
        this.namn = namn;
    }

    public void äta() {
        hungrig = false;
    }

    @Override
    public String toString() {
        return namn;
    }
}
