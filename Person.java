import java.util.ArrayList;
import java.util.List;
public class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getInfo() {
        return name + " " + age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}

class Student extends Person {
    private String MSV;

    public Student(String name, String age, String MSV) {
        super(name, age);
        this.MSV = MSV;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getInfo() {
        return super.getInfo() + " " + MSV;
    }
}

    class Manage {
    private List<Person> persons;

    public Manage() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void displayPersons() {
        for (Person person : persons) {
            System.out.println(person.getInfo());
        }
    }
    public static void main(String[] args) {
        Manage sv = new Manage();
            Student student1 = new Student("A", "01/02/2005", "001");
            Student student2 = new Student("B", "09/02/2005", "002");
            sv.addPerson(student1);
            sv.addPerson(student2);
            sv.displayPersons();
    }
}
