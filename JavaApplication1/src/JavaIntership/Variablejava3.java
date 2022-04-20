
package JavaIntership;
/* Variable has three type
   1.instance
   2.local
   3.Static
*/


public class Variablejava3 {
    int a = 21;//instance variable to class
    int b = 234;
    static long d = 767l;// static vaariable
    
    public static void main (String args[]){
        Variablejava3 obj = new Variablejava3();//fetching varible from class
        System.out.println(obj.a);
        System.out.println(obj.getClass());//get class
       
        System.out.println(obj.b);
        
        int c = 343;//local variable
        System.out.println(c);
        System.out.println(d);
        
        
        
        
    }
    
}
