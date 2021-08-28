package phonebook.storage;

import phonebook.entity.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileStorage implements Storage {
    @Override
    public void save(Person person) {
        try (var fin = new FileOutputStream("./phonebook.txt", true)) {
            fin.write(person.getId().toString().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(person.getFirstname().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(person.getLastname().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(person.getAge().toString().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));

            fin.write("\n".getBytes(StandardCharsets.UTF_8));
            fin.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
