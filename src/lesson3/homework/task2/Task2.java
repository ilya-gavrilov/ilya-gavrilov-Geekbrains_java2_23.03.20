package src.lesson3.homework.task2;

//https://javarush.ru/groups/posts/524-khvatit-pisatjh-ciklih-top-10-luchshikh-metodov-dlja-rabotih-s-kollekcijami-iz-java8

import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        IPhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pupkin", "111-22-33");
        phoneBook.add("Ruchkin", "444-55-66");
        phoneBook.add("Popov", "777-88-99");
        phoneBook.add("Pupkin", "333-11-77");

        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }
    }


}
