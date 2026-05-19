package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(90);
        list.add(30);
        list.add(70);
        list.add(12);
        list.add(40);
        System.out.println(list);
        //sort an arraylist
        Collections.sort(list);
        System.out.println("After Sorting list: "+list);

        //remove
        list.remove(2);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);

        //adds all elements of list2 into list
        list.addAll(list2);
        System.out.println(list);

        //removes all elements of list2
        list.removeAll(list2);
        System.out.println(list);

        //size of list
        System.out.println(list.size());

        //Traversing a list using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        //get
        System.out.println(list3.get(1));

        //set
        System.out.println("Before set :"+list3);
        list3.set(2, 15);
        System.out.println("After set :"+list3);

        //toArray
        Object[] arr = list3.toArray();
        for(Object obj: arr){
            System.out.println((obj));
        }

        //contains
        System.out.println(list3.contains(12));

        //ensure Capacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        //isEmpty
        System.out.println(marks.isEmpty());

        //indexOf
        System.out.println(list.indexOf(70));
    }
}
