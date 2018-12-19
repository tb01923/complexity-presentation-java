package com.functional;

import com.functional.type.maybe.Maybe;

import java.util.function.Function;

public class DemoMaybe2 extends Demo {


    private static Maybe<Integer> getSomethingOrNothing() {

        Integer x = trueOrFalse.getAsBoolean()
                ? getRandom()
                : null ;

        return Maybe.fromNullable(x);
        //=> Maybe<Integer>
    }


    public static void demo() {

        Function<Integer, Maybe<Integer>> maybeIncrement =
                x -> Maybe.fromNullable(x) ;

        Maybe<?> somethingOrNothing =
                getSomethingOrNothing().
                        map(square).
                        chain(maybeIncrement).
                        map(half) ;

        System.out.println("Value: " + somethingOrNothing);

    }
}
