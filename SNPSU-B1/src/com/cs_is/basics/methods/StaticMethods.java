package com.cs_is.basics.methods;
public class StaticMethods {
    static int x = 200;
    static void display(){
        System.out.println("SNPSU_CS_IS");
    }
}
class StaticDemo {
    public static void main(String[] args) {
        // Use ClassName. to access static data from other classes
        StaticMethods.display();
        System.out.println(StaticMethods.x);
    }
}
