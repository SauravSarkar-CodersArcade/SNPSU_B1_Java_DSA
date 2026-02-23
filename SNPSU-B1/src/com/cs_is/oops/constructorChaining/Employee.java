package com.cs_is.oops.constructorChaining;
public class Employee {
    int id;
    String name;
    double salary;
    static String company = "TCS";
    Employee(){
        this(0, "Not Assigned", 0.0);
    }
    public Employee(int id, String name){
        this(id, name, 30000);
    }
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(201, "Kiran");
        Employee e3 = new Employee(202, "Soumya", 45000);
        e1.display();
        e2.display();
        e3.display();
    }
}
