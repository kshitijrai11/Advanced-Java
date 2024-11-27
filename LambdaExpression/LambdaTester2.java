import java.util.function.*;

public class LambdaTester2 {
    public static void main(String[] args) {
        LambdaTester2 t = new LambdaTester2();

        // With type declaration
        MathOperation add = (int a, int b) -> a + b;

        // Without type declaration
        MathOperation sub = (a, b) -> a - b;

        // With return statement along with curly braces
        MathOperation multi = (int a, int b) -> { return a * b; };

        // Without return statement and without curly braces
        MathOperation div = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + t.operate(10, 5, add));
        System.out.println("10 - 5 = " + t.operate(10, 5, sub));
        System.out.println("10 * 5 = " + t.operate(10, 5, multi));
        System.out.println("10 / 5 = " + t.operate(10, 5, div));

        GreetingService g1 = (message) -> {
            System.out.println("hello " + message);
        };

        GreetingService g2 = (message) -> {
            System.out.println("hello " + message);
            System.out.println("hey " + message);
        };

        g1.sayMessage("Ram");
        g2.sayMessage("Ram");
    }

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);

        // Static method in functional interface is allowed
        static void show() {}
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
