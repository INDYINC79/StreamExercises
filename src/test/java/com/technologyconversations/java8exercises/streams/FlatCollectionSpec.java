package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static com.technologyconversations.java8exercises.streams.FlatCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Flatten multidimensional collection
 */
public class FlatCollectionSpec {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }
    
    public static List<String> transform (List<List<String>> collection){
    	List<String> singleList = collection.stream().flatMap(c -> c.stream()).collect(Collectors.toList());
    	return singleList;
    }

}
