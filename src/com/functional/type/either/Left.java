package com.functional.type.either;

import java.util.function.Function;

public class Left<L, R> extends Either<L, R> {

    private L value ;

    private Left(L value) {
        this.value = value ;
    }

    public Left<L, R> map(Function<R, R> f) {
        return this ;
    }

    public L extract() {
        return this.value ;
    }

    public String toString() {
        return "Left(" + this.value + ")";
    }


    public static <L, R> Left<L, R> of(L value) {

        return new Left<>(value) ;
    }

}