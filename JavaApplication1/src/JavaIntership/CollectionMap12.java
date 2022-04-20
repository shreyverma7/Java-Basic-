
package JavaIntership;
import java.util.*;
public class CollectionMap12 {
    public static void main (String args[]){
        HashMap m = new HashMap();
        m.put(1, "shrey");
        m.put(2, "hello");
        m.put(3, 64646);
        m.put(4, 's');
        m.put(5, 64643.46f);
        m.put(5, "java");//the last give value is valid
        m.put(6, "hello");// u can add 2 value but in different palace
        System.out.println(m);
        System.out.println(m.containsValue("shrey"));//to see it contian value
        System.out.println(m.containsKey(34));// to see it contain that key or not
        System.out.println(m.get(4));// to get the value from key .null if not given value is shown
        System.out.println(m.getClass()); // to fetch the class
        System.out.println(m.keySet());// to get key set
        System.out.println(m.putIfAbsent(7, "sese"));//it  add when the value is not in set
        System.out.println(m.remove(2, "hello"));// remove the index and value
        System.out.println(m.values());// to see values
        System.out.println(m);
        System.out.println("----------------------------------------------------------------------");
        
        LinkedHashMap z = new LinkedHashMap();
        z.put(1, "rey");
        z.put(2, "l0lo");
        z.put(3, 46);
        z.put(4, '@');
        z.put(5, 26643.46f);
        z.put(5, "va");
        z.put(6, "melo");
        System.out.println(z);
        
        // LinkedList Map is same like Hashmap but the only differace it arrange in given order
        System.out.println("---------------------------------------------------------------------------");
        TreeMap c = new TreeMap();
        c.put(1, "shreya");
        c.put(2, "hello world");
        c.put(3, 646);
        c.put(4, 's');
        c.put(5, 6444643.46f);
        c.put(5, "jva");
        c.put(6, "llo");
        System.out.println(c);
        System.out.println(c.containsKey(4));//if the key is present print true
        System.out.println(c.containsValue("hello world"));//if value present ptint true
        System.out.println(c.descendingKeySet());//desending of key set
        System.out.println(c.descendingMap());//desending order
        System.out.println(c.headMap(3));//starting to given key
        System.out.println(c.higherEntry(3));//higer value than given key
        System.out.println(c.lowerEntry(3));//lower key value than key
        System.out.println("---------"+c);
        System.out.println(c.pollFirstEntry());//delete first key
        System.out.println(c.pollLastEntry());//delete last key
        System.out.println(c.subMap(2, 5));//in between value but starting value is included
        System.out.println(c.tailMap(2));//next value for given key
        System.out.println(c.size());// size ''' i have deleted stating and end valuse so 4
        
                
    }   
}
