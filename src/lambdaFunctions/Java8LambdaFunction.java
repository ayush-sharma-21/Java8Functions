package lambdaFunctions;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class Java8LambdaFunction {
    public static void main(String[] args) {

//        Mathemetical operation using lambda finction
        IntBinaryOperator sumOperation = (int a, int b) -> a + b;
        System.out.println("Using lambda function : " + sumOperation.applyAsInt(10, 14));


    }
}
