package com.cs_is.oops.pillars.abstraction.abstractClasses;
abstract class Animal {
   // Normal or Concrete Methods
   // Abstract Methods
   void eat(){
       System.out.println("Animals eat some food!");
   }
   // This method cannot have a body
   // It will be implemented in the child classes
   abstract void run();
   // If an abstract class has only abstract methods
   // - it is 100% abstraction
   // If it has even 1 normal method - it is not 100%
}
class Cat extends Animal{
   @Override
   void run(){
      System.out.println("Cats run fast.");
   }
}
class Cheetah extends Animal{
   @Override
   void run(){
      System.out.println("Cheetah runs very fast.");
   }
}
class Demo {
   public static void main(String[] args) {
      Cat cat = new Cat();
      Cheetah cheetah = new Cheetah();
      cat.eat();
      cat.run();
      cheetah.eat();
      cheetah.run();
   }
}

