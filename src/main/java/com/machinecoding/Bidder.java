package com.machinecoding;

public interface Bidder {

    void placeBid(double amount, String auctionId);
    void updateBid(double amount);
    void withdrawBid(String auctionId);

}
