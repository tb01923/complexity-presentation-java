package com.functional.util;

import java.util.function.Function;
import java.util.function.BiFunction;

public class Curry2 <A, B, C> {
    public static <A, B, C> Function<A, Function<B, C>> toCurry(BiFunction<A, B, C> f) {
        return (A a) -> (B b) -> f.apply(a, b) ;
    }

    public static <A, B, C> BiFunction<A, B, C>  toTuple(Function<A, Function<B, C>> f) {
        return (A a, B b) -> f.apply(a).apply(b) ;
    }
}