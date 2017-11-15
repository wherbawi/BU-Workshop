package edu.bu.cameraready.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.bu.cameraready.domain.Person;

public class ComparatorInnerClassApproach {

	public static void main(String[] a) {
		List<Person> persons = Arrays.asList(new Person(20, "p2"), new Person(30, "p3"), new Person(10, "p1"));
		Collections.sort(persons, new PersonComparator());
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

	static class PersonComparator implements Comparator<Person> {
		public int compare(Person o1, Person o2) {
			return o1.getAge() - o2.getAge();
		}

	}
}
