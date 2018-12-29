package com.functional.type.maybe;

import com.functional.higherType.Functor;
import sun.rmi.transport.ObjectTable;

import java.util.function.Function ;

public class Just <T> extends Maybe<T> {

    private T value ;

    private Just(T value) {
        this.value = value ;
    }

    public Just<T> ap(Functor<?,?> v) {

        Function thisF = (Function)this.value ;
        Just justV = (Just)v;
        return justV.map(thisF) ;

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

    public boolean  isJust() {
        return true ;
    }

}