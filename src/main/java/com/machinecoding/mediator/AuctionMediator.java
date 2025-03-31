package com.machinecoding.mediator;

import com.machinecoding.Bidder;

public interface AuctionMediator {
    void addAuction(String id, Auction auction);
    void addBidder(Bidder bidder, String auctionId);
    void removeBidder(Bidder bidder, String auctionId);
    void placeBid(Bidder bidder, double amount, String auctionId);
    Bidder closeAuction(String auctionId);
}
