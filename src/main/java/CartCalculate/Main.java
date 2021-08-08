package CartCalculate;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Database database = new Database();
        Calculate calculate = new Calculate(database);
        Scanner scanner = new Scanner(System.in);

        Product A = new Product("A", 1.25f, 3, 3.00f);
        Product B = new Product("B", 4.25f, 0, 0);
        Product C = new Product("C", 1.00f, 6, 5.00f);
        Product D = new Product("D", 0.75f, 0, 0);

        database.add(A);
        database.add(B);
        database.add(C);
        database.add(D);

        System.out.println("Enable products: A (a), B (b), C (c), D (d)");
        System.out.println("Enter items from the cart:");
        try {
            System.out.println("Total cost of the cart is " + calculate.calculateCartCost(scanner.nextLine()));
        } catch (RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}