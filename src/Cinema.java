import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) throws Exception {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i < 8; i++) {
            System.out.printf("%d S S S S S S S S\n", i);
        }

        int income = 0;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nEnter the number of rows:");
            int rows = scan.nextInt();

            System.out.println("\nEnter the number of seats in each row:");
            int seats = scan.nextInt();

            if (rows * seats <= 60) {
                income = rows * seats * 10;
            } else {
                int firstHalf = rows / 2;
                int secondHalf = rows - firstHalf;
                income = firstHalf * seats * 10 + secondHalf * seats * 8;
            }

            System.out.println("\nTotal income:");
            System.out.println("$" + income);
        }
    }
}
