package com.kolesnyk.zakhar.commonutils;


public class Tuple2<FIRST, SECOND> {
    public final FIRST first;
    public final SECOND second;

    public Tuple2(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }
}
