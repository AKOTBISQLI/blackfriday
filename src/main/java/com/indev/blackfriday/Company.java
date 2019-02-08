package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String,Product> stock;
    private boolean isBlackFriday;

    public Company() {
        isBlackFriday=false;
        stock=new HashMap<String, Product>();
    }

    public float sells(String productName) throws RuntimeException {
        Product product=stock.get(productName);
        return product.sellOfFiveEntities(isBlackFriday);
    }

    public void stock(int productQuantity, String productName, int productPrice) {
        stock.put(productName,new Product(productQuantity,productPrice));

    }


    public int totalAssets() {
        int totalResult=0;
        for (Product product:stock.values()){
            totalResult+=product.totalBinifit(this.isBlackFriday);
        }
        return totalResult;
    }

    public Company blackFriday() {
        isBlackFriday=true;
        return this;
    }
}
