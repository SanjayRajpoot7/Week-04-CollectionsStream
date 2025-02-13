package Queue_Interface;

import java.util.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Comparator;

class Patient  {

        String name;
        int severity;

        // Constructor to initialize the patient
        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        // Override toString method to print the patient's name and severity
        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    public class HospitalTriageSystem {
        public static void main(String[] args) {
            // Create a priority queue with a custom comparator (max-heap based on severity)
            PriorityQueue<Patient> pq = new PriorityQueue<>(new Comparator<Patient>() {
                @Override
                public int compare(Patient p1, Patient p2) {
                    // Compare based on severity in descending order
                    return Integer.compare(p2.severity, p1.severity);
                }
            });

            // Add patients to the priority queue
            pq.offer(new Patient("John", 3));
            pq.offer(new Patient("Alice", 5));
            pq.offer(new Patient("Bob", 2));

            // Simulate treating patients by removing from the queue (highest severity first)
            System.out.println("Treating patients in order of severity:");
            while (!pq.isEmpty()) {
                Patient patient = pq.poll();
                System.out.println(patient);
            }
        }
    }
