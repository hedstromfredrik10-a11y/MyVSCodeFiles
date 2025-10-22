package Ovning1_2_enum_toString;

import Ovning1_2_enum_toString.Hund.Humör;

public class Main {
    public static void main(String[] args) {
        Hund milou = new Hund("Milou", Humör.HUNGRIG, "Tintin");
        System.out.println(milou.toString());
    }

}
