package com.cs_is.oops.pillars.abstraction.interfaces;
public interface Animal {
    /*
    Interface methods are completely abstract & cannot have a body
    They are implemented in the respective child classes
    Therefore, interfaces exhibit 100% abstraction
     */
    void sound();
    void run();
}
class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Cats Meow.");
    }
    @Override
    public void run(){
        System.out.println("Cats run fast.");
    }
}
class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dogs Bark.");
    }
    @Override
    public void run(){
        System.out.println("Dogs run fast.");
    }
}
class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run();
        cat.sound();
        dog.run();
        dog.sound();
    }
}



