package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.util.List;

public class Portfolio {
    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    private String name;
    private String owner;
    private List<Valuable> assets;
}

public obstract add(Valuable asset){

}