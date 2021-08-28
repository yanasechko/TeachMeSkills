package phonebook.entity;

public class Person {


    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String phoneNumber;

    public Person(Integer id) {
        this.id = id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Person(String id, String[] columns) {
        this.id = Integer.parseInt(id);
        this.firstname = columns[1];
        this.lastname = columns[2];
        this.age = Integer.parseInt(columns[3]);
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname.length() > 30) {
            throw new IllegalArgumentException();
        }
        this.firstname = firstname;
    }




    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
