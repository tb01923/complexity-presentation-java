package com.functional;

import java.util.function.Function;
import java.util.function.BiFunction;
import com.functional.util.Curry2 ;

public class DemoCurry extends Demo {

    private static Function<Integer, Function<Integer, Integer>> curryAdd = Curry2.toCurry(add) ;

    private static Function<Integer, Integer> increment = curryAdd.apply(1) ;

    private static BiFunction<Integer, Integer, Integer> tupleAdd = Curry2.toTuple(curryAdd) ;


    public static void demo() {


        System.out.println("Increment(10): " + increment.apply(10));

        System.out.println("tupleAdd(1,2): " + tupleAdd.apply(1,2));

    }
}
