package com.functional.util;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Curry3<A, B, C, D> {
    public static <A, B, C, D> Function<A, Function<B, C>> toCurry(BiFunction<A, B, C> f) {
        return (A a) -> (B b) -> f.apply(a, b) ;
    }

    public static <A, B, C, D> BiFunction<A, B, C>  toTuple(Function<A, Function<B, C>> f) {
        return (A a, B b) -> f.apply(a).apply(b) ;
    }
}