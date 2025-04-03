public class BitwiseExample {
    public static void main(String[] args) {
        int num = 7;
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
