package com.machinecoding.strategy;

import com.machinecoding.Bidder;

import java.util.Map;

public interface WinningStrategy {

    Bidder findWinner(Map<Bidder, Double> bidders);
}
