package com.functional.higherType;
import java.util.function.Function ;

public interface Functor <T, F> {
    F map(Function<T, T> f) ;
}
