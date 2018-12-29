package com.functional.higherType;
import java.util.function.Function ;

public interface Functor <T, F extends Functor<?, ?>> {
    F map(Function<T, T> f) ;
}
