package com.technologyconversations.java8exercises.streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatCollection {

    private FlatCollection() {
    }

    public static List<String> transform7(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<List<String>> collection) {
        return null;
    }

}
