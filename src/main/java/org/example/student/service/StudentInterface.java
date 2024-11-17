package org.example.student.service;

import org.example.student.model.User;

import java.util.List;

public interface StudentInterface {

    void printUsersSortedByLastName(List<User> users);

    void printUsersSortedByAge(List<User> users);

    void checkAllUsersAboveAge(List<User> users, int minAge);

    void printAverageAge(List<User> users);

    void printDistinctCountriesCount(List<User> users);
}
