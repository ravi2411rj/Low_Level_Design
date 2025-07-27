package com.lld.Behavioral.Strategy.Example2;

public class StockTradingManager {

    private final TradingStrategyType strategyType;
    private TradingIndicatorStrategy tradingIndicatorStrategy;

    public StockTradingManager(TradingStrategyType strategyType, TradingIndicatorStrategy tradingIndicatorStrategy) {
        this.strategyType = strategyType;
        this.tradingIndicatorStrategy = tradingIndicatorStrategy;
    }

    public Double calculateIndicator(Stock stock) {
        return switch (strategyType) {
            case MOVING_AVERAGES -> {
                tradingIndicatorStrategy = new MovingAverageStrategy();
                yield tradingIndicatorStrategy.calculateIndicator(stock);
            }
            case MOMENTUM -> {
                tradingIndicatorStrategy = new MomentumStrategy();
                yield tradingIndicatorStrategy.calculateIndicator(stock);
            }
            case VOLATILITY -> {
                tradingIndicatorStrategy = new VolatilityStrategy();
                yield tradingIndicatorStrategy.calculateIndicator(stock);
            }
        };
    }
}
