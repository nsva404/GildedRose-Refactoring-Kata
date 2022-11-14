package com.gildedrose;

public class ConjuredItem extends Item {

    public static final int DECREASE_QUALITY_MULTIPLICATOR = 2;

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public int decreaseQuality () {
        super.quality = super.quality - 1 * ConjuredItem.DECREASE_QUALITY_MULTIPLICATOR;
        return super.quality > 0 ? super.quality : 0;
    }
}
