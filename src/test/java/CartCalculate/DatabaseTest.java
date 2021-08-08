package CartCalculate;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseTest {
    @Test
    public void addProduct_getProducts(){
        Database database = new Database();

        database.add(new Product("Test", 1.25d, 3L, 3d));

        Product expected = new Product();

        if (database.isContainProduct("Test")) {
            expected = database.getProduct("Test");
        }

        Product actual = new Product("Test", 1.25d, 3L, 3d);
        Assert.assertEquals(expected, actual);
    }
}
