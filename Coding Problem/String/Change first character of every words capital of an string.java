public class ClassNameHere {
   public static void main(String[] args) {
      
      String s = "my name is puneet gahlot";
      
      System.out.println(modifyString(s));      
   }
   
   public static String modifyString(String s){
      String[] splited = s.split("\\s+");
      String s1="";
      
      for(String str : splited){
         s1 += str.substring(0, 1).toUpperCase() + str.substring(1);
         s1 += " ";
      }      
      return s1;
   }
}