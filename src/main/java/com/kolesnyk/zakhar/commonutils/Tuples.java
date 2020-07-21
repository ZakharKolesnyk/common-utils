package com.kolesnyk.zakhar.commonutils;

/**
 * Common tuple methods.
 */
public interface Tuples {

    static <X, Y, Z> Tuple3<X, Y, Z> of(X first, Y second, Z third) {
        return new Tuple3<>(first, second, third);
    }

    static <X, Y> Tuple2<X, Y> of(X first, Y second) {
        return new Tuple2<>(first, second);
    }

}
