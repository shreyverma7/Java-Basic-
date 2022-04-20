
package JavaIntership;

import java.util.*;

public class CollectorSet11 {
    public static void main(String args[]){
        
        HashSet h = new HashSet();
        h.add("java");
        h.add("macha");
        h.add("23434");
        h.add(242);
        h.add('e');
        h.add(414.4234);
        System.out.println(h);
        h.add("java");//it will show only one value ..already if added so
        System.out.println(h);
        h.add(null);
        h.add("shrey");
        
        //System.out.println(h.iterator());
        Iterator it=h.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
           
        }
        System.out.println(h.size());//to the size does not add 2 same obj
        System.out.println(h.contains("java"));//if it contain print true else false
        System.out.println(h.getClass());//to see which class it belong to
        System.out.println(h.remove("java"));// to delete obj 
        System.out.println(h);
        System.out.println(h.toString());//to change the list into string
        System.out.println("------------------------------------------------------");
        
        LinkedHashSet g = new LinkedHashSet();
        g.add("hello");
        g.add("hello");//will not print same value two time
        g.add(123);
        g.add(424.445);
        g.add('c');         // same to Hashset the only difference is it store the value in given order
        System.out.println(g);
        System.out.println(g.size());
        System.out.println("-------------------------------------------------------");
        
        TreeSet d = new TreeSet();
        d.add("hello");
        d.add("aSs");
        d.add("23232");
        d.add("134234");
        d.add("sfsf");     // it arrange the obj in assending order ....contain same data type only
        System.out.println(d);
        System.out.println(d.last());//show the last obj
        System.out.println(d.descendingSet());//convert into descending
        
        System.out.println(d.first());//first element
        System.out.println(d.subSet("23232", "hello"));//print value into it ..include give value exclude last value
        System.out.println(d.tailSet("aSs"));//print all after give obj
        System.out.println(d.lower("aSs"));// value up of obj
        System.out.println(d.higher("aSs"));// value of down
        System.out.println("-----");
        System.out.println(d.pollFirst());// remove first value
        System.out.println(d);
        System.out.println(d.pollLast());// remove last value
        System.out.println(d);
        
        
        
       
    }
    
}
