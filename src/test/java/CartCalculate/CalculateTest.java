package CartCalculate;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void calculateCartCost(){
        String cart = " ABCDABA";
        Database database = new Database();
        Calculate calculate = new Calculate(database);
        final Product A = new Product("A", 1.25f, 3, 3.00f);
        final Product B = new Product("B", 4.25f, 0, 0);
        final Product C = new Product("C", 1.00f, 6, 5.00f);
        final Product D = new Product("D", 0.75f, 0, 0);

        database.add(A);
        database.add(B);
        database.add(C);
        database.add(D);

        float expected = calculate.calculateCartCost(cart);

        float actual = 13.25f;

        Assert.assertEquals(expected, actual, 0.0);
    }
}
