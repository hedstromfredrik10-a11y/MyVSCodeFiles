package Problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class myLeetcodeProblems {
    public static void main(String[] args) {

    }

    public static boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int num = matrix[i][j];
            }
        }

        return false;
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int number = i + 1;
            if (map.get(number) == null) {
                result.add(number);
            }
        }

        return result;
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        result[0] = answers(nums1, nums2);
        result[1] = answers(nums2, nums1);
        return result;
    }

    public static int answers(int[] arr1, int[] arr2) {
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            int find = arr1[i];
            if (IntStream.of(arr2).anyMatch(n -> n == find)) {
                answer++;
            }
        }
        return answer;
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }

        int[] cloneArray = nums.clone();
        Arrays.sort(cloneArray);
        int[] result = new int[k];

        for (int i = 0, j = cloneArray.length - 1; i < k; i++, j--) {
            result[i] = cloneArray[j];
        }

        int[] doneArray = new int[k];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (nums[i] == result[j]) {
                    doneArray[idx] = result[j];
                    idx++;
                    break;
                }
            }
            if (idx == k) {
                break;
            }
        }

        return doneArray;
    }

    public static int[] maxSubsequence2(int[] nums, int k) {
        PriorityQueue<Integer> indexes = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            indexes.add(i);
            if (indexes.size() > k) {
                indexes.poll();
            }
        }

        return indexes.stream().sorted().mapToInt(i -> nums[i]).toArray();

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].equals("")) {
            return "";
        } else {
            boolean flag = true;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < strs[0].length(); i++) {
                String check = String.valueOf(strs[0].charAt(i));
                for (int x = 0; x < strs.length; x++) {
                    try {
                        if (check.equals(String.valueOf(strs[x].charAt(i)))) {
                            flag = true;
                        } else {
                            flag = false;
                            x = strs.length;
                            i = strs[0].length();
                        }
                    } catch (Exception e) {
                        x = strs.length;
                        flag = false;
                    }
                }
                if (flag) {
                    s.append(check);
                }
            }
            if (s.length() > 0) {
                return s.toString();
            } else {
                return "";
            }
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for (int i = m; i < (m + nums2.length); i++) {
            nums1[i] = nums2[x++];
        }

        List<Integer> list = new ArrayList<>();

        for (Integer integer : nums1) {
            list.add(integer);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }

        System.out.println(Arrays.toString(nums1));

    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();

        for (Integer integer : list1) {
            result.add(integer);
        }

        for (Integer integer : list2) {
            result.add(integer);
        }

        Collections.sort(result);

        return result;

    }

    public static int[] plusOne(int[] digits) {
        boolean checkNines = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                checkNines = false;
                break;
            }
        }

        int[] newArr;

        if (checkNines) {
            newArr = new int[digits.length + 1];
            newArr[0] = 0;
            for (int i = 1; i < newArr.length; i++) {
                newArr[i] = digits[i - 1];
            }
        } else {
            newArr = new int[digits.length];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = digits[i];
            }
        }

        for (int i = newArr.length - 1; i >= 0; i--) {
            if (newArr[i] != 9) {
                newArr[(i)]++;
                break;
            } else {
                newArr[i] = 0;
            }
        }
        return newArr;
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> inList = new ArrayList<>();
        Arrays.sort(arr1);

        for (int i = 0; i < arr2.length; i++) {
            int data = arr2[i];
            if (IntStream.of(arr1).anyMatch(num -> num == data)) {
                Arrays.stream(arr1).filter(n -> n == data).forEach(inList::add);
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            int checkElementExists = arr1[i];
            if (!IntStream.of(arr2).anyMatch(n -> n == checkElementExists)) {
                inList.add(checkElementExists);
            }
        }

        return inList.stream().mapToInt(Integer::intValue).toArray();

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int check = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[check] = nums[i];
                check++;
            }
        }

        return check;

    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            list.add(i);
        }

        list.removeIf(n -> n == val);

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
            result++;
        }
        return result;

    }

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        boolean found = false;

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer integer : nums) {
            list.add(integer);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                found = true;
            } else if (i == (nums.length - 1) && found == false) {
                list.add(target);
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                result = i;
            }
        }

        return result;
    }

    public static int secondHighest(String s) {
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (char c : arr) {
            if (Character.isDigit(c)) {
                list.add(c - '0');
            }
        }

        Collections.sort(list);

        list.removeIf(n -> n == list.get(list.size() - 1));

        return list.size() == 0 ? -1 : list.get(list.size() - 1);
    }

    public static int[] seperateDigits(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            char[] arr = s.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                answer.add(arr[j] - '0');
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int element = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int integer : nums) {
            list.add(integer);
        }

        while (true) {
            if (list.size() == 1) {
                element = list.getFirst();
                break;
            } else {
                temp.add(list.get(0));
                temp.add(list.get(1));
            }

            if (temp.get(0).compareTo(temp.get(1)) != 0) {
                int delete = list.get(2);
                list.removeIf(n -> n == delete);
            } else {
                temp.clear();
                list.remove(0);
                list.remove(0);
            }

        }

        return element;
    }

    public static int sumOfMultiples(int n) {
        int numsToSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                numsToSum += i;
            }
        }
        return numsToSum;
    }

    public static String addBianry(String a, String b) {
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);

        BigInteger sum = bigA.add(bigB);

        return sum.toString(2);
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean result = false;

        String[][] chessBoard = new String[8][8];

        int[] x_yCoordinate1 = checkLetterCoordinate(coordinate1);
        int[] x_yCoordinate2 = checkLetterCoordinate(coordinate2);

        for (int i = 0; i <= 7; i = i + 2) {
            for (int j = 0; j <= 7; j++) {
                if (j % 2 == 0) {
                    chessBoard[i][j] = "Black";
                } else {
                    chessBoard[i][j] = "White";
                }
            }
        }

        for (int i = 1; i <= 7; i = i + 2) {
            for (int j = 0; j <= 7; j++) {
                if (j % 2 == 0) {
                    chessBoard[i][j] = "White";
                } else {
                    chessBoard[i][j] = "Black";
                }
            }
        }

        if (chessBoard[x_yCoordinate1[0]][x_yCoordinate1[1]].equals(chessBoard[x_yCoordinate2[0]][x_yCoordinate2[1]])) {
            result = true;
        }

        return result;

    }

    public static int[] checkLetterCoordinate(String input) {
        int[] x_y = new int[2];
        x_y[0] = input.charAt(0) - 'a';
        x_y[1] = input.charAt(1) - '1';

        return x_y;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;
        String s = createString(word1);
        String s2 = createString(word2);

        if (s.equals(s2)) {
            result = true;
        }

        return result;
    }

    public static String createString(String[] s) {
        StringBuilder sb = new StringBuilder();

        for (String string : s) {
            sb.append(string);
        }

        return sb.toString();
    }

    public static boolean detectCapitalUse(String word) {
        boolean result = false;

        if (word.length() == 1) {
            return true;
        }
        char[] arr = word.toCharArray();
        if (Character.isUpperCase(arr[0])) {
            if (checkAllUpperCase(arr) == true && checkAllLowerCase(arr) == false) {
                result = true;
            }
        }

        if (Character.isUpperCase(arr[0])) {
            if (checkAllUpperCase(arr) == false && checkAllLowerCase(arr) == true) {
                result = true;
            }
        }

        if (Character.isLowerCase(arr[0])) {
            if (checkAllLowerCase(arr)) {
                result = true;
            }
        }

        return result;

    }

    public static boolean checkAllUpperCase(char[] arr) {
        boolean result = true;

        for (int i = 1; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkAllLowerCase(char[] arr) {
        boolean result = true;

        for (int i = 1; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                result = false;
                break;
            }

        }
        return result;
    }

    public static int firstUniqChar(String s) {
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

    public static String generateTag(String caption) {
        StringBuilder toCamelCaseForVideo = new StringBuilder();
        caption = caption.trim();

        String[] arr = caption.split("\\s+");

        if (caption.isBlank()) {
            return "#";
        }

        for (String string : arr) {
            toCamelCaseForVideo.append(string.substring(0, 1).toUpperCase())
                    .append(string.substring(1, string.length()).toLowerCase());
        }
        toCamelCaseForVideo.replace(0, 1, String.valueOf(Character.toLowerCase(caption.charAt(0))));

        String result = toCamelCaseForVideo.toString().replaceAll("[^a-zA-Z]", "");

        result = "#" + result;

        if (result.length() > 100) {
            result = result.substring(0, 99);
        }

        return result;

    }

    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();

        String[] vowels = { "a", "e", "i", "o", "u" };
        String[] consonant = {
                "b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"
        };
        String[] arr = sentence.split("\\s+");
        String a = "a";

        if (sentence.isBlank()) {
            return "";
        }

        for (String string : arr) {

            for (int i = 0; i < vowels.length; i++) {
                if (Character.toString(string.charAt(0)).equalsIgnoreCase(vowels[i])) {
                    sb.append(string).append("ma").append(a).append(" ");
                }
            }

            for (int j = 0; j < consonant.length; j++) {
                if (Character.toString(string.charAt(0)).equalsIgnoreCase(consonant[j])) {
                    sb.append(string.substring(1, string.length())).append(string.substring(0, 1)).append("ma")
                            .append(a).append(" ");
                }
            }

            a += "a";
        }

        return sb.toString().trim();
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");

        String lastWord = arr[arr.length - 1];

        char[] arr2 = lastWord.toCharArray();
        return arr2.length;
    }

    public static String makeSmallestPalindrome(String s) {
        String result = "";
        char[] arr = s.toCharArray();

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                if (arr[i] < arr[j]) {
                    arr[j] = arr[i];
                } else if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            sb.append(c);
        }

        result = sb.toString();
        return result;

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

    private static String move(char C, int[] coordinates) {
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

    public static int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int result = 0;
        int j = 1;

        for (int i = 0; i < roman.length - 1; i++, j++) {
            int index = romanValues(roman[i]), nextIndex = romanValues(roman[j]);
            if (index >= nextIndex) {
                result += index;
            } else if (index < nextIndex) {
                result -= index;
            }
        }

        result += romanValues(roman[j - 1]);

        return result;
    }

    public static int romanValues(char c) {
        int value = 0;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i)).append(" ");
        }
        String s = sb.toString();

        s = s.replace(separator, ' ');

        String[] arr = s.trim().split("\\s+");

        for (String string : arr) {
            result.add(string);
        }

        return result;
    }
}
