import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subString {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String n  = S.substring(start, end);

        System.out.println(n);

    }
}
