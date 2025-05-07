// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;


class Result {
    int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
         arr[i]= sc.nextInt();
        }
       minMaxSum(arr);
        
    }


public static void  minMaxSum(int[] arr){
    long total = 0;
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(int num : arr){
        total+=num;
    
    if(num<min)
        min=num;
    if(num>max)
        max= num;}
    
    long  maxSum = total-min;
    long  minSum = total-max;
    
    System.out.println(minSum+" "+ maxSum);
}}
