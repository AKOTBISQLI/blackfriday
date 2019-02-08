package com.indev.blackfriday;

public class Product {
    public static final int FIXED_QUANTITY = 5;
    String name;
    int price;
    int quantityInStock;
    int quantitySelled;


    public Product(String name, int quantity, int price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantity;
    }



    public int totalPriceInStock(){
        return this.price*this.quantityInStock;
    }
    public float totalPriceSelled(){
        return quantitySelled*sellPrice();
    }
    public float sellOfFiveEntities(){
        quantityInStock-= FIXED_QUANTITY;
        quantitySelled+= FIXED_QUANTITY;
        return (float) (sellPrice()*FIXED_QUANTITY);
    }
    public float sellPrice(){
        return (float) (this.price*1.2);
    }

    public float totalBinifi(){
        return totalPriceInStock()+totalPriceSelled();
    }

}
