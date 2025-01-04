package general;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapOperationDemo {
    public static void main (String[] args) {
        mapToIntDemo();
    }

    public static void mapDemo() {
        List<String> list = new ArrayList<>();
        list.add("Kunal");
        list.add("Rahul");
        list.add("Munna");
        list.add("Ramnarayan");
        list.add("Surya");

        list.stream().map(name -> new Person(name,name.length())).forEach(person -> System.out.printf("name of person : %s age :%d\n",person.getName(),person.getAge()));
        Stream<Person> streamP = list.stream().map(name -> new Person(name,name.length()*5));
        System.out.printf("streamP is :%s\n",streamP.getClass().getName());

        System.out.println("......original list is below......");
        list.stream().forEach(p1 -> System.out.printf("name is : %s\n",p1));

        List<Person> listPerson = initializePersonArray();

        listPerson.stream().map(person -> person.getName()).forEach(name -> System.out.printf("name of person is: %s\n",name));

        System.out.println("......original list is below 2......");
        listPerson.stream().forEach(p1 -> System.out.printf("name is : %s and age is: %d\n",p1.getName(),p1.getAge()));
    }

    public static void mapToIntDemo() {
        List<Person> list =  initializePersonArray();

        list.stream().mapToInt(person -> person.getAge()).forEach(age -> System.out.printf("age is : %d\n",age));
    }

    static List<Person> initializePersonArray() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Kunal",51));
        list.add(new Person("Rahul",50));
        list.add(new Person("Ramnarayan",35));
        list.add(new Person("Surya",19));
        list.add(new Person("Munna",16));
        return list;
    }
}
