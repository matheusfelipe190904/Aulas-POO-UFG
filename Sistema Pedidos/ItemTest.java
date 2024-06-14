package aula6_sistemaPedidos;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    @Test
    public void testCalcularSubtotalQuantidadePositiva() {
        Item item = new Item(1, 1, 1, 5, 100.0f);
        Assert.assertEquals(500.0, item.calcularSubtotal(), 0.01);
    }

    @Test
    public void testCalcularSubtotalQuantidadeZero() {
        Item item = new Item(1, 1, 1, 0, 100.0f);
        Assert.assertEquals(0.0, item.calcularSubtotal(), 0.01);
    }

    @Test
    public void testCalcularSubtotalQuantidadeNegativa() {
        Item item = new Item(1, 1, 1, -3, 100.0f);
        Assert.assertEquals(-300.0, item.calcularSubtotal(), 0.01);
    }
}