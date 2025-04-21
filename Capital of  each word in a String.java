import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
    sc.close();
    
    System.out.println(str.length()+str1.length());
        
        if (str.length()<str1.length()) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String result = firstCapital(str, str1);
        System.out.println(result);
    }

    public static String firstCapital(String str, String str1) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        return str + " " + str1;
    }}


