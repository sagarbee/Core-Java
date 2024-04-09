package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDriver {

    public static void main(String[] args) {

        Student student1 = new Student("Sagar", 4152);
        Student student2 = new Student("Rakesh", 8954);
        Student student3 = new Student("Aditya", 7805);
        Student student4 = new Student("Adesh", 9854);
        Student student5 = new Student("Akash", 7595);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        // Using natural ordering (compareTo method in Student class)
        Collections.sort(studentList);

        System.out.println("Sorted Student List by Name:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Comparator<Student> studentC = (std1, std2) -> Integer.compare(std1.getRollno(), std2.getRollno());
        Collections.sort(studentList, studentC);

        System.out.println("\nSorted Student List by Roll Number:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Comparator<Student> studentC1 = (n1, n2) -> n1.getName().compareTo(n2.getName());
        Collections.sort(studentList, studentC1);

        System.out.println("\nSorted Student List by Name:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        ArrayList<Integer> no = new ArrayList<>();
        no.add(10);
        no.add(4);
        no.add(34);
        no.add(98);

        Collections.sort(no);
        for (Integer n : no) {
            System.out.println(n);
        }
        System.out.println("-------------------------------------------------");

        Comparator<Integer> nao = (no1, no2) -> Integer.compare(no1, no2);
        Collections.sort(no, nao.reversed());
        for (Integer n : no) {
            System.out.println(n);
        }
    }
}

