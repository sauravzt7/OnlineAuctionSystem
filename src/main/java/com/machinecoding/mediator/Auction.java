package com.machinecoding.mediator;

import com.machinecoding.Bidder;
import com.machinecoding.models.Buyer;
import com.machinecoding.models.Seller;
import com.machinecoding.strategy.HighestUniqueBidStrategy;
import com.machinecoding.strategy.WinningStrategy;

import java.util.*;

public class Auction {

    private final String id;
    private final String sellerId;
    private final Map<Bidder, Double> biddersMap;
    private final double fixedParticipationCost;
    private final double lowestBidLimit;
    private final double highestBidLimit;
    private final WinningStrategy winningStrategy;
    private final List<Bidder> bidderList;


    public Auction(String id, double lowestBidLimit, double highestBidLimit, double fixedParticipationCost, String sellerId ) {
        this.id = id;
        this.sellerId = sellerId;
        this.fixedParticipationCost = fixedParticipationCost;
        this.lowestBidLimit = lowestBidLimit;
        this.highestBidLimit = highestBidLimit;
        this.biddersMap = new HashMap<>();
        winningStrategy = new HighestUniqueBidStrategy();
        this.bidderList = Collections.synchronizedList(new ArrayList<>());
    }


    public void addBidder(Bidder bidder) {
        bidderList.add(bidder);
    }

    public void removeBidder(Bidder bidder) {
        biddersMap.remove(bidder);
    }

    public void placeBid(Bidder bidder, double amount) {
            biddersMap.put(bidder, amount);
    }

    public Bidder closeAuction() {
        return winningStrategy.findWinner(biddersMap);
    }


    public String getId() {
        return id;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public List<Bidder> getBidders() {
        return new ArrayList<>(biddersMap.keySet());
    }

    public double getFixedParticipationCost() {
        return fixedParticipationCost;
    }

    public double getLowestBidLimit() {
        return lowestBidLimit;
    }

    public double getHighestBidLimit() {
        return highestBidLimit;
    }
}
