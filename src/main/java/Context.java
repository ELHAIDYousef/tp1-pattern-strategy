import javax.sound.midi.Soundbank;

public class Context {
    private Strategy strategy = new StrategyImpl0();

    public void useStrategy(){
        System.out.println("==========================================");
        strategy.doSomething();
        System.out.println("==========================================");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
