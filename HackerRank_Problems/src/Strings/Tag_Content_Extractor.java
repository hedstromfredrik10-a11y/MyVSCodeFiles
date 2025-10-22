package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content_Extractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");

        while(testCases-- > 0){
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while(matcher.find()){
                System.out.println(matcher.group(2));
                found = true;
            }

            if(!found){
                System.out.println("None");
            }
        }

        in.close();
    }
}
