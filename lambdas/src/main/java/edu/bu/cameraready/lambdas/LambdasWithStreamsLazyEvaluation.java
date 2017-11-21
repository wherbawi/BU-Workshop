package edu.bu.cameraready.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import edu.bu.cameraready.domain.Person;

public class LambdasWithStreamsLazyEvaluation {
	public static void main(String[] a) {
		List<Person> persons = Arrays.asList(new Person(20, "p2"), new Person(30, "p3"), new Person(10, "p1"));
		persons.stream().filter(p -> {
			System.out.println("filtering person" + p);
			return p.getAge() > 15;
		}).sorted((p1, p2) -> {
			System.out.println("comparison step");
			return p1.getAge() - p2.getAge();
		}).forEach(System.out::println);
		

}
}