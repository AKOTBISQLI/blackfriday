package com.indev.blackfriday;

public class Product {
    private static final int FIXED_QUANTITY = 5;
    private static final double MARGIN_NORMAL_DAYS = 1.2;
    private static final double MARGIN_BLACK_FRIDAY = 1.1;



    private int price;
    private int quantityInStock;
    private int quantitySelled;



    public Product(int quantity, int price) {
        this.price = price;
        this.quantityInStock = quantity;
        this.quantitySelled=0;
    }



    private int totalPriceInStock(){
        return this.price*this.quantityInStock;
    }
    private float totalPriceSelledNormalDay(){
        return quantitySelled*sellPriceForNormalDays();
    }
    private float totalPriceSelledBlackFriday(){
        return quantitySelled*sellPriceForBlackFriday();
    }
    private float sellOfFiveEntitiesInBlackFriday() {
        if (quantityInStock >= FIXED_QUANTITY*2) {
            quantityInStock -= FIXED_QUANTITY*2;
            quantitySelled += FIXED_QUANTITY*2;
            return  (sellPriceForBlackFriday() * FIXED_QUANTITY*2);
        }
        throw new RuntimeException();
    }
    private float sellOfFiveEntitiesInNormalDay() {
        if (quantityInStock >= FIXED_QUANTITY) {
            quantityInStock -= FIXED_QUANTITY;
            quantitySelled += FIXED_QUANTITY;
            return  (sellPriceForNormalDays() * FIXED_QUANTITY);
        }
        throw new RuntimeException();
    }


    private float sellPriceForBlackFriday(){
        return (float) (this.price*MARGIN_BLACK_FRIDAY);
    }
    private float sellPriceForNormalDays(){
        return (float) (this.price*MARGIN_NORMAL_DAYS);
    }
    private float totalBinifiNormalDay(){
        return totalPriceInStock()+totalPriceSelledNormalDay();
    }
    private float totalBenifitsBlackFriday(){
        return totalPriceInStock()+totalPriceSelledBlackFriday();
    }
    float totalBinifit(boolean isBlackFriday){
        if (isBlackFriday)
            return totalBenifitsBlackFriday();
        return totalBinifiNormalDay();
    }

    float sellOfFiveEntities(boolean isBlackFriday) {
        if (isBlackFriday) return sellOfFiveEntitiesInBlackFriday();
        return sellOfFiveEntitiesInNormalDay();

    }
}
