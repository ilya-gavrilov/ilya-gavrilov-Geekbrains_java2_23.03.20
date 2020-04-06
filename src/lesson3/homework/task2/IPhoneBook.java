package src.lesson3.homework.task2;

import java.util.Set;

public interface IPhoneBook {

    void add(String surname, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}
