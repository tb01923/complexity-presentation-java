package com.functional.util;

import java.util.function.BiFunction;
import java.util.function.Function;

// Need to define TriFunction
public class Curry3<A, B, C, D> {
    public static <A, B, C, D> Function<A, Function<B, Function<C, D>>> toCurry(BiFunction<A, B, D> f) {
        return (A a) -> (B b) -> (C c) -> f.apply(a, b) ;
    }

    public static <A, B, C, D> BiFunction<A, B, D>  toTuple(Function<A, Function<B, D>> f) {
        return (A a, B b) -> f.apply(a).apply(b) ;
    }
}