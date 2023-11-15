package StrategyPattern;

class Client {
  public StrategyBase strategy;

  public Client(StrategyBase strategy) {
      this.strategy = strategy;
  }

  public void callAlgorithm() {
      System.out.println(strategy.algorithm());
  }
}