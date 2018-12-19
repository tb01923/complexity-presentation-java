package com.functional;

import com.functional.type.maybe.Maybe;

public class DemoMaybe extends Demo {


    private static Maybe<Integer> getSomethingOrNothing() {

        Integer x = trueOrFalse.getAsBoolean()
                ? getRandom()
                : null ;

        return Maybe.fromNullable(x);
        //=> Maybe<Integer>
    }


    public static void demo() {

        Maybe<?> somethingOrNothing =
                getSomethingOrNothing().
                        map(square).
                        map(half) ;

        System.out.println("Value: " + somethingOrNothing);

    }
}
