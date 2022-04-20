

package JavaIntership;
/* Excetion handling 
1.try
2.throw
3.throws
4.catch
5.finally
*/


public class Excep6 {
    public static void main (String args[]){
        try{
            //int a = 10/0;
            //System.out.println(a);//Arithmethic error
            
           // int b[] ={1,3,34,4};
           // System.out.println(b[7]);//ArrayIndexOutOFBounds
           
          String s =null;
          System.out.println(s.length());//NullPointerException
          
           
        }catch(Exception e){
            System.out.println(e);
               
        }finally{
            System.out.println("This is must case");// finally will print confirn if error or not
        }
    }
    
}
