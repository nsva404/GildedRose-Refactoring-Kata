package com.gildedrose;

public class BetterOldItem extends Item {

    public BetterOldItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    //could be an override method from Item
    public void endOfTheDayUpdate () {

        if (super.quality < 50) {
            super.quality =super.quality + 1;

            if (super.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (super.sellIn < 11) {
                    if (super.quality < 50) {
                        super.quality = super.quality + 1;
                    }
                }

                if (super.sellIn < 6) {
                    if (super.quality < 50) {
                        super.quality = super.quality + 1;
                    }
                }
            }
        }

        super.sellIn = super.sellIn - 1;

        if (super.sellIn < 0) {
           if (super.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                super.quality = 0;
            } else if (super.quality < 50) {
               super.quality = super.quality + 1;
            }
        }
    }
}
