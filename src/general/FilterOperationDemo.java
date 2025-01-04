package general;

import model.Person;

import java.util.List;

public class FilterOperationDemo {

    public static void main(String[] args) {
        List<Person> list = MapOperationDemo.initializePersonArray();

        list.stream().filter((person -> person.getAge()>20 && person.getAge()<60)).forEach(person -> System.out.printf("the perosn is:%s of age:%d\n",person.getName(),person.getAge()));
        System.out.println("......original list is below......");
        list.stream().forEach(p1 -> System.out.printf("name is : %s and age is: %d\n",p1.getName(),p1.getAge()));

    }
}
