package com.machinecoding.factory;

import com.machinecoding.mediator.Auction;
import com.machinecoding.models.Seller;

public class AuctionFactory {

    public static Auction createAuctionForSeller(String id, double lb, double ub, double pc, String sellerId) {
        return new Auction(id, ub, pc, lb, sellerId);
    }
}
