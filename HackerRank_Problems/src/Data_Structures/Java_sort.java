package Data_Structures;

import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Java_sort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int counter = 0;
        String[] values = new String[3];
        List<Student> stud = new ArrayList<>();

        while (counter < count) {
            String input = scan.nextLine();

            values = input.split("\\s+");

            stud.add(new Student(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2])));

            for (int i = 0; i < values.length - 1; i++) {
                values[i] = "\b";
            }

            counter++;
        }

        Comparator<Student> com = (Student i, Student j) -> {
            if (i.cgpa > i.cgpa) {
                return 1;

            } else {
                return -1;
            }

        };

        for (Student s : stud) {

        }

        Collections.sort(stud, com);
        System.out.println();
        for (Student s : stud) {
            System.out.println(s);
        }
        scan.close();

    }

    public static class Student {

        int id;
        String name;
        Double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;

            setID(id);
            setName(name);
            setCGPA(cgpa);

        }

        public void setID(int id) {
            List<Integer> ID = new ArrayList<>();
            ID.add(id);
        }

        public void setName(String name) {
            List<String> NAME = new ArrayList<>();
            NAME.add(name);
        }

        public void setCGPA(double cgpa) {
            List<Double> CGPA = new ArrayList<>();
            CGPA.add(cgpa);
        }

        public String toString() {
            return id + " " + name + " " + cgpa;
        }

        public double getCGPA() {
            return cgpa;
        }
    }

}
