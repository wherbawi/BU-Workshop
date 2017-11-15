package edu.bu.cameraready.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import edu.bu.cameraready.domain.Person;

public class LambdasHelloWorld {
	public static void main(String[] a) {
		List<Person> persons = Arrays.asList(new Person(20, "p2"), new Person(30, "p3"), new Person(10, "p1"));
		Collections.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}
}
