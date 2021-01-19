package se.lexicon.ReineMoberg;

import se.lexicon.ReineMoberg.model.Car;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        //exercise9();
        //exercise10();
        //exercise11();
        exercise12();
    }

    public static void exercise1() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);                       //Print line in brackets
        Iterator<String> iterator = weekDays.iterator();    //Print on new line using Iterator
        while (iterator.hasNext()){
            String day = iterator.next();
            System.out.println(day);
        }
    }

    public static void exercise2() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        for (String list : weekDays) {          //Print on new line
            System.out.println(list);
        }
    }

    public static void exercise3() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        weekDays.add(weekDays.indexOf("Wednesday") + 1, "Thursday");    //Add thursday in right place
        System.out.println(weekDays);
    }

    public static void exercise4() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays.subList(0, 3));     //Print sub set of list
    }

    public static void exercise5() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);   //Weekdays are not traditionally sorted
    }

    public static void exercise6() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        ArrayList<String> weekDaysList = new ArrayList<>(weekDays); //Create ArrayList out of HashSet
        System.out.println(weekDays);                               //Print HashSet
        System.out.println(weekDaysList);                           //Print ArrayList
    }

    public static void exercise7() {
        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Ken");
        names.add("Wilma");
        names.add("Anna");
        names.add("Fredrik");
        names.add("Patrik");
        names.add("Amanda");
        System.out.println(names);                                  //Print HashSet
        ArrayList<String> weekDaysList = new ArrayList<>(names);    //Create ArrayList out of HashSet
        System.out.println(weekDaysList);                           //Print ArrayList
        weekDaysList.sort(null);                                 //Sort ArrayList, natural ordering comparator
        System.out.println(weekDaysList);                           //Print sorted list
    }

    public static void exercise8(){
        //According to the Internet, you can't. It is an unordered collection that does not
        //have random access methods, ie .get() an element at a given index. That does not
        //exist in Set or child of Set class.
    }

    public static void exercise9() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Saab");
        cars.put(2, "Volvo");
        cars.put(4, "Ford");
        cars.put(3, "Nissan");
        System.out.println(cars);                   //Print line in squiggly brackets
        for (Map.Entry m : cars.entrySet()) {       //Print on new line with tab
            System.out.println(m.getKey() + "\t" + m.getValue());
        }
    }

    public static void exercise10() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Saab");                    //Input out of key order
        cars.put(2, "Volvo");
        cars.put(4, "Ford");
        cars.put(3, "Nissan");
        System.out.println(cars.keySet());      //Print line in brackets, sorted by key
        for (Map.Entry m : cars.entrySet()) {   //Print key on new line, sorted by key
            System.out.println(m.getKey());
        }
    }

    public static void exercise11() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Saab");                    //Input out of key order
        cars.put(2, "Volvo");
        cars.put(4, "Ford");
        cars.put(3, "Nissan");
        System.out.println(cars.values());      //Print line in brackets, sorted by key
        for (Map.Entry m : cars.entrySet()) {   //Print value on new line, sorted by key
            System.out.println(m.getValue());
        }
    }

    public static void exercise12() {
        HashMap<Integer, Car> cars = new HashMap<>();
        Car car1 = new Car(1, "Volvo", "C30");      //Add a car, approach 1
        cars.put(1, car1);
        Car car2 = new Car();                                       //Add a car, approach 2
        car2.setId(2);
        car2.setBrand("Ford");
        car2.setModel("Mondeo");
        cars.put(2, car2);
        cars.put(3, new Car(3, "Nissan", "Micra")); //Add a car, approach 3
        for (Map.Entry m : cars.entrySet()) {                       //Print cars by brand
            Car tempCar = (Car) m.getValue();                       //Typecast object to Car
            System.out.println(tempCar.getBrand());
        }
    }
}

