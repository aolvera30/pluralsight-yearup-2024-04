package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }


    public List<Person> findPeople(List<Person> people, int age)
    {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() == age) {
                result.add(person);
            }
        }
        return result;
    }

    public int calculateAverageAge(List<Person> people)
    {
        if (people.isEmpty()) {
            return 0;
        }
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return totalAge / people.size();

    }

    public int findOldestAge(List<Person> people)
    {
        if (people.isEmpty()) {
            return 0;
        }
        int oldestAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }
        }
        return oldestAge;

    }

    public int findYoungestAge(List<Person> people)
    {
        if (people.isEmpty()) {
            return 0;
        }
        int youngestAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }
        return youngestAge;

    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {
        // Create a copy of the original list
        List<Person> sortedList = new ArrayList<>(people);

        // Use the sort method with a Comparator to sort by age
        sortedList.sort(Comparator.comparingInt(Person::getAge));

        return sortedList;

    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        List<Person> sortedList = new ArrayList<>(people);

        sortedList.sort(Comparator.comparingInt(Person::getAge).reversed());

        return sortedList;
        
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        return new ArrayList<>();
    }
}
