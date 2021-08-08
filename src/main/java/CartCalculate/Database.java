package CartCalculate;

import java.util.concurrent.ConcurrentHashMap;

public class Database {
    private final ConcurrentHashMap<String, Product> database = new ConcurrentHashMap<>();

    public synchronized void add(Product product){
        database.putIfAbsent(product.getName(), product);
    }

    public boolean isContainProduct(String key) {
        return database.containsKey(key);
    }

    public Product getProduct(String productName) {
        if (productName!=null){
            return database.get(productName);
        } else {
            throw new RuntimeException("Database getProduct error");
        }
    }
}
