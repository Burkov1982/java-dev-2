package CartCalculate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class Database {
    private final ConcurrentHashMap<String, Product> database = new ConcurrentHashMap<>();

    public void add(Product product){
        database.putIfAbsent(product.getName(), product);
    }

    public LinkedList<Product> getProducts(){
        Product[] dbProducts = database.values().toArray(new Product[0]);
        return new LinkedList<>(Arrays.asList(dbProducts));
    }
}
