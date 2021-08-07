package CartCalculate;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class DatabaseTest {
    @Test
    public void addProduct_getProducts(){
        Database database = new Database();
        Product productForTest = new Product("Test", 1.25f, 3, 3f);
        database.add(productForTest);

        LinkedList<Product> expected = database.getProducts();

        LinkedList<Product> actual = new LinkedList<>();
        actual.add(productForTest);

        Assert.assertEquals(expected, actual);
    }
}
