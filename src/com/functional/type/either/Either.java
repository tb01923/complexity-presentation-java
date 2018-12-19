package com.functional.type.either;

import com.functional.higherType.Functor;

import java.util.concurrent.Callable;

public abstract class Either<L, R> implements Functor<R, Either<L, R>> {

    public static <L, R> Either<L, R> tryable(Callable<R> f) {

        try{
            R r = f.call();
            return Right.of(r) ;
        }
        catch(Exception e) {
            // todo: why do I need to cast here?
            return (Either<L,R>)Left.of(e) ;
        }
    }
}