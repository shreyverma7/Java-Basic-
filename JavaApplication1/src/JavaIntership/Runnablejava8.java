
package JavaIntership;

import static java.lang.Thread.MAX_PRIORITY;
import static java.time.Instant.MAX;

public class Runnablejava8 implements Runnable {
    public void run()
    {
        for(int i = 0;i<=3;i++)
        {
            try
            {
                Thread.sleep(500);
                System.out.println(i);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main (String args[])
    {
        Runnablejava8 d = new Runnablejava8();
        Thread t= new Thread(d);
        
        t.start();
        System.out.println(t.isAlive());
        Thread t1= new Thread(d);//as this thread need to call again
        Thread t2 = new Thread(d);
        
        
        t2.setPriority(MAX_PRIORITY);
        System.out.println(t2.getPriority());
        System.out.println(t2.getName());
        t1.start();
           try{
           
       }catch(Exception f){
            System.out.println(f);
        }
        t2.start();
    }
    
}
