2nd largest word from string

public class MyClass {
    public static void main(String args[]) {
        String str = "the name is different in each case";
        highestLengthWord(str);
    }
    
    public static void highestLengthWord(String str){
        
        String[] str2 = str.split("\\s+");
        int highestLength = str2[0].length();
        int secondHighestLength = str2[0].length();
        String word1 = "";
        String word2 = "";
        
        for(int i=1; i < str2.length; i++){
            int temp = str2[i].length();
            if(temp > highestLength){
                highestLength = temp;
                word1 = str2[i]; 
            }
        }
        for(int j = 1; j<str2.length; j++){
            
            int temp = str2[j].length();
            if(temp > secondHighestLength && temp < highestLength){
                secondHighestLength = temp;
                word2 = str2[j];
            }
        }
        System.out.println(word2);
    }
}