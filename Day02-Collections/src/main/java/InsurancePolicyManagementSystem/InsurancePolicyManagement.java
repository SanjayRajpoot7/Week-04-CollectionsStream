package InsurancePolicyManagementSystem;

import java.util.*;
import java.time.*;

class Policy {
    private String policyHolderName;
    private String policyNumber;
    private LocalDate expiryDate;

    // Constructor
    public Policy(String policyHolderName, String policyNumber, LocalDate expiryDate) {
        this.policyHolderName = policyHolderName;
        this.policyNumber = policyNumber;
        this.expiryDate = expiryDate;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate;
    }
}

public class InsurancePolicyManagement {

    // HashMap to store policies with policy number as key
    private static Map<String, Policy> policyMap = new HashMap<>();

    // LinkedHashMap to maintain the insertion order of policies
    private static Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();

    // TreeMap to store policies sorted by expiry date
    private static Map<LocalDate, List<Policy>> sortedPolicyMap = new TreeMap<>();

    // Add a policy
    public static void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);

        // Adding policy to TreeMap, sorting by expiry date
        sortedPolicyMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve a policy by its number
    public static Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring within the next 30 days
    public static void listPoliciesExpiringWithin30Days() {
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysLater = today.plusDays(30);

        System.out.println("Policies expiring within the next 30 days:");
        for (Policy policy : policyMap.values()) {
            if (!policy.getExpiryDate().isBefore(today) && policy.getExpiryDate().isBefore(thirtyDaysLater)) {
                System.out.println(policy);
            }
        }
    }

    // List all policies for a specific policyholder
    public static void listPoliciesForHolder(String holderName) {
        System.out.println("Policies for " + holderName + ":");
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolderName().equals(holderName)) {
                System.out.println(policy);
            }
        }
    }

    // Remove expired policies
    public static void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        policyMap.entrySet().removeIf(entry -> entry.getValue().getExpiryDate().isBefore(today));

        // Also remove from other maps
        orderedPolicyMap.entrySet().removeIf(entry -> entry.getValue().getExpiryDate().isBefore(today));
        sortedPolicyMap.values().forEach(policies -> policies.removeIf(policy -> policy.getExpiryDate().isBefore(today)));

        System.out.println("Expired policies have been removed.");
    }

    // Display all policies ordered by expiry date
    public static void displayPoliciesSortedByExpiryDate() {
        System.out.println("Policies sorted by expiry date:");
        for (Map.Entry<LocalDate, List<Policy>> entry : sortedPolicyMap.entrySet()) {
            for (Policy policy : entry.getValue()) {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        // Creating and adding some policies
        addPolicy(new Policy("Alice", "P123", LocalDate.of(2025, 5, 20)));
        addPolicy(new Policy("Bob", "P124", LocalDate.of(2023, 12, 15)));
        addPolicy(new Policy("Charlie", "P125", LocalDate.of(2025, 3, 10)));
        addPolicy(new Policy("Alice", "P126", LocalDate.of(2024, 6, 1)));

        // List policies expiring in the next 30 days
        listPoliciesExpiringWithin30Days();

        // List policies for a specific policyholder
        listPoliciesForHolder("Alice");

        // Remove expired policies
        removeExpiredPolicies();

        // Display all policies sorted by expiry date
        displayPoliciesSortedByExpiryDate();
    }
}

