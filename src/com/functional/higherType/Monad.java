package com.functional.higherType;

import java.util.function.Function;

public interface Monad<T, F> extends Functor<T, F> {
    F chain(Function<T, F> f) ;
}
