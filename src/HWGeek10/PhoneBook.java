package HWGeek10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, Set<String>> entries = new TreeMap<>();

    public void add(String surmame, String phoneNumber) {
        Set<String> phones = getPhones(surmame);
        phones.add(phoneNumber);
    }
    private Set<String> getPhones(String surname) {
return entries.computeIfAbsent(surname, key -> new HashSet<>());

    }
    public Set<String> get(String surname) {
        return getPhones(surname);
    }
    public Set<String> getAllSurnames() {
        return entries.keySet();
    }
}
