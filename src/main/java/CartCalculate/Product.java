package CartCalculate;

public class Product {
    private int counter = 0;
    private final String name;
    private final float costForOne;
    private final int specialOfferAmount;
    private final float specialOfferPrice;

    public Product(String name, float costForOne, int specialOfferAmount, float specialOfferPrice){
        if (name == null){
            this.name = String.valueOf(counter);
            counter++;
        }else {
            this.name = name;
        }

        this.costForOne = costForOne;
        this.specialOfferAmount = specialOfferAmount;
        this.specialOfferPrice = specialOfferPrice;
    }

    public String getName() {
        return name;
    }

    public float getCostForOne() {
        return costForOne;
    }

    public int getSpecialOfferAmount() {
        return specialOfferAmount;
    }

    public float getSpecialOfferPrice() {
        return specialOfferPrice;
    }
}
