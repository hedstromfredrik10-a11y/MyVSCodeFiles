package Ovning1_2_enum_toString;

public class Hund {

    public enum Humör {
        GLAD,
        LEDSEN,
        HUNGRIG
    }

    private String namn;
    private Humör humör;
    private String husse;

    public Hund(String namn, Humör humör, String husse) {
        this.namn = namn;
        this.humör = humör;
        this.husse = husse;
    }

    public void äta() {
        humör = Humör.GLAD;
    }

    public void viftaPaSvansen() {
        System.out.println(namn + "viftar på svansen");
    }

    public String toString() {
        return namn + " " + humör.toString() + " "
         + husse;
    }
}
