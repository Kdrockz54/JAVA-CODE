
import java.util.*;
class Main {
    public static void main(String[] args) {
    int nums[] = {3,1,2,4};
    long result = Sum(nums);
    System.out.println("Sum of minimums of all subarrays: " + result);
    }

    
public static long Sum(int nums[]){
    int n = nums.length;
    int sum =0;
    for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        
        int currentMin=nums[i];
        for(int k=i;k<=j;k++){
            System.out.print("["+nums[k]+"]"+" ");
}
        for(int k=i+1;k<=j;k++){
            if(nums[k]<currentMin){
            currentMin=nums[k];
            }
        }
        System.out.println("minimum is "+currentMin+" \n");
        // System.out.println("from "+nums[k]+currentMin);
            sum+=currentMin;
    }
    }
    return sum;
}
}

