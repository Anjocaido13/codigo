package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Comanda.ItemComanda;
import Comanda.Produto;

public class ItemComandaTest {
    @Test
    void testCalcularPreco() {
        Produto smartphone = new Produto(10,"smartphone", 10.0f);
        int quantidade = 4;
        ItemComanda produto = new ItemComanda(smartphone, quantidade);

        float Esperado = 40.0f;
        float resul = produto.calcularPreco();

        assertEquals(Esperado, resul, 0.01);

    }

    @Test
    void testFormatarParaImpressao() {
        Produto MemoriaRam = new Produto(30, "MemoriaRam", 150.0f);
        int quantidade = 2;
        ItemComanda produto = new ItemComanda(MemoriaRam, quantidade);

        String test = " 30|MemoriaRam     |  2|R$ 300,00";
        String result = produto.formatarParaImpressao();

        assertEquals(test, result);
    }

    }

