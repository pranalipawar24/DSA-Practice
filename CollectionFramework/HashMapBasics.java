package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        // Creating Map
        Map<Integer, String> map = new HashMap<>();

        // put(K,V)
        map.put(1, "Harshal");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        System.out.println("Map: " + map);

        // putAll()
        Map<Integer, String> map2 = new HashMap<>();

        map2.put(4, "Rohit");
        map2.put(5, "Virat");

        map.putAll(map2);

        System.out.println("After putAll(): " + map);

        // putIfAbsent()
        map.putIfAbsent(2, "Kunal");
        map.putIfAbsent(6, "Suresh");

        System.out.println("After putIfAbsent(): " + map);

        // get(K)
        System.out.println("Value of key 3: " + map.get(3));

        // getOrDefault()
        System.out.println(
                "Get Or Default: " +
                        map.getOrDefault(10, "Not Found")
        );

        // containsKey()
        System.out.println(
                "Contains Key 2? " +
                        map.containsKey(2)
        );

        // containsValue()
        System.out.println(
                "Contains Value Amit? " +
                        map.containsValue("Amit")
        );

        // remove()
        map.remove(5);

        System.out.println("After remove(): " + map);

        // size()
        System.out.println("Size: " + map.size());

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() +
                            " -> " +
                            entry.getValue()
            );
        }

        // clear()
        map.clear();

        System.out.println("After clear(): " + map);

        // isEmpty()
        System.out.println("Is Empty? " + map.isEmpty());
    }
}