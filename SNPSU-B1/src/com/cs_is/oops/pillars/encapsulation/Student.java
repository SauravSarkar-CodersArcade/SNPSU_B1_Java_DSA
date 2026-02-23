package com.cs_is.oops.pillars.encapsulation;
public class Student {
    private int USN;
    private String email;
    // setters ->
    // Assign Attributes
    public void setUSN(int USN){
        this.USN = USN;
    }
    public void setEmail(String email){
        this.email = email;
    }
    // getters -> retrieve attributes
    public int getUSN(){
        return this.USN;
    }
    public String getEmail(){
        return this.email;
    }
}
