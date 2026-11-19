package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Portfolio {
    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }
    private String name;
    private String owner;
    private List<Valuable> assets;

    public void add(Valuable asset){
        assets.add(asset);
    }
    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Valuable asset : assets) {
            total = total.add(asset.getValue());
        }
        return total;
    }
    public Valuable getMostValuable() {
        Valuable mostValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(mostValuable.getValue()) > 0) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }
    public Valuable getLeastValuable() {
        Valuable leastValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(leastValuable.getValue()) < 0) {
                leastValuable = asset;
            }
        }
        return leastValuable;
    }


}