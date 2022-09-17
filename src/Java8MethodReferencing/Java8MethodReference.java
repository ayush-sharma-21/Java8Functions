package Java8MethodReferencing;

import java.util.ArrayList;
import java.util.function.IntBinaryOperator;

public class Java8MethodReference {
    public static void main(String[] args) {

//        Mathematical operations using method referencing
        IntBinaryOperator intBinaryOperator = Integer::sum;
        System.out.println("Using method referencing : " + intBinaryOperator.applyAsInt(2, 3));

//        print list of data using method referencing
        ArrayList<String> list = new ArrayList<>();
        list.add("ayush");
        list.add("shivam");
        list.add("kunal");
        System.out.println(list);
        list.forEach(System.out::println);
    }
}
