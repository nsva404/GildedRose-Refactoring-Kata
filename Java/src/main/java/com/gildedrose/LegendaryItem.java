package com.gildedrose;

public class LegendaryItem extends Item {

    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    //could be an override method from Item
    public void endOfTheDayUpdate () {
        //nothing to do
    }
}
