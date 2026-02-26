package com.cs_is.oops.pillars.association.aggregation;
public class Patient {
    String patientName;
    int patientAge;
    String disease, dateOfArrival;
    Information info;
    Payment pay;

    public Patient(String patientName, int patientAge, String disease, String dateOfArrival,
                   Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.disease = disease;
        this.dateOfArrival = dateOfArrival;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Disease: " + this.disease);
        System.out.println("Date Of Arrival: " + this.dateOfArrival);
        System.out.println("Block Number: " + this.info.blockNo);
        System.out.println("Floor Number: " + this.info.floorNo);
        System.out.println("Room Number: " + this.info.roomNo);
        System.out.println("Bed Number: " + this.info.bedNo);
        System.out.println("Admission fees: " + this.pay.admFees);
        System.out.println("Registration fees: " + this.pay.regFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }

    public static void main(String[] args) {
        Information info = new Information('C', 3, 302, 4);
        Payment pay = new Payment(5000, 10000, 5000);
        Patient p1 = new Patient("ABC", 23, "Covid",
                "25/02/2026", info, pay);
        p1.patientDetails();
    }
}
