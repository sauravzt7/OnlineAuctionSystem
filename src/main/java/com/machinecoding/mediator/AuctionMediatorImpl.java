package com.machinecoding.mediator;

import com.machinecoding.Bidder;

import java.util.HashMap;
import java.util.Map;

public class AuctionMediatorImpl implements AuctionMediator {
    private Map<String, Auction> auctionMap;

    public AuctionMediatorImpl() {
        auctionMap = new HashMap<String, Auction>();
    }

    public Map<String, Auction> getAuctionMap() {
        return auctionMap;
    }

    @Override
    public void addAuction(String id, Auction auction) {
        auctionMap.put(id, auction);
    }

    @Override
    public void addBidder(Bidder bidder, String auctionId) {
        auctionMap.get(auctionId).addBidder(bidder);
    }

    @Override
    public void removeBidder(Bidder bidder, String auctionId) {
        auctionMap.get(auctionId).removeBidder(bidder);
    }


    @Override
    public void placeBid(Bidder bidder, double amount, String auctionId) {
        auctionMap.get(auctionId).placeBid(bidder, amount);
    }

    @Override
    public Bidder closeAuction(String auctionId) {
        Bidder winner = auctionMap.get(auctionId).closeAuction();
        auctionMap.remove(auctionId);
        return winner;
    }
}
