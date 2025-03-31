package com.machinecoding;

import com.machinecoding.mediator.Auction;
import com.machinecoding.mediator.AuctionMediator;
import com.machinecoding.mediator.AuctionMediatorImpl;
import com.machinecoding.models.Buyer;
import com.machinecoding.models.Seller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CREATE_AUCTION
        AuctionMediator auctionMediator = new AuctionMediatorImpl();

        //ADD_BUYER

        Bidder buyer1 = new Buyer("buyer1", auctionMediator);
        Bidder buyer2 = new Buyer("buyer2", auctionMediator);
        Bidder buyer3 = new Buyer("buyer3", auctionMediator);

        //ADD_SELLER
        Seller seller = new Seller("seller1", auctionMediator);
        //CREATE_AUCTION
        Auction auction1 = seller.createAuction("A1", 10, 50, 1);

        //CREATE_BID

        buyer1.placeBid(17, "A1");
        buyer2.placeBid(15, "A1");
        buyer2.placeBid(19, "A1");
        buyer3.placeBid(19, "A1");


        //CLOSE_AUCTION
        auctionMediator.closeAuction("A1");

        Seller seller2 = new Seller("seller2", auctionMediator);
        seller.createAuction("A2", 10, 50, 1);
        buyer3.placeBid(25, "A2");
        buyer2.placeBid(5, "A2");
        buyer2.withdrawBid("A2");

        auctionMediator.closeAuction("A2");




    }
}