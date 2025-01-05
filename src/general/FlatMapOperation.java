package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapOperation {

    public static void main(String[] args) {
        flatmapdemo();
        flatmapcollectionDemo();
    }


    public static void flatmapdemo(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(23);
        list.add(26);
        list.add(19);
        list.add(13);

        list.stream().flatMap(num -> Stream.of(num + " plus")).filter(str -> str.contains("10") || str.contains("26")).forEach(str -> System.out.printf("string is : %s\n",str));
    }

    public static void flatmapcollectionDemo() {
        List<List<String>> list = new ArrayList<>();

        list.add(Arrays.asList("Kunal","Rahul","Bunty"));
        list.add(Arrays.asList("Kunal1","Rahul1","Bunty1"));
        list.add(Arrays.asList("Kunal2","Rahul2","Bunty2"));
        list.add(Arrays.asList("Kunal3","Rahul3","Bunty3"));
        list.add(Arrays.asList("Kunal4","Rahul4","Bunty4"));

        list.stream().flatMap(list1 -> list1.stream()).filter(name -> name.contains("2") || name.contains("3") || name.contains("4")).forEach(name -> System.out.printf("name is : %s\n", name));
    }


}
