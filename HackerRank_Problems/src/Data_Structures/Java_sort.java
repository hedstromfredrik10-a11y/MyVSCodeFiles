package Data_Structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Java_sort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int counter = 0;
        String[] values = new String[3];
        List<Student> studList = new ArrayList<>();

        while (counter < count) {
            String input = scan.nextLine();

            values = input.split("\\s+");

            studList.add(new Student(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2])));

            for (int i = 0; i < values.length - 1; i++) {
                values[i] = "\b";
            }

            counter++;
        }

        Comparator<Student> com = (Student a, Student b) -> {
            if (!a.cgpa.equals(b.cgpa)) {
                return b.cgpa.compareTo(a.cgpa);
            } else if (!a.name.equals(b.name)) {
                return a.name.compareTo(b.name);
            } else {
                return Integer.compare(a.id, b.id);
            }
        };

        Collections.sort(studList, com);
        System.out.println();

        for (Student s : studList) {
            System.out.println(s.getName());
        }
        scan.close();

    }

    public static class Student {

        private int id;
        private String name;
        private Double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;

            List<Integer> ID = new ArrayList<>();
            List<String> NAME = new ArrayList<>();
            List<Double> CGPA = new ArrayList<>();

            ID.add(id);
            NAME.add(name);
            CGPA.add(cgpa);
        }

        public double getCGPA() {
            return cgpa;
        }

        public String getName() {
            return name;
        }

        public int getID() {
            return id;
        }
    }

}
