package com.functional;

import java.util.function.Function;
import com.functional.util.Reduce;

public class DemoReduce extends Demo {

    private static Function<Integer[], Integer> sumArray = Reduce.arrayAggregate(add, 0) ;

    public static void demo() {

        Integer [] list = { 1, 2, 3, 4 } ;

        Integer ten = Reduce.array(add, 0, list) ;

        System.out.println("Reduce(add, 0, [1,2,3,4]): " + ten);

        System.out.println("sumArray([1,2,3,4]): " + sumArray.apply(list));

    }
}
