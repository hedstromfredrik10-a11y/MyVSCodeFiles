package Problems.Strings;

import java.util.ArrayList;
import java.util.Arrays;

// Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. 
// You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

// Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

// Input: path = "NES"
// Output: false

// Input: path = "NESWW"
// Output: true

public class Path_Crossing {
    public static void main(String[] args) {
        String path = "NES";
        // String path = "NESWW";

        System.out.println(isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        boolean result = false;
        int[] coordinates = { 0, 0 };
        char[] points = path.toCharArray();
        ArrayList<String> previousPoints = new ArrayList<>();
        previousPoints.add("[0, 0]");

        for (int i = 0; i < points.length; i++) {
            String s = move(points[i], coordinates);
            previousPoints.add(s);
        }

        for (int i = 0; i < previousPoints.size(); i++) {
            for (int x = i + 1; x < previousPoints.size(); x++) {
                if (previousPoints.get(i).equals(previousPoints.get(x))) {
                    result = true;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public static String move(char C, int[] coordinates) {
        switch (C) {
            case 'N':
                coordinates[1]++;
                break;
            case 'W':
                coordinates[0]--;
                break;
            case 'S':
                coordinates[1]--;
                break;
            case 'E':
                coordinates[0]++;
                break;
            default:
                break;
        }
        return Arrays.toString(coordinates);
    }
}
