package com.alice.designpattern.builderPattern.item.burger;

import com.alice.designpattern.builderPattern.item.Item;
import com.alice.designpattern.builderPattern.packing.Packing;
import com.alice.designpattern.builderPattern.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
