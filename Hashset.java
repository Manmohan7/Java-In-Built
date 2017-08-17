import java.util.*;

class Hashset {
    
    public static void main(String[] args) {
        // HashSet()
        // backing hashmap instance has initial capacity of 16 and load factor 0.75
        HashSet hs1 = new HashSet();
        
        // HashSet(Collection)
        // hashset with the elements of the collection
        Collection col = new ArrayList();
        col.add('a');
        col.add('b');
        HashSet hs2 = new HashSet(col);
        System.out.println("Constructor - " + hs2);

        // HashSet(int capacity)
        // creates an empty hashset and backing hashmap with specified initial capacity
        // and default load factor of 0.75
        HashSet hs3 = new HashSet(5);

        // HashSet(int capacity, float loadFactor)
        // creates empty hashset and backing hashmap with specified intial capacity and 
        // specified load factor 
        HashSet hs4 = new HashSet(5, (float)0.75);

        // add(E) - returns boolean
        // adds the element e if it is not present in the set
        // if it is not added it returns false
        hs1.add(5);
        hs1.add(8);
        hs1.add(9);
        hs1.add(2);
        hs1.add(4);
        hs1.add(8);
        System.out.println("Add - " + hs1);

        // clear() - returns void
        // removes all the elements from the list
        hs1.clear();
        System.out.println("Clear - " + hs1);

        hs1.add(5);
        hs1.add(8);
        hs1.add(9);
        hs1.add(2);
        hs1.add(4);
        hs1.add(8);

        // clone() - returns Object
        // returns a shallow copy of the HashSet instance
        HashSet hs5 = (HashSet) hs1.clone();
        System.out.println("Clone - " + hs5);

        // contains(Object) - returns boolean
        // checks if the element is present or not
        System.out.println("Contains - " + hs1.contains(2));

        // isEmpty() - returns boolean
        // returns wheather the set is empty or not
        System.out.println("isEmpty - " + hs2.isEmpty());

        // iterator() - returns Iterator
        // returns an iterator over the elements of set in no particular order
        Iterator itr = hs1.iterator();
        System.out.println("Iterator - ");
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // remove(Object) - returns boolean
        // removes the element from the set if it exists and returns if it was removed
        System.out.println("Remove - " + hs1.remove(5));

        // size() - returns int
        // returns the no of elements in the set also known as cardinality
        System.out.println("Size - " + hs1.size());
    }
}
