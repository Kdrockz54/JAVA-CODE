import java.util.Scanner;

public class CheckPrimeOrNot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting Number");
        int start = sc.nextInt();
        System.out.println("Enter Ending Number");
        int end = sc.nextInt();
         System.out.println("Prime Numners Between"+start+"and"+end);
        sc.close();
        
for (int i = start; i <=end; i++) {
   if (isPrime(i)) {
       System.out.println(i+" ");
}
    } 
// Check Only One Number:
//if (isPrime(start)) {
//System.out.println(start + " is Prime");
//}
//else{
//    System.out.println(start + " is not Prime");
//}
    }

public static boolean isPrime(int n){
    if (n<=1) 
        return false;
    if (n==2) 
        return true;
    if (n%2==0) 
        return false;
        
for (int i = 3; i <= Math.sqrt(n); i+=2) {
    if (n%i==0) 
        return false;
}
    return true;
}
}
