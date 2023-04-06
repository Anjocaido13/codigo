package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Comanda.Produto;

public class ProdutoTest {
    @Test
    void testFormatarParaImpressao() {
        Produto Processador = new Produto(25, "Processador", 800.0f);

  

        String test = " 25|Processador    |R$ 800,00";
        String result = Processador.formatarParaImpressao();

        assertEquals(test, result);

    }
}
