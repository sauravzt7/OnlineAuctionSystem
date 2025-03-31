package com.machinecoding.models;

import com.machinecoding.factory.AuctionFactory;
import com.machinecoding.mediator.Auction;
import com.machinecoding.mediator.AuctionMediator;

public class Seller extends User  {
    private AuctionMediator auctionMediator;


    public Seller(String id, AuctionMediator auctionMediator) {
        super(id);
        this.auctionMediator = auctionMediator;
    }

    //seller can create auctions and track p&l

    public Auction createAuction(String auctionId, double lb, double ub, double fixedParticipationCost) {
        Auction auction = AuctionFactory.createAuctionForSeller(auctionId, lb, ub, fixedParticipationCost, super.getId());
        auctionMediator.addAuction(auctionId, auction);
        return auction;
    }


}
