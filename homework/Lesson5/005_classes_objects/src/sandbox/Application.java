package sandbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        var p = new Person();
        //p.name = "Vasia Pupkin";
        p.setName("Vasia Pupkin via setName()");
        //p.age = 30;
        p.setAge(30);
        p.displayInfo();
        //p.setAge(-1);

        var p2 = new Person("Ivan Ivanov");
        p2.setAge(100);
        p2.displayInfo();

        p2.save();
        var scanner = new Scanner(System.in);
        p2.setName(scanner.nextLine());
        p2.save();

        var builder = new ImmutablePerson.Builder();

        // vasia
        builder.age(10);
        builder.name("Vasia");
        var vasia = builder.build();
        vasia.displayInfo();

        // peter
        builder.name("Peter");
        var peter = builder.build();
        peter.displayInfo();

        List<ImmutablePerson> people = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            var ip = builder.build();
            builder.name(String.format("sandbox.Person #%d", i));
            people.add(ip);
            ip.save();
        }
        people.forEach(ip -> {
            ip.save();
        });

        var e = new Employee();
        e.setName("sandbox.Employee #1");
        e.setOrganization("Teach Me Skill");
        e.setAge(18);
        e.displayInfo();
    }

    private static boolean validateAge(Person p) {
        return p.getAge() < 0;
    }
}

class ImmutablePerson {
    private Person info;

    private ImmutablePerson(Person info) {
        this.info = new Person();
        this.info.setName(info.getName());
        this.info.setAge(info.getAge());
    }

    public String getName() {
        return this.info.getName();
    }

    public int getAge() {
        return this.info.getAge();
    }

    public static Builder builder() {
        return new Builder();
    }

    public void displayInfo() {
        info.displayInfo();
    }

    public void save() {
        info.save();
    }

    static class Builder {
        private Person info;

        public Builder() {
            this.info = new Person();
        }

        public void age(int age) {
            this.info.setAge(age);
        }

        public void name(String name) {
            this.info.setName(name);
        }

        public ImmutablePerson build() {
            return new ImmutablePerson(this.info);
        }
    }
}

class Employee extends Person {
    private String organization;

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    void displayInfo() {
        System.out.printf("Name: %s\tAge:%d\tOrganization:%s\n", this.getName(), this.getAge(), this.getOrganization());
    }
}

class Person {
    private String name;
    private int age;
    private String path;

    public Person() {
        System.out.println("called empty sandbox.Person()");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
//        if (age < 0) {
//            throw new IllegalArgumentException("age should be greater or equal to zero");
//        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void destroy() {
        System.err.println("Some error");
    }

    public int getAge() {
        return age;
    }

    void displayInfo() {
        System.out.printf("Name: %s\tAge:%d\n", this.name, this.age);
    }

    public void save() {
        var f = new File(this.path);
        try (var fin = new FileOutputStream(f)) {
            fin.write(this.name.getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(String.valueOf(this.age).getBytes(StandardCharsets.UTF_8));
            fin.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
