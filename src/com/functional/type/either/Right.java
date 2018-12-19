package com.functional.type.either;

import java.util.function.Function;

public class Right<L, R> extends Either<L, R> {

    private R value ;

    private Right(R value) {

        this.value = value ;
    }

    public Right<L, R> map(Function<R, R> f) {
        return Right.of(
                f.apply(this.value)
        ) ;
    }

    public R extract() {
        return this.value ;
    }

    public String toString() {
        return "Right(" + this.value + ")";
    }


    public static <L, R> Right<L, R> of(R value) {

        return new Right<>(value) ;
    }

}