import java.util.*;
public class Main {
    public static void main(String args[]) {
        OddEvenTask task = new OddEvenTask();
        Thread t1 = new Thread(()->{task.printEven();});
        Thread t2 = new Thread(()->{task.printOdd();});
        t1.start();
        t2.start();
    }
}
class OddEvenTask{
    static int n =100;
    int i = 1;
    public void printOdd(){
        synchronized(this){
            while(i<n){
                while(i%2==0){
                    try{
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    } 
                }
                System.out.println(i+ "  : Odd thread printing the number");
                i++;
                notify();
            }
        }
    }
    public void printEven(){
        synchronized(this){
            while(i<n){
                while(i%2==1){
                    try{
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    } 
                }
                System.out.println(i+ "  : Even thread printing the number");
                i++;
                notify();
            }
        }
    }
}