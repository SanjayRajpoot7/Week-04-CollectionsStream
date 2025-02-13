package InsurancePolicy;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


    class InsurancePolicy {
        String policyNumber;
        String policyholderName;
        LocalDate expiryDate;
        String coverageType;
        double premiumAmount;

        public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        @Override
        public String toString() {
            return policyNumber + " | " + policyholderName + " | " + expiryDate + " | " + coverageType + " | " + premiumAmount;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof InsurancePolicy && ((InsurancePolicy) obj).policyNumber.equals(this.policyNumber);
        }

        @Override
        public int hashCode() {
            return policyNumber.hashCode();
        }
    }

    public class InsurancePolicyManager {

        private Set<InsurancePolicy> hashSet = new HashSet<>();
        private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        private Set<InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(policy -> policy.expiryDate));

        public void addPolicy(InsurancePolicy policy) {
            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        public void showPolicies() {
            System.out.println("All policies:");
            hashSet.forEach(System.out::println);
        }

        public void showExpiringSoon() {
            LocalDate now = LocalDate.now();
            System.out.println("Expiring soon (30 days):");
            hashSet.stream().filter(policy -> ChronoUnit.DAYS.between(now, policy.expiryDate) <= 30).forEach(System.out::println);
        }

        public static void main(String[] args) {
            InsurancePolicyManager manager = new InsurancePolicyManager();

            // Adding some policies
            manager.addPolicy(new InsurancePolicy("P001", "John", LocalDate.now().plusDays(10), "Health", 500));
            manager.addPolicy(new InsurancePolicy("P002", "Alice", LocalDate.now().plusDays(20), "Auto", 700));
            manager.addPolicy(new InsurancePolicy("P003", "Bob", LocalDate.now().plusDays(5), "Home", 300));

            // Display all policies
            manager.showPolicies();

            // Display policies expiring soon
            manager.showExpiringSoon();
        }
    }


