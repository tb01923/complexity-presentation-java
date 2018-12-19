package com.functional;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Demo {

    protected static int getRandom() {
        Random rand = new Random();
        return rand.nextInt(50) + 1;
    }

    protected static BooleanSupplier trueOrFalse = () -> getRandom() % 2 == 0 ;

    protected static Function<Integer, Integer> increment = (Integer x) -> x + 1;
    protected static Function<Integer, Integer> square = (Integer x) -> x * x ;
    protected static Function<Integer, Integer> half = (Integer x) -> x / 2 ;

    protected static BiFunction<Integer, Integer, Integer> add = (Integer a, Integer b) -> a + b ;

    protected static Callable okay = () -> getRandom() ;

    protected static Callable oops = () -> {
        throw new Exception("oops") ;
    };

}
