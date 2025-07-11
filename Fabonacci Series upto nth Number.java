import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        Fabonacci(n);
    }
        public static long Fabonacci(int n){
        long  prev=0;
        long  next=1;
        long  sum=0;
            System.out.println(prev+" "+"+ "+next+" "+"="+(prev+next));
        for(int i =2; i<n;i++){
            sum = prev+next;
            prev=next;
            next=sum;
            
            System.out.println(next+" "+"+ "+prev+" "+"="+(prev+next));
        }
            return 0;
    }
}
