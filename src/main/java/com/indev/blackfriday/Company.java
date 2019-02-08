package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String,Product> stock;

    public Company() {
        stock=new HashMap<String, Product>();
    }

    public float sells(String productName) {
        Product product=stock.get(productName);
        return product.sellOfFiveEntities();
    }

    public void stock(int productQuantity, String productName, int productPrice) {
        stock.put(productName,new Product(productName,productQuantity,productPrice));

    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalResult=0;
        for (Product product:stock.values()){
            totalResult+=product.totalBinifi();
        }
        return totalResult;
    }

    public Company blackFriday() {
        return this;
    }
}
