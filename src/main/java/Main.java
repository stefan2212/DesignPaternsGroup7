
//Ba
//Eimport decorator.BasicPizza;
import decorator.BasicPizza;
import decorator.Ham;
import decorator.Pizza;
import decorator.Salamy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public int a = 5;

    public static void main(String[] args) {

        // Use non static member in static function
        Main main = new Main();
        System.out.println(main.a);

        //Exception Handling
        int x = 2;
        int y = 0;
        try {
            int impartire = x / y;
        } catch (RuntimeException e) {
            System.out.println("Nu pot imparti la 0");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("fisier.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        //Basic lambda
        numbers.stream()
                .map(number -> number * 2)
                .filter(number -> number > 10)
                .collect(Collectors.toList())
                .forEach(number -> System.out.println(number));
        //Custom Hashmap
        CustomHashMap customHashMap = new CustomHashMap(16);
        customHashMap.put("a", "Ion");
        customHashMap.put("b", "Mihaita");
        customHashMap.put("q", "Laurentiu");
        System.out.println(customHashMap);


        //Sorting methods
        List<People> peopleList = new ArrayList<>();
        People people1 = new People(15, "Ion");
        People people2 = new People(50, "Bogdan");
        People people3 = new People(5, "ana");
        peopleList.addAll(Arrays.asList(people1, people2, people3));

        peopleList.forEach(System.out::println);
        // peopleList.sort(Comparator.comparing(People::getAge, Integer::compareTo));
//        Collections.sort(peopleList);
        peopleList.stream()
                .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
                .forEach(System.out::println);
        System.out.println();
        System.out.println("After sorting");
        System.out.println();
        peopleList.forEach(System.out::println);

    }
}
