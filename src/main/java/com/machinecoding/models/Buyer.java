package com.machinecoding.models;

import com.machinecoding.Bidder;


import com.machinecoding.mediator.AuctionMediator;

public class Buyer extends User implements Bidder {

    private AuctionMediator auctionMediator;
    public Buyer(String id, AuctionMediator auctionMediator) {
        super(id);
        this.auctionMediator = auctionMediator;
    }

    @Override
    public void placeBid(double amount, String auctionId) {
        auctionMediator.placeBid(this, amount, auctionId);
    }

    @Override
    public void updateBid(double amount) {

    }

    @Override
    public void withdrawBid(String auctionId) {
        auctionMediator.removeBidder(this, auctionId);
    }

    public String toString(){
        return getId();
    }
}
