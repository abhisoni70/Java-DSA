import java.util.Scanner;

public class AddOne {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StringBuilder s=new StringBuilder();
    String st=sc.next();
    
     if(s.charAt(s.length()-1)<9){
        char c=s.charAt(s.length()-1);
        s.setCharAt(s.length()-1,Integer.parseInt(c)+1);
        
     }
    System.out.println(st);
  }  
}
