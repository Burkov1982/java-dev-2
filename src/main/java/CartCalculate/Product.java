package CartCalculate;

import java.util.Objects;

public class Product {
    private String name;
    private double costForOne;
    private long specialOfferAmount;
    private double specialOfferPrice;

    public Product() {
    }

    public Product(String name, double costForOne, long specialOfferAmount, double specialOfferPrice) {
        this.name = name;
        this.costForOne = costForOne;
        this.specialOfferAmount = specialOfferAmount;
        this.specialOfferPrice = specialOfferPrice;
    }

    public String getName() {
        return name;
    }

    public double getCostForOne() {
        return costForOne;
    }

    public long getSpecialOfferAmount() {
        return specialOfferAmount;
    }

    public double getSpecialOfferPrice() {
        return specialOfferPrice;
    }

    public double getPrice(long amount) {
        if (amount <= 0) {
            throw new RuntimeException("Error from product class");
        }
        if (amount < specialOfferAmount || specialOfferAmount == 0) {
            return amount * costForOne;
        } else {
            return (double) (amount / specialOfferAmount) * specialOfferPrice +
                    (amount % specialOfferAmount) * costForOne;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.costForOne, costForOne) == 0 && specialOfferAmount == product.specialOfferAmount && Double.compare(product.specialOfferPrice, specialOfferPrice) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, costForOne, specialOfferAmount, specialOfferPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name +
                ", costForOne=" + costForOne +
                ", specialOfferAmount=" + specialOfferAmount +
                ", specialOfferPrice=" + specialOfferPrice +
                '}';
    }
}
