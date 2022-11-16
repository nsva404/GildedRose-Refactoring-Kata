package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if(items[i] instanceof ConjuredItem)
                ((ConjuredItem) items[i]).endOfTheDayUpdate();
            else if (items[i] instanceof BetterOldItem)
                ((BetterOldItem) items[i]).endOfTheDayUpdate();
            else if (items[i] instanceof LegendaryItem)
                ((LegendaryItem) items[i]).endOfTheDayUpdate();
            else
                updateItem(items[i]);
        }
    }

    //could be in Item class
    public void updateItem(Item item) {
        item.quality = item.quality - 1;
        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
