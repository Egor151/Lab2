package org.example.student.service.impl;

import org.example.student.model.User;
import org.example.student.service.StudentInterface;

import java.util.Comparator;
import java.util.List;

public class StudentImpl implements StudentInterface {

    @Override
    public void printUsersSortedByLastName(List<User> users) {
        System.out.println("Вывод всех пользователей отсортированных по lastName: ");
        users.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .forEach(System.out::println);
    }

    @Override
    public void printUsersSortedByAge(List<User> users) {
        System.out.println("\nВывод всех пользователей отсортированных по age: ");
        users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(System.out::println);
    }

    @Override
    public void checkAllUsersAboveAge(List<User> users, int minAge) {
        boolean allAbove = users.stream()
                .allMatch(user -> user.getAge() > minAge);
        System.out.println("\nВсе пользователи старше " + minAge + " лет: " + allAbove);
    }

    @Override
    public void printAverageAge(List<User> users) {
        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        System.out.println("\nСредний возраст пользователей: " + averageAge);
    }

    @Override
    public void printDistinctCountriesCount(List<User> users) {
        long distinctCountries = users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
        System.out.println("\nКоличество различных стран проживания: " + distinctCountries);
    }
}
