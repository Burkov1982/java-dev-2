package CartCalculate;

public class Main {


    public static void main(String[] args) {
        Database database = new Database();
        Calculate calculate = new Calculate(database);

        Product A = new Product("A", 1.25f, 3, 3.00f);
        Product B = new Product("B", 4.25f, 0, 0);
        Product C = new Product("C", 1.00f, 6, 5.00f);
        Product D = new Product("D", 0.75f, 0, 0);

        database.add(A);
        database.add(B);
        database.add(C);
        database.add(D);

        System.out.println(calculate.calculateCartCost(" ABCDABA"));
    }
}