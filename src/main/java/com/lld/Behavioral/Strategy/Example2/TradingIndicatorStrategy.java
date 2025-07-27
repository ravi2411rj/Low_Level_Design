package com.lld.Behavioral.Strategy.Example2;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();

    Double calculateIndicator(Stock stock);
}
