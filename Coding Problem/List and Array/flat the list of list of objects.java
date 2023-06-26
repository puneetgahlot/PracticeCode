import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        // Input
        List<Object> list = List.of(List.of(1), List.of(2,3,4, List.of(5,6,7)), List.of(8));
        
        // Expected output:- [1,2,3,4,5,6,7,8
        newList(list);
        System.out.print(list);
    }
    static List<Integer> secondList = new ArrayList<>();
    public static void newList(List<Object> list){
        
        for(int i=0; i <list.size(); i++){
            
            String st = ((Object)list.get(i)).getClass().getSimpleName();
            if(st.equals("Integer")){
                secondList.add((Integer)list.get(i));
            }else{
                newList((List<Object>)list.get(i));
            }
        }
    }
}