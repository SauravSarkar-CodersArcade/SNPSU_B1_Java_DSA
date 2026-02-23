package com.cs_is.oops.withConstructor;
public class Student {
    // Instance variables => Because each object will have access
    int USN;
    String name;
    int marks;
    // Static is not for object - it directly belongs to the class
    static String college = "SNPSU"; // Use for common parameters

    Student(String name, int USN, int marks){
        this.name = name;
        this.USN = USN;
        this.marks = marks;
    }
    // Method
    void evaluateMarks(){
        if(marks >= 40){
            System.out.println(name + " has PASSED");
        }else {
            System.out.println(name + " has FAILED");
        }
    }
    void studentDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("USN: " + this.USN);
        System.out.println("Marks: " + this.marks);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        // Object Creation => ClassName obj = new ClassName();
        Student s1 = new Student("Vikrant", 101, 56);
        Student s2 = new Student("Vijay", 102, 36);
        s1.evaluateMarks();
        s2.evaluateMarks();
        s1.studentDetails();
        s2.studentDetails();
    }
}
