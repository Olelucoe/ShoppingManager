package ru.netology.users.repository;

import ru.netology.users.items.PurchaseItem;

public class ProductRepository {

    private PurchaseItem[] items = new PurchaseItem[0];

    public void save (PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }
    public void removeById (int id) {
        PurchaseItem[] tmp = new PurchaseItem[items.length - 1];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public PurchaseItem[] getItems() {
        return items;
    }
}
