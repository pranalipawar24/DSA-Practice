package CollectionFramework;

import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {

        // Creating HashSet
        Set<Integer> st = new HashSet<>();

        // add()
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);

        System.out.println("Original Set: " + st);

        // addAll() -->Union
        Set<Integer> st2 = new HashSet<>();

        st2.add(50);
        st2.add(60);

        st.addAll(st2);

        System.out.println("After addAll(): " + st);

        // iterator()
        System.out.println("Using Iterator:");

        Iterator<Integer> iterator = st.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove()
        st.remove(20);

        System.out.println("After remove(): " + st);

        // removeAll() -->Difference
        st.removeAll(st2);

        System.out.println("After removeAll(): " + st);

        // size()
        System.out.println("Size: " + st.size());

        // contains()
        System.out.println("Contains 30? " + st.contains(30));

        // toArray()
        Object[] arr = st.toArray();

        System.out.println("Array Elements:");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // retainAll() -->Intersection
        Set<Integer> st3 = new HashSet<>();

        st3.add(10);
        st3.add(70);

        st.retainAll(st3);

        System.out.println("After retainAll(): " + st);

        // containsAll() -->Subset
        System.out.println("ContainsAll? " + st.containsAll(st3));

        // hashCode()
        System.out.println("HashCode: " + st.hashCode());

        //Linked HashSet
        Set<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(40);
        //Order of elements in linked hashset is preserved

        System.out.println(set);

        //Linked HashSet
        Set<Integer> Treeset = new TreeSet<>();
        Treeset.add(20);
        Treeset.add(30);
        Treeset.add(10);
        Treeset.add(40);
        //Order of elements in Tree hashset is in sorted manner

        System.out.println(Treeset);
    }
}
