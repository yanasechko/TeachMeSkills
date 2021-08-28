package phonebook.dao;

import phonebook.entity.Person;
import phonebook.mapper.InputMapper;
import phonebook.storage.Storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PhonebookDAO {
    private final List<Storage> storages;

    public PhonebookDAO(List<Storage> storages) {
        this.storages = storages;
    }

    private Person[] getAll() {
        Person[] people = null;

        try (var scanner = new Scanner(new FileInputStream("./phonebook.txt")).useDelimiter("\\Z")) {
            var content = scanner.next();
            var lines = content.split("\n");

            people = new Person[lines.length];
            for (int i = 0; i < lines.length; i++) {
                var row = lines[i];
                var columns = row.split("/");
                var p = new Person(columns[0], columns);
                people[i] = p;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return people;
    }

    private void saveAll(Person[] people) {
        this.deleteFile();

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                this.save(people[i]);
            }
        }
    }

    private void deleteFile() {
        new File("./phonebook.txt").delete();
    }

    public Person findByLastname(String lastname) {
        try (var scanner = new Scanner(new FileInputStream("./phonebook.txt")).useDelimiter("\\Z")) {
            var content = scanner.next();
            var lines = content.split("\n");
            for (int i = 0; i < lines.length; i++) {
                var row = lines[i];
                var columns = row.split("/");
                var p = new Person(columns[0], columns);
                if (p.getLastname().equals(lastname)) {
                    return p;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Person find(Integer id) {
        try (var scanner = new Scanner(new FileInputStream("./phonebook.txt")).useDelimiter("\\Z")) {
            var content = scanner.next();
            var lines = content.split("\n");
            for (int i = 0; i < lines.length; i++) {
                var row = lines[i];
                var columns = row.split("/");
                var p = new Person(columns[0], columns);
                if (p.getId().equals(id)) {
                    return p;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void delete(int id) {
        Person[] people = this.getAll();
        for (int i = 0; i < people.length; i++) {
            if (people[i].getId().equals(id)) {
                people[i] = null;
            }
        }
        this.saveAll(people);
    }

    public void save(Person person) {
        for (int i = 0; i < this.storages.size(); i++) {
            this.storages.get(i).save(person);
        }
    }

    public void update(int id) {
        System.out.println("Введите новые id имя фамилию возраст: ");
        Scanner sc = new Scanner(System.in);

        String n;
        String m;
        int v;
        int w;
        w = sc.nextInt();
        n = sc.next();
        m = sc.next();
        v = sc.nextInt();

        Person[] people = this.getAll();

        for (int i = 0; i < people.length; i++) {
            if (people[i].getId().equals(id)) {
                people[i].setFirstname(n);
                people[i].setLastname(m);
                people[i].setAge(v);
                people[i].setId(w);
            }
            this.saveAll(people);
        }
    }
}








