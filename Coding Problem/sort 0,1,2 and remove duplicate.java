import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
      int[] arr = {0, 2,2,1,1,0,0,2};
      System.out.println(Arrays.toString(sortArray(arr)));
      removeDuplicate(arr);
    }
    
    public static int[] sortArray(int[] arr){
        
        int length =  arr.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        
        for(int i: arr){
            if(i==0)
                countZero += 1;
            if(i==1)
                countOne += 1;
            else
               countTwo += 1; 
        }
        for(int j=0; j<length; j++){
            
            if(j <countZero)
                arr[j]  = 0;
            if(j>= countZero && j<countZero+countOne)
                arr[j]  = 1;
            if(j>= countZero+countOne && j<countZero+countOne+countTwo)
                arr[j]  = 2;
        }
        return arr;
    }
    
    public static void removeDuplicate(int[] arr){
        int initial = arr[0];
        int a[] = new int[3];
        a[0] = arr[0];
        int j =1;
        
        for(int i =1; i <arr.length; i++){
            if(initial != arr[i]){
                a[j++] = arr[i];
                initial = arr[i];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}