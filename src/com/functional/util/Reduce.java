package com.functional.util;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Reduce<T, R> {
    private static <T> T head(T list[]) {

        return list[0] ;
    }

    private static <T> T[] tail(T list[]) {

        return java.util.Arrays.copyOfRange(list, 1, list.length);
    }

    public static <T, R> R array(BiFunction<R, T, R> combiner, R aggregate, T list[]) {

        if(list.length == 0) {
            return aggregate ;
        }

        return Reduce.array(
                combiner,
                combiner.apply(aggregate, head(list)),
                tail(list)
        ) ;
    }

    public static <T, R> Function<T[], R>  arrayAggregate(BiFunction<R, T, R> combiner, R aggregate) {

        return (T list[]) ->
                Reduce.array(
                        combiner,
                        aggregate,
                        list) ;
    }

}