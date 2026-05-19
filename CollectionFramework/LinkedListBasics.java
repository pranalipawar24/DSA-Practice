package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // addFirst()
        list.addFirst(5);

        // addLast()
        list.addLast(50);

        System.out.println("After addFirst & addLast: " + list);

        // get()
        System.out.println("Element at index 2: " + list.get(2));

        // getFirst()
        System.out.println("First Element: " + list.getFirst());

        // getLast()
        System.out.println("Last Element: " + list.getLast());

        // set()
        list.set(2, 25);

        System.out.println("After set(): " + list);

        // remove()
        list.remove(3);

        System.out.println("After remove(index): " + list);

        // removeFirst()
        list.removeFirst();

        // removeLast()
        list.removeLast();

        System.out.println("After removeFirst & removeLast: " + list);

        // contains()
        System.out.println("Contains 25? " + list.contains(25));

        // size()
        System.out.println("Size: " + list.size());

        // iterator()
        System.out.println("Using Iterator:");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // addAll()
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(100);
        list2.add(200);

        list.addAll(list2);

        System.out.println("After addAll(): " + list);

        // removeAll()
        list.removeAll(list2);

        System.out.println("After removeAll(): " + list);

        // toArray()
        Object[] arr = list.toArray();

        System.out.println("Array Elements:");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // clear()
        list.clear();

        System.out.println("After clear(): " + list);

        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());
    }
}