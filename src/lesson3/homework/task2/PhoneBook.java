package src.lesson3.homework.task2;

import java.util.*;

public class PhoneBook implements IPhoneBook {

    private final Map<String, Set<String>> phonesBySurname;

    public PhoneBook() {
        phonesBySurname = new TreeMap<>();
    }

    @Override
    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname) {
        return phonesBySurname.computeIfAbsent(surname, key -> new HashSet<>());
    }

    @Override
    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public Set<String> getAllSurnames() {
        return phonesBySurname.keySet();
    }
}
