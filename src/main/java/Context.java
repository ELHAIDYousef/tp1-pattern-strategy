import javax.sound.midi.Soundbank;

public class Context {
    Strategy strategy = new StrategyImpl1();

    public void useStrategy(){
        System.out.println("==========================================");
        strategy.doSomething();
        System.out.println("==========================================");
    }
}
