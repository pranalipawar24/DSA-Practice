package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBasics {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // offerFirst()
        dq.offerFirst(10);

        // offerLast()
        dq.offerLast(20);
        dq.offerLast(30);

        System.out.println("Deque: " + dq);

        // peekFirst()
        System.out.println("First Element: " + dq.peekFirst());

        // peekLast()
        System.out.println("Last Element: " + dq.peekLast());

        // pollFirst()
        System.out.println("Removed First: " + dq.pollFirst());

        // pollLast()
        System.out.println("Removed Last: " + dq.pollLast());

        System.out.println("Deque after removal: " + dq);

        // add more elements
        dq.offer(100);
        dq.offer(200);

        // contains()
        System.out.println("Contains 100? " + dq.contains(100));

        // size()
        System.out.println("Size: " + dq.size());

        // iterator()
        System.out.println("Using Iterator:");

        for (Integer num : dq) {
            System.out.println(num);
        }

        // clear()
        dq.clear();

        System.out.println("After clear(): " + dq);

        // isEmpty()
        System.out.println("Is Empty? " + dq.isEmpty());
    }
}