package com.functional.type.maybe;

import java.util.function.Function ;

public class Just <T> extends Maybe<T> {

    private T value ;

    private Just(T value) {
        this.value = value ;
    }

    public Just<T> map(Function<T, T> f) {
        return Just.of(
                f.apply(this.value)
        ) ;
    }

    public Maybe<T> chain(Function<T, Maybe<T>> f) {

        return f.apply(this.value) ;
    }

    public T extract() {

        return this.value ;
    }

    public String toString() {

        return "Just(" + this.value + ")";
    }


    public static <T> Just<T> of(T value) {
        return new Just<T>(value) ;
    }

}