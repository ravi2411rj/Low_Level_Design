package com.lld.Behavioral.Strategy.Example2;

public class MomentumStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}