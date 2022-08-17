package ru.netology.users.repository.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.users.items.PurchaseItem;
import ru.netology.users.repository.ProductRepository;

public class ProductRepositoryTest {

    PurchaseItem item1 = new PurchaseItem(11, 1, "milk", 70, 1);
    PurchaseItem item2 = new PurchaseItem(30, 2, "nuts", 50, 2);
    PurchaseItem item3 = new PurchaseItem(8, 75, "eggs", 60, 1);

    @Test
    public void shouldSaveItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        PurchaseItem[] expected = {item1, item2, item3};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item1.getId());

        PurchaseItem[] expected = {item2, item3};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}
