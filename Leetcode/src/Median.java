import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Median {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 5, 7, 8, 3, 6 };
        // int[] arr = { 1, 4, 2, 5, 7, 8};

        System.out.println(Arrays.toString(oddMedianArrayElement(arr)));

    }

    public static int[] oddMedianArrayElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();    //Skapar en arraylist
        for (int i = 0; i < arr.length; i++) {  //Loopar igenom hela arrayen
            if (i % 2 == 0) {   //Hittar alla jämna index
                list.add(arr[i]);   //Lägger in de elementet i arraylisten
            }
        }

        Collections.sort(list); //Sorterar arraylisten

        System.out.println(list);

        int[] newArr;   //Skapar en ny array

        if (list.size() % 2 == 1) {  //Om längen är öjämn
            newArr = new int[1];    //Skapa array med ett index
            newArr[0] = list.get((list.size() / 2));    //Lägg in de mellersta indexet i denna array
        } else {    //Annars är jämn
            newArr = new int[2];    //Skapar en array med två index

            //Lägger in de två mellersta elementen 
            newArr[0] = list.get((list.size() / 2) - 1);                
            newArr[1] = list.get(list.size() / 2);
        }

        return newArr; //Returnerar den nya arrayen
    }
}
