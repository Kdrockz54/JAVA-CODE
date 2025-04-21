import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
    sc.close();
    
    System.out.println(str.length()+str1.length());
        
    if(str.compareTo(str1)<=0){System.out.println("No");}
            else{ System.out.println("Yes");}
            
            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1)+" "+str1.substring(0, 1).toUpperCase() + str1.substring(1));
        }}
    
