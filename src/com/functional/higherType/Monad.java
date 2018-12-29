package com.functional.higherType;

import java.util.function.Function;

public interface Monad<T, M extends Monad<?, ?>> extends ApplicativeFunctor<T, M> {
    M chain(Function<T, M> f) ;
}
