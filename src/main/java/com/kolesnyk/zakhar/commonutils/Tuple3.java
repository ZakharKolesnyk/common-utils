package com.kolesnyk.zakhar.commonutils;


public class Tuple3<FIRST, SECOND, THIRD> {
    public final FIRST first;
    public final SECOND second;
    public final THIRD third;

    public Tuple3(FIRST first, SECOND second, THIRD third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }

    public THIRD getThird() {
        return third;
    }
}
