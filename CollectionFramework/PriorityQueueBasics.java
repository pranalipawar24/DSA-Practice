package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueBasics {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //default behaviour --> Integers --> high priority(minHeap)
        //offer is used to add elements
        pq.offer(40);
        pq.offer(70);
        pq.offer(10);
        pq.offer(20);
        pq.offer(35);

        System.out.println(pq);
        // poll displays first elements and deletes it
        System.out.println(pq.poll());
        System.out.println(pq);

        //maxHeap Priority Queue
        PriorityQueue<Integer> pqMax = new PriorityQueue<>((a, b) -> b-a);
        //default behaviour --> Integers --> high priority(minHeap)
        //offer is used to add elements
        pqMax.offer(40);
        pqMax.offer(70);
        pqMax.offer(10);
        pqMax.offer(20);
        pqMax.offer(35);

        System.out.println("Max Heap Priority Queue ");
        System.out.println(pqMax);
        // poll displays first elements and deletes it
        System.out.println(pqMax.poll());
        System.out.println(pqMax);

    }
}
