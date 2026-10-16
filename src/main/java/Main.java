import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Context context = new Context();

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(n >= 0){
            System.out.println("The default strategy ==> 0");
            System.out.println("The first strategy   ==> 1");
            System.out.println("The second strategy  ==> 2");
            System.out.println("The third strategy   ==> 3");
            System.out.println("Close the app ==> -1");

            System.out.print("Choose which strategy to use: ");
            n = sc.nextInt();

            if ( n < 0 || n > 3) return ;

            Strategy strategy =(Strategy) Class.forName("StrategyImpl" + n).getConstructor().newInstance();

            context.setStrategy(strategy);

            context.useStrategy();


        }
    }
}
