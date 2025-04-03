import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the number of rows for the pyramid: ");      // Ask the user for the number of rows
        int rows = sc.nextInt();

        // Pyramid pattern logic
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for pyramid structure
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        sc.close();
    }
}
