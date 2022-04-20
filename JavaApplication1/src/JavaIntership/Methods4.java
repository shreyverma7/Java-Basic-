/*
 Method are of twoo type
1.user defined
2.predefined
 */
package JavaIntership;
import java.io.*;

public class Methods4 {
    public void run(){
        System.out.println("this is user defined mehtod");   
    }
    public void stop(){
        System.out.println("u need to stop");
    }
    
    
    public static void main (String args[]){
        Methods4 m = new Methods4();
        m.run();
        m.stop();
        
        
        
    }
        
    
}
