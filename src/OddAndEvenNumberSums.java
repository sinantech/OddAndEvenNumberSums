import java.util.Scanner;

public class OddAndEvenNumberSums {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Enter Number : ");
            n = inp.nextInt();
            if (n % 2 == 0 && n % 8 == 0) {
                total += n;
            }
        } while (n % 2 == 1);

        System.out.println("Total : " + total);
        
    }
}
