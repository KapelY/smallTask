package com.company;

import java.util.Arrays;
import java.util.Collection;

public class GenericType {
    public static void transform(Object[] input, Collection<Object> collection) {
        collection.addAll(Arrays.asList(input));
    }
}
