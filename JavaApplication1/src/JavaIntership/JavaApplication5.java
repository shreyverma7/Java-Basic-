
package JavaIntership;

import java.io.PrintStream;
import java.util.Locale;

public class JavaApplication5 {

   
    public static void main(String[] args) {
        String a= "shrey";
        String b= "yasar 07";
        String c = "friend"; // one more method to input string
        
       
        System.out.println(a.concat(b));// use to add string
        System.out.println(a.toUpperCase(Locale.ITALY));//to capital and italic
        System.out.println(b.replace('y', 's'));// to replace character
        System.out.println(c.length());// find length
        
        
        // the differnt buffer and builder is buffer not changes value and builder changes
        
        StringBuffer sb = new StringBuffer(b);
        System.out.println(sb.reverse());// reverse of string
        System.out.println(sb.deleteCharAt(3));//delete the given address
        System.out.println(a.charAt(3));//print give address
        
        System.out.println("-----------------------------14/10/21---------------------------"); 
    }
    
}
