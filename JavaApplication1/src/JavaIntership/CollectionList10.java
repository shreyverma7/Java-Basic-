
package JavaIntership;/*
1.array list
2.linked list
3.stack
4.vector
*/
import java.io.PrintStream;
import java.util.*;

public class CollectionList10 {
    public static void main (String args[]){
        ArrayList a = new ArrayList();
        a.add("java");
        a.add("app");
        a.add("133");
        a.add(34.342f);
        a.add(1334);
        
        System.out.println(a);
        System.out.println(a.get(3));//if u give an index that does not available it throws error
        System.out.println(a.clone());//copy the given variable
        System.out.println(a.contains(1334));//if it contain the given value print true else false
        System.out.println(a.set(1, "shrey"));//change the value of given index
        System.out.println(a.get(1));
        System.out.println(a);
        System.out.println(a.size());// see the size of  given object
        System.out.println(a.isEmpty());//if is empty print true else false
        System.out.println(a.lastIndexOf(1334));//find place of obj
        System.out.println(a.toString());//typecasted to string
        System.out.println(a.iterator());
        
        Iterator it=a.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
       
        
        System.out.println("--------------------------------------------------");
        
        LinkedList <Integer> b = new LinkedList<Integer>();//must contain integers ..if not  throw error
        b.add(12);
        b.add(5640);
        b.add(466646);
        System.out.println(b);
        
        //almost same to  Arraylist but contain 2 more extra predefined method
        System.out.println("---------------------------------------------------");
        Stack s =new Stack();
        s.add("shrey");
        s.add(23);
        s.add('w');
        s.add(12.434f);
        s.add("macha");
        System.out.println(s);
        System.out.println(s.peek());//print last value
        System.out.println(s.push(23));// add
        System.out.println(s.search(23));//search and tell adress
        System.out.println(s.pop());//remove the last value
        System.out.println(s);
        System.out.println("-------------------------------------------------------");
        Vector v = new Vector();
       //same like all other
        
        
    }
    
}
