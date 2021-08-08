package CartCalculate;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculate {
    private final Database database;

    public Calculate(Database database) {
        this.database = database;
    }

    public double calculateCartCost(String cart) {
        String clearedCart = clearCart(cart);

        if (clearedCart!=null && !clearedCart.isEmpty()) {
            Map<String, Long> amountOfProducts = Arrays.stream(clearedCart.split(""))
                    .map(database::getProduct)
                    .collect(Collectors.groupingBy(Product::getName,
                            Collectors.mapping(Product::getName, Collectors.counting())));
            return amountOfProducts.entrySet().stream()
                    .mapToDouble(p -> database.getProduct(p.getKey()).getPrice(p.getValue()))
                    .sum();
        } else {
            throw new RuntimeException("Enter the correct cart");
        }
    }

    private String clearCart(String cart) {
        if (cart!=null) {
            return Arrays.stream(cart.toUpperCase()
                            .split(""))
                    .filter(database::isContainProduct)
                    .collect(Collectors.joining());

        } else {
            throw new RuntimeException("Enter the correct data");
        }
    }
}
