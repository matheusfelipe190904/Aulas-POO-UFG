package aula6_sistemaPedidos;

import org.junit.Assert;
import org.junit.Test;

public class PedidoTest {

    @Test
    public void testCalcularTotalItensVazio() {
        Pedido pedido = new Pedido(1, "Em processamento", 1001);
        Item[] itens = {};
        Assert.assertEquals(0.0, pedido.calcularTotal(itens), 0.01);
    }

    @Test
    public void testCalcularTotalUmItem() {
        Pedido pedido = new Pedido(1, "Em processamento", 1001);
        Item item = new Item(1, 1, 1, 5, 100.0f);
        Item[] itens = {item};
        Assert.assertEquals(500.0, pedido.calcularTotal(itens), 0.01);
    }

    @Test
    public void testCalcularTotalMultiplosItens() {
        Pedido pedido = new Pedido(1, "Em processamento", 1001);
        Item item1 = new Item(1, 1, 1, 5, 100.0f);
        Item item2 = new Item(2, 1, 2, 3, 200.0f);
        Item[] itens = {item1, item2};
        Assert.assertEquals(1100.0, pedido.calcularTotal(itens), 0.01);
    }
}