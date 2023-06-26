import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
    public static void main(String args[]) {
        
        String[] names = {"puneet", "saurabh", "abc", "pawar"};
        
        //Conver array string into stream and print using lambda function
        Arrays.stream(names).forEach(s->System.out.print(s+" "));
        
        // Convert array into list of string
        List<String> nameList = Arrays.asList(names);
        
        //Print that list using stream and lambda function
        nameList.stream().forEach(System.out::println);

        // filter the names from list which start with P so using filter and startWith() method
        List<String> newList = nameList.stream().filter(name -> name.toUpperCase().startsWith("P")).collect(Collectors.toList());
        System.out.println(newList);

    }
}