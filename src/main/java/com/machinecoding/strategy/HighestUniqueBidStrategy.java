package com.machinecoding.strategy;

import com.machinecoding.Bidder;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HighestUniqueBidStrategy implements WinningStrategy {


    @Override
    public Bidder findWinner(Map<Bidder, Double> bidders) {

        Bidder winner =  findHighestUniqueBid(bidders).get();
        System.out.println("Winner: " + winner.toString() + "(highest unique bid " + bidders.get(winner) + ")");
        return winner;
    }

    private static Optional<Bidder> findHighestUniqueBid(Map<Bidder, Double> bids) {
        Map<Double, Integer> bidCount = new HashMap<>();

        // Count occurrences of each bid
        for (Double bid : bids.values()) {
            bidCount.put(bid, bidCount.getOrDefault(bid, 0) + 1);
        }

        // Find the highest unique bid
        return bids.entrySet().stream()
                .filter(entry -> bidCount.get(entry.getValue()) == 1) // Keep only unique bids
                .max(Map.Entry.comparingByValue()) // Get the max bid
                .map(Map.Entry::getKey); // Return only the Bidder
    }
}
