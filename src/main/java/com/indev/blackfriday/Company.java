package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {
    Map<String,Product> stock;

    public Company() {
        stock=new HashMap<String, Product>();
    }

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int productPrice, String productName, int productQuantity) {
        stock.put(productName,new Product(productName,productPrice,productQuantity));

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
            totalResult+=product.totalPrice();
        }
        return totalResult;
    }

    public Company blackFriday() {
        return this;
    }
}
