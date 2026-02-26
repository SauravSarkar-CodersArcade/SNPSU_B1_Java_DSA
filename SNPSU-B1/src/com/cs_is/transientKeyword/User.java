package com.cs_is.transientKeyword;
import java.io.*;
// To achieve Serialization we implement the Serializable interface
public class User implements Serializable {
    String username = "Saurav";
    transient String password = "12345";
}
class TransientDemo {
    public static void main(String[] args) throws Exception{
        User user = new User();
        ObjectOutputStream oos =
                new ObjectOutputStream
                        (new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();
        ObjectInputStream ois =
                new ObjectInputStream
                        (new FileInputStream("user.ser"));
        User user1 = (User) ois.readObject();
        System.out.println(user1.username);
        System.out.println(user1.password);
    }
}
