package com.alice.designpattern.builderPattern.item;

import com.alice.designpattern.builderPattern.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
