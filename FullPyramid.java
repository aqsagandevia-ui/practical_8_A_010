import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Symbol: ");
        String symbol = scanner.next();
        System.out.print("Enter Number of Rows: ");
        int rows = scanner.nextInt();
        
        int i, j, k, s = 10;

        for (i = 1; i <= rows; i++) 
        {
            for (k = 1; k <= s; k++) 
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
            s--;
        }
    }
}