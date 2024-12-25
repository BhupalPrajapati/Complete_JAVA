package Lambda;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // In this example, I want to demonstrate the various interfaces that have only one method.
        // These types of interfaces are called functional interfaces.

        List<Student> list = new ArrayList<>();
        Student s1 = new Student(10, 90);
        Student s2 = new Student(20, 80);
        Student s3 = new Student(30, 70);

        System.out.println(list.add(s1));
        System.out.println(list.add(s2));
        System.out.println(list.add(s3));

        // Method 1: Using Comparator interface
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student i, Student i1) {
//                return Integer.compare(i.getNumber(), i1.getMsarks());
//            }
//        });
//
//        for (Student student : list) {
//            System.out.println(student);
//        }

        // Method 2: Using Lambda expression
        Collections.sort(list, (Student student1, Student student2) -> {
            return Integer.compare(student1.getMarks(), student2.getMarks());
        });

        for (Student student : list) {
            System.out.println(student.getNumber());
        }

        // trying to print the hello word by using the runnable interface
        PrintHello p = new PrintHello();
        Thread t = new Thread(p);
        t.start();

        //   when  ever you in mind comes the functional interface always implement the lambda function





        // here we are trying to print the operation by using the interface

        MatheOperation add = (int a, int b)->(a+b);
        System.out.println(add.operation(59,1));

    }
}

