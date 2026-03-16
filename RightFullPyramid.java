import java.util.Scanner;

public class RightFullPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Symbol: ");
        String symbol = scanner.next();
        System.out.print("Enter Number of Rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}