import java.util.ArrayList;

public class Assignment7 {
    public String allStrings = "";
    public Long totalSum = 0L;
    public ArrayList<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        Assignment7 result = new Assignment7();
        result.universalMethod("Today", new Person("Ciprian", 20, "Male"),
                323442342343434L, "is", 23, 652, 'a', new Person("Eugen", 21, "Male"), "big", "day");

        System.out.println("Concatenated strings: " + result.allStrings);
        System.out.println("Sum of all digits: " + result.totalSum);
        System.out.println("People list:");
        result.people.forEach(System.out::println);
    }

    public void universalMethod(Object... objects) {
        for (Object o : objects) process(o);
    }

    private void process(Integer n) {
        totalSum += n;
    }

    private void process(Long n) {
        totalSum += n;
    }

    private void process(String s) {
        allStrings += " " + s;
    }

    private void process(Person person) {
        people.add(person);
    }

    private void process(Object o) {
        if (o instanceof Integer) process((Integer) o);
        if (o instanceof Long) process((Long) o);
        if (o instanceof String) process((String) o);
        if (o instanceof Person) process((Person) o);
    }
}

class Person {
    private String Name;
    private Integer Age;
    private String gender;

    public Person(String name, Integer age, String gender) {
        Name = name;
        Age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
