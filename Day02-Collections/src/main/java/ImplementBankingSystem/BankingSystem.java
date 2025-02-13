package ImplementBankingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.LinkedList;

public class BankingSystem {
    public static void customerAscending(Map<Integer, Integer> map){
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            treeMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(treeMap);

    }
    public static void WithdrawalRequests(Map<Integer, Integer> map, Queue<int[]> withdrawalQueue) {
        while (!withdrawalQueue.isEmpty()) {
            int[] request = withdrawalQueue.poll(); // Get the next withdrawal request
            int accountNumber = request[0];
            int withdrawalAmount = request[1];

            // Check if the customer has enough balance
            if (map.containsKey(accountNumber)) {
                int currentBalance = map.get(accountNumber);
                if (currentBalance >= withdrawalAmount) {
                    map.put(accountNumber, currentBalance - withdrawalAmount); // Deduct the amount
                    System.out.println("Withdrawal of " + withdrawalAmount + " processed for account " + accountNumber);
                } else {
                    System.out.println("Insufficient funds for account " + accountNumber);
                }
            } else {
                System.out.println("Account number " + accountNumber + " not found.");
            }
        }
    }


    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(97342123,5000);
        map.put(92577282,1200);
        map.put(47829323,3400);
        map.put(35627893,2300);
        map.put(87654344,7000);

        Queue<int[]> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add(new int[]{97342123, 200});
        withdrawalQueue.add(new int[]{92577282, 40000});
        withdrawalQueue.add(new int[]{47829323, 350});
        withdrawalQueue.add(new int[]{35627893, 1700});

        customerAscending(map);
        WithdrawalRequests(map,withdrawalQueue);
    }
}
