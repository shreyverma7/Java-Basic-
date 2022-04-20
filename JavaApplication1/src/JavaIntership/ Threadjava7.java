
package JavaIntership;


class Threadjava extends Thread {
    public void run(){
            System.out.println("run length");
            System.out.println("2nd time");
    }
    
    public static void main(String args[]){
        Thread t=new Thread();
        t.run();//normal run
        t.start();//if we use start then it consider as thread
        System.out.println("-------------------------");
        
        Thread t1=new Thread();
        t1.start();//u need to create new class to call to hold one and then other .
    }
        
}