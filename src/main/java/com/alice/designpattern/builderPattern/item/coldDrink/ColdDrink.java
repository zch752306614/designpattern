package com.alice.designpattern.builderPattern.item.coldDrink;

import com.alice.designpattern.builderPattern.item.Item;
import com.alice.designpattern.builderPattern.packing.Bottle;
import com.alice.designpattern.builderPattern.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
