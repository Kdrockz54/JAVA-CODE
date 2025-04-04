import java.io.*;
import java.util.*;
import java.util.Scanner.*;


interface AdvancedArithmetic { 
       int divisor_sum(int n);
        }
    class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n){
          int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
              sum += i;
            }
        }
        return sum;
        
    }}
        
public class Solution {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
       MyCalculator mc =new MyCalculator();
       
      System.out.println("I implemented: AdvancedArithmetic");
      System.out.println(mc.divisor_sum(a));
    }
    
    
}
