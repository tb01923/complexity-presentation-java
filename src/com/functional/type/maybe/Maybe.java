package com.functional.type.maybe;

import com.functional.higherType.Monad;
import com.functional.higherType.Functor;

public abstract class Maybe<T> implements Monad<T, Maybe<T>> {

    public abstract T extract() ;

    public static <T> Maybe<T> fromNullable(T value) {
        if(value != null){
            return Just.of(value) ;
        }

        return Nothing.of(null) ;
    }

}
