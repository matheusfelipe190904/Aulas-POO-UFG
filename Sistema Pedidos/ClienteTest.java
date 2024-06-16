package aula6_sistemaPedidos;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testGetIdCliente() {
        Cliente cliente = new Cliente(1, "João Silva", "joao.silva@email.com", "Rua A", "123", "JoaoSilva", 1234);
        Assert.assertEquals(1, cliente.getIdCliente());
    }

    @Test
    public void testSetIdCliente() {
        Cliente cliente = new Cliente(1, "João Silva", "joao.silva@email.com", "Rua A", "123", "JoaoSilva", 1234);
        cliente.setIdCliente(2);
        Assert.assertEquals(2, cliente.getIdCliente());
    }
}
