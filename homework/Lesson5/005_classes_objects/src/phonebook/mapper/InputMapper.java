package phonebook.mapper;

import phonebook.entity.Person;

import java.util.Random;

public class InputMapper {
    public Person toEntity(String[] args) {
        var person = new Person(new Random().nextInt(100_000));
        person.setFirstname(args[1]);
        person.setLastname(args[2]);
        person.setAge(Integer.parseInt(args[3]));

        return person;
    }
}
