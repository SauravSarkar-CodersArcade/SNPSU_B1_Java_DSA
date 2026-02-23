package com.cs_is.oops.withoutConstructor;
public class Student {
    // Instance variables => Because each object will have access
    int USN;
    String name;
    int marks;
    // Method
    void evaluateMarks(){
        if(marks >= 40){
            System.out.println(name + " has PASSED");
        }else {
            System.out.println(name + " has FAILED");
        }
    }
    public static void main(String[] args) {
        // Object Creation => ClassName obj = new ClassName();
        Student s1 = new Student();
        s1.name = "Vikrant";
        s1.USN = 101;
        s1.marks = 56;
        Student s2 = new Student();
        s2.name = "Vijay";
        s2.USN = 102;
        s2.marks = 36;
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
