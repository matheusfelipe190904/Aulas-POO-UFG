package aula6_sistemaPedidos;

import org.junit.Assert;
import org.junit.Test;

public class ProdutosTest {

    @Test
    public void testAtualizarEstoque() {
        Produto p = new Produto(1, "Camisa", "Camisa de Algodão",
                100.00f, 10);
        Assert.assertEquals(2, p.atualizarEstoque(8));
    }

    @Test
    public void testAtualizarEstoqueQuantidadePositiva() {
        Produto produto = new Produto(1, "Camisa", "Camisa de Algodão", 100.00f, 10);
        Assert.assertEquals(2, produto.atualizarEstoque(8));
    }

    @Test
    public void testAtualizarEstoqueQuantidadeZero() {
        Produto produto = new Produto(1, "Camisa", "Camisa de Algodão", 100.00f, 10);
        Assert.assertEquals(10, produto.atualizarEstoque(0));
    }

    @Test
    public void testAtualizarEstoqueQuantidadeNegativa() {
        Produto produto = new Produto(1, "Camisa", "Camisa de Algodão", 100.00f, 10);
        Assert.assertEquals(18, produto.atualizarEstoque(-8));
    }
}
