public class MyClass {
    public static void main(String args[]) {
      
      String s1 = "puneet";
      String s2 = "gahlot";
      System.out.println(s1+" "+s2);
      
      //Logic to swap to string without useing extra string 
      s1 = s1+s2;
      s2 = s1.substring(0, s1.length()-s2.length());
      s1 = s1.substring(s2.length());
      
      System.out.println(s1+" "+s2);
    }
}