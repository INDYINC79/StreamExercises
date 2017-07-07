package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Return people names separated by comma
 */
public class JoiningSpec {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertThat(namesToString(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }
    
    public static String namesToString(List<Person> collection) {
    	 String commaSeparatedNames = collection.stream()
    	     .map(i -> i.getName()).collect(Collectors.joining(", ", "Names: ", "."));
    	 System.out.println(commaSeparatedNames.toString());
    	return commaSeparatedNames;
    }
}
