package com.functional.higherType;

import java.util.function.Function;

public interface ApplicativeFunctor<T, A extends ApplicativeFunctor<?, ?>> extends Functor<T, A> {
    A ap(Functor<?, ?> f) ;
}
