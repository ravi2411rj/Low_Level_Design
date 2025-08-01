package com.lld.Behavioral.Strategy.Example2;

public class MovingAverageStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}
