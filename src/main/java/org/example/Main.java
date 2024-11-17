package org.example;

import org.example.student.model.User;
import org.example.student.service.StudentInterface;
import org.example.student.service.impl.StudentImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Alice", "Smith", 25, "USA"),
                new User(2, "Bob", "Johnson", 30, "Canada"),
                new User(3, "Charlie", "Brown", 22, "USA"),
                new User(4, "David", "Williams", 35, "UK"),
                new User(5, "Eva", "Davis", 19, "Germany"),
                new User(6, "Frank", "Clark", 40, "France"),
                new User(7, "Grace", "Taylor", 28, "Canada")
        );

        StudentInterface studentService = new StudentImpl();

        studentService.printUsersSortedByLastName(users);
        studentService.printUsersSortedByAge(users);
        studentService.checkAllUsersAboveAge(users, 7);
        studentService.printAverageAge(users);
        studentService.printDistinctCountriesCount(users);
    }
}