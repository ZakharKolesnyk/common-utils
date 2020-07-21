package com.kolesnyk.zakhar.commonutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Common collect methods.
 */
public interface Collect {

    static <T> Set<T> setOf(T... items) {
        return Arrays.stream(items).collect(Collectors.toSet());
    }

    static <T> List<T> listOf(T... items) {
        return Arrays.stream(items).collect(Collectors.toList());
    }

    static <T> Set<T> emptySet() {
        return new HashSet<>();
    }

    static <T> List<T> emptyList() {
        return new ArrayList<>();
    }
}
