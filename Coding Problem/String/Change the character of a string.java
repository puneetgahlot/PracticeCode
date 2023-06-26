//Program to change the small character of a string into capital
//and capital char into small.
public class MyClass {
    public static void main(String args[]) {
      
      String str = "pUnEEt";
      String str1 = "";
      //Approach-1
      {
          for(int i =0; i <str.length(); i++){
          int ascii = str.charAt(i);
          if(ascii > 96){
              ascii -= 32;
          }else{
              if(ascii < 90){
              ascii += 32;
            }
          }
          str1 += (char)ascii;
        }
        System.out.println(str1);
      }
      convertString(str);
    }
    
    //Approach-2
    public static void convertString(String str){
        String str1="";
        
        for(int i=0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            
            if(str.charAt(i) == Character.toUpperCase(ch)){
                str1 += Character.toLowerCase(str.charAt(i));
            }else{
                str1 += Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(str1);
    } 
}