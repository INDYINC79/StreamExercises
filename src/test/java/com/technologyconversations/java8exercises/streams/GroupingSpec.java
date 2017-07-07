package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.technologyconversations.java8exercises.streams.Grouping.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Group people by nationality
 */
public class GroupingSpec {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
    }
    
    public static Map<String, List<Person>> groupByNationality(List<Person> collection) {
    	Map<String, List<Person>> peopleByCountry =
    	        collection.stream().collect(Collectors.groupingBy(Person::getNationality));
    	System.out.println(peopleByCountry);
		return peopleByCountry;
    }

}
