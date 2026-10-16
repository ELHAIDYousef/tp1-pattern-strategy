
public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        context.useStrategy();

        context.setStrategy(new StrategyImpl2());

        context.useStrategy();
    }
}
