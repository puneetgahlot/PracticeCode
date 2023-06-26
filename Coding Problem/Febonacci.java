import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      febonacci(number);
    }
    
    public static void febonacci(int number){
        int n1 = 0, n2 = 1, n3 = 0;
        if(number >1){
            System.out.print(n1+ " "+n2+ " ");
        
            for(int i =2; i<number; i++){
                n3 = n1+n2;
                System.out.print(" "+n3+ " ");
                n1 = n2;
                n2 = n3;
            }
        }
        else{
            if(number ==1)
                System.out.print(n2);
            if(number == 0)
                System.out.print("No output");
        }
    }
}