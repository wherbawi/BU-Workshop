package edu.bu.cameraready.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.bu.cameraready.domain.Person;

public class LambdasWithStreamsHelloWorld {
	public static void main(String[] a) {
		List<Person> persons = Arrays.asList(new Person(20, "p2"), new Person(30, "p3"), new Person(10, "p1"));
		persons.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(System.out::println);

	}
}
