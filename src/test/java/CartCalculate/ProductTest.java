package CartCalculate;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void getName(){
        Product productForTest = new Product("Test", 1.25f, 3, 3.00f);

        String  expected = productForTest.getName();

        String actual = "Test";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void getName_NO_NULL(){
        Product productForTest = new Product("Test", 1.25f, 3, 3f);

        Assert.assertNotNull(productForTest.getName());
    }

    @Test
    public void getCostForOne(){
        Product productForTest = new Product("Test", 1.25f, 3, 3f);

        float expected = productForTest.getCostForOne();

        float actual = 1.25f;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getSpecialOfferAmount(){
        Product productForTest = new Product("Test", 1.25f, 3, 3f);

        int expected = productForTest.getSpecialOfferAmount();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSpecialOfferPrice(){
        Product productForTest = new Product("Test", 1.25f, 3, 3f);

        float expected = productForTest.getSpecialOfferPrice();

        float actual = 3f;

        Assert.assertEquals(expected, actual, 0);
    }
}
