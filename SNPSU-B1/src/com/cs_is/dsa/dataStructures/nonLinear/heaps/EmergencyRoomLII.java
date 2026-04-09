package com.cs_is.dsa.dataStructures.nonLinear.heaps;
import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

// Comparator : Multiple Values
class Patient {
    String name;
    int severity; // 1 = High, 3 = Medium, 5 = Low
    LocalDateTime arrivalTime;

    public Patient(String name, int severity, LocalDateTime arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }
    @Override
    public String toString(){
        return name + " (severity=" + severity + ", arrival=" +
                arrivalTime + ")";
    }
}
public class EmergencyRoomLII {
    public static void main(String[] args) {
        // Custom Comparator : first by severity, then by arrival time
        Queue<Patient> queue = new PriorityQueue<>(
                (p1, p2) -> {
                    if(p1.severity != p2.severity){
                        return Integer.compare(p1.severity, p2.severity);
                    }else {
                        return p1.arrivalTime.compareTo(p2.arrivalTime);
                    }
                }
        );
        // Simulating patient arrivals with actual timestamp
        queue.offer(new Patient("Allen", 3,
                LocalDateTime.of(2026, 4, 9, 10,0)));
        queue.offer(new Patient("Joe", 1,
                LocalDateTime.of(2026, 4, 9, 10,5)));
        queue.offer(new Patient("Britney", 1,
                LocalDateTime.of(2026, 4, 9, 10,2)));
        // Let's print the patient who's treated first
        Patient treated = queue.poll();
        System.out.println("Patient that gets operated first: " + treated);
        // Remaining patients
        System.out.println("Patients in queue: " + queue);
    }
}
