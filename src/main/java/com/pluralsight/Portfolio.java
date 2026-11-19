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
    public BigDecimal get


}