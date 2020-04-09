package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> map;

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        map.put(name, numbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String key = "";
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            key += entry.getKey();
            if (key.equals(phoneNumber)) {
                return key;
            }
        }
        return key;
    }

    public List<String> getAllContactNames() {
//        Iterator<List<String>> itr = map.values().iterator();
//        while (itr.hasNext()) {
//            itr.next();
//        }
        return null;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
