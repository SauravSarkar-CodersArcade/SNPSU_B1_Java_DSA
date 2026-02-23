package com.cs_is.oops.pillars.inheritance.multi;
public class SimpleCalculator {
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtract(int a, int b){
        System.out.println(a - b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(x * x);
    }
    void product(int x, int y){
        System.out.println(x * y);
    }
}
class MultiLevelDemo {
    public static void main(String[] args) {
        System.out.println("==============================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1,2);
        System.out.println("==============================================");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(1,2);
        c2.subtract(10,4);
        System.out.println("==============================================");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(2,5);
        c3.subtract(4,6);
        c3.square(22);
        c3.product(10,20);
        System.out.println("==============================================");
    }
}
class A{

}
class B{

}
//class C extends A, B{ Class cannot extend multiple classes
//
//}
