package ru.netology.users.repository.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.users.items.PurchaseItem;
import ru.netology.users.manager.ProductManager;
import ru.netology.users.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductManagerTest {

    ProductRepository repo = Mockito.mock(ProductRepository.class);
    ProductManager manager = new ProductManager(repo);

    PurchaseItem item1 = new PurchaseItem(11, 1, "milk", 70, 1);
    PurchaseItem item2 = new PurchaseItem(30, 2, "nuts", 50, 2);
    PurchaseItem item3 = new PurchaseItem(8, 75, "eggs", 60, 1);


    @Test
    public void shouldReverseAllItems() {
        PurchaseItem[] items = {item1, item2, item3};
        doReturn(items).when(repo).getItems();

        PurchaseItem[] expected = {item3, item2, item1};
        PurchaseItem[] actual  = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldSumItems(){
        PurchaseItem[] items = {item1, item2, item3};
        doReturn(items).when(repo).getItems();

        int expected = 230;
        int actual = manager.getTotal();

        assertEquals(expected, actual);
    }
}