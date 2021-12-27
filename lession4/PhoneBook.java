package lession4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String lastName, String Number) {
        ArrayList<String> phonesLastName = phonebook.getOrDefault(lastName, new ArrayList<>());
        phonesLastName.add(Number);
        phonebook.put(lastName,phonesLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phonebook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Varian", "89068553535");
        phoneBook.add("Cherchel", "89095182913");
        phoneBook.add("Zhakupova","+77471420190");
        phoneBook.add("Varian", "89052151245511");


        System.out.println(phoneBook.get("Varian"));

    }
}
