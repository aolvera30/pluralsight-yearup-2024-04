package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        return people.stream()
                     .filter(person -> person.getFirstName().equalsIgnoreCase(name))
                     .collect(Collectors.toList());
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        return people.stream()
                     .filter(person -> person.getAge() == age)
                     .collect(Collectors.toList());
    }

    public int calculateAverageAge(List<Person> people)
    {
        OptionalDouble average = people.stream()
                                       .mapToInt(Person::getAge)
                                       .average();
        return average.isPresent() ? (int) average.getAsDouble() : 0;
    }

    public int findOldestAge(List<Person> people)
    {
        return 0;
    }

    public int findYoungestAge(List<Person> people)
    {
        return 0;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {
        return new ArrayList<>();
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        return new ArrayList<>();
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
