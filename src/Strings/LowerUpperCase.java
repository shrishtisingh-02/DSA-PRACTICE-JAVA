package Strings;
import java.util.*;
public class LowerUpperCase {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String result="";
    for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(i%2==0){
               result=result+Character.toLowerCase(ch);
        } else{
            result=result+Character.toUpperCase(ch);
        }
    }
    System.out.println(result);
    }
}
