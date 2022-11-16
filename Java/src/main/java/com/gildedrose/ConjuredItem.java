package com.gildedrose;

public class ConjuredItem extends Item {

    public static final int DECREASE_QUALITY_MULTIPLICATOR = 2;

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    //could be an override method from Item
    public void endOfTheDayUpdate () {
        super.sellIn = super.sellIn - 1;

        if(sellIn < 0 )
            super.quality = super.quality - 1 * ConjuredItem.DECREASE_QUALITY_MULTIPLICATOR * 2;
        else
            super.quality = super.quality - 1 * ConjuredItem.DECREASE_QUALITY_MULTIPLICATOR;

        super.quality = super.quality > 0 ? super.quality : 0;
    }
}
