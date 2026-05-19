package CollectionFramework;

import java.util.*;

public class StackDemo {
    static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        //push
        stack.push(30);
        stack.push(10);
        stack.push(70);
        stack.push(20);
        System.out.println(stack);

        //pop
        stack.pop();
        System.out.println("After POP: "+stack);

        //peek
        System.out.println("Top Element: " +stack.peek());

        //search
        System.out.println("Index of element 70 is: "+stack.search(70));
        //returns -1 if element is not present
        System.out.println("Index of element which is not present: "+stack.search(110));

        //empty
        System.out.println("Is Empty?? " +stack.empty());
    }
}
