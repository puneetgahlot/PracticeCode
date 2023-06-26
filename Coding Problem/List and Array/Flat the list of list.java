//Flat the list of list using flatMap and then sort that
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
    public static void main(String args[]) {
        
        List<List<Integer>> nestedList = List.of(List.of(1,4,5), List.of(7,8,0), List.of(9,3,2));
        
        //flatten the list using simple for loop and logic
        List<Integer> flatList = new ArrayList<>();
        nestedList.forEach(flatList::addAll);
        flatList.forEach(s->System.out.print(s+" "));
        
        System.out.println();
        //Using Stream and using flatMap()
        List<Integer> flatList2 = nestedList.stream().flatMap(Collection::stream).sorted().collect(Collectors.toList());
        flatList2.forEach(s->System.out.print(s+" "));
    }
}