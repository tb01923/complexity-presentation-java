package com.functional;

import com.functional.type.either.Either;

import java.util.concurrent.Callable;

public class DemoEither extends Demo {


    private static Either<Exception, Integer> getSomethingOrError() {

        Callable f = trueOrFalse.getAsBoolean()
                ? okay
                : oops;

        return Either.tryable(f);
        //=> Either<Exception, Integer>
    }


    public static void demo() {

        Either<?,?> somethingOrError =
                getSomethingOrError().
                        map(square).
                        map(half) ;

        System.out.println("Functor Either.tryable(f) half(square(E`    ither x)): " + somethingOrError);

    }
}
