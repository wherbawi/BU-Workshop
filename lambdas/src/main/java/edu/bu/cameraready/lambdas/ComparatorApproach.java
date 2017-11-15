package edu.bu.cameraready.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.bu.cameraready.domain.Person;

public class ComparatorApproach {

	public static void main(String[] a) {
		List<Person> persons = Arrays.asList(new Person(20, "p2"), new Person(30, "p3"), new Person(10, "p1"));
		Comparator<Person> ageComparator = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		};

		Collections.sort(persons, ageComparator);
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

}
