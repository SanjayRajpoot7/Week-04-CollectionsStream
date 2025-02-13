package DesignVotingSystem;

import java.util.*;

public class VotingSystem {

    // Method to add votes to the system
    public static void castVote(LinkedHashMap<String, Integer> voteOrder, HashMap<String, Integer> voteCount, String candidate) {
        // Increment the vote count for the candidate
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        // Add the candidate to the LinkedHashMap to maintain the order of voting
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    // Method to display the results in sorted order
    public static void displayResults(HashMap<String, Integer> voteCount) {
        // Use TreeMap to sort the votes in descending order
        TreeMap<Integer, List<String>> sortedVotes = new TreeMap<>(Collections.reverseOrder());

        // Populate the TreeMap with vote counts
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            sortedVotes.putIfAbsent(entry.getValue(), new ArrayList<>());
            sortedVotes.get(entry.getValue()).add(entry.getKey());
        }

        // Display the sorted results
        System.out.println("Voting Results (Sorted by Votes):");
        for (Map.Entry<Integer, List<String>> entry : sortedVotes.entrySet()) {
            System.out.println("Votes: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Method to display the order in which votes were cast
    public static void displayVoteOrder(LinkedHashMap<String, Integer> voteOrder) {
        System.out.println("\nVoting Order:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " (Votes: " + entry.getValue() + ")");
        }
    }

    public static void main(String[] args) {
        // HashMap to store vote count for each candidate
        HashMap<String, Integer> voteCount = new HashMap<>();

        // LinkedHashMap to store the order in which votes were cast
        LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

        // Simulating voting
        castVote(voteOrder, voteCount, "Alice");
        castVote(voteOrder, voteCount, "Bob");
        castVote(voteOrder, voteCount, "Alice");
        castVote(voteOrder, voteCount, "Charlie");
        castVote(voteOrder, voteCount, "Bob");
        castVote(voteOrder, voteCount, "Alice");

        // Display the results in sorted order
        displayResults(voteCount);

        // Display the order in which votes were cast
        displayVoteOrder(voteOrder);
    }
}

