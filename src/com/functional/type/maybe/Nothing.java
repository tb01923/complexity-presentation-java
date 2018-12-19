package com.functional.type.maybe;


import java.util.function.Function;

public class Nothing<T> extends Maybe<T> {

    private Nothing() {}

    public Nothing<T> chain(Function<T, Maybe<T>> f) {
        return this ;
    }

    public Nothing<T> map(Function<T, T> f) {

        return this ;
    }

    public T extract() {

        return null ;
    }

    public String toString() {

        return "Nothing()";
    }


    public static <T> Nothing<T> of(T ignored) {

        return new Nothing<T>() ;
    }

}