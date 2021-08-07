package CartCalculate;

import java.util.HashMap;
import java.util.LinkedList;

public class Calculate {
    private final Database database;

    public Calculate(Database database) {
        this.database = database;
    }

    public float calculateCartCost(String cart) {
        String cartToCalculate = cart.trim().toUpperCase();
        char[] productsInCart = cartToCalculate.toCharArray();
        float cartCost = 0f;

        LinkedList<Product> productsInDB = database.getProducts();

        HashMap<String, Integer> amountTypeOfProductsInCart = new HashMap<>();

        for (char c : productsInCart) {
            String temp = String.valueOf(c);
            for (Product product : productsInDB) {
                if (temp.equals(product.getName())) {
                    amountTypeOfProductsInCart.putIfAbsent(product.getName(), 0);
                }
            }
        }

        for (char product:productsInCart) {
            if (amountTypeOfProductsInCart.containsKey(String.valueOf(product))){
                int temp = amountTypeOfProductsInCart.get(String.valueOf(product));
                amountTypeOfProductsInCart.replace(String.valueOf(product), temp+1);
            }
        }

        for (Product product:productsInDB) {
            int specialOfferAmount = product.getSpecialOfferAmount();
            int amountOfProductInCart = amountTypeOfProductsInCart.get(product.getName());
            float specialOfferPrice = product.getSpecialOfferPrice();
            float costForOne = product.getCostForOne();

            if (amountOfProductInCart == specialOfferAmount){
                cartCost += specialOfferPrice;
            }else{
                cartCost += amountOfProductInCart * costForOne;
            }
        }

        return cartCost;
    }
}
