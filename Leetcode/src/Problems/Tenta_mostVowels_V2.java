package Problems;

public class Tenta_mostVowels_V2 {
    public static void main(String[] args) {
        String a = "Hej världen";
        String b = "Måsvinge";

        System.out.println(mostVowelWord(a, b));
    }
    
    public static String mostVowelWord(String a, String b) {
        return countVowels(a) >= countVowels(b) ? a : b;
    }

    public static int countVowels(String s) {
        return (int) s.toLowerCase().chars().filter(c -> "aouåeiyäö".indexOf(c) >= 0).count();
    }
}
