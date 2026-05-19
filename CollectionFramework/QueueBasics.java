package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // offer() -> add element
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println("Queue: " + q);

        // peek() -> view front element
        System.out.println("Peek Element: " + q.peek());

        // poll() -> remove front element
        System.out.println("Removed Element: " + q.poll());

        System.out.println("Queue after poll(): " + q);

        // size()
        System.out.println("Size: " + q.size());

        // contains()
        System.out.println("Contains 30? " + q.contains(30));

        // isEmpty()
        System.out.println("Is Empty? " + q.isEmpty());

        // iterator()
        System.out.println("Using Iterator:");

        for (Integer num : q) {
            System.out.println(num);
        }

        // clear()
        q.clear();

        System.out.println("After clear(): " + q);
    }
}