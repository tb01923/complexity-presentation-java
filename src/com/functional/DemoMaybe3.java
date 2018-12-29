package com.functional;

import com.functional.type.maybe.Maybe;

import java.util.function.Function;

public class DemoMaybe3 extends Demo {



    public static void demo() {

        Function<Integer, Integer> increment =
                x -> x + 1 ;

        Maybe<?> maybeIncrement = Maybe.fromNullable(increment) ;

        Maybe<?> possibly11 = maybeIncrement.ap(Maybe.fromNullable(10)) ;

        System.out.println("ApplicativeFunctor Maybe (increment).map(Just 10): " + possibly11);

    }
}
