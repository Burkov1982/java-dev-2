package CartCalculate;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void calculateCartCost(){
        String cart = " ABcAdBA13jghjg";
        Database database = new Database();
        Calculate calculate = new Calculate(database);
        final Product A = new Product("A", 1.25d, 3L, 3.00d);
        final Product B = new Product("B", 4.25d, 0L, 0);
        final Product C = new Product("C", 1.00d, 6L, 5.00d);
        final Product D = new Product("D", 0.75d, 0L, 0);

        database.add(A);
        database.add(B);
        database.add(C);
        database.add(D);

        double expected = calculate.calculateCartCost(cart);

        double actual = 13.25d;

        Assert.assertEquals(expected, actual, 0.0);
    }
}
