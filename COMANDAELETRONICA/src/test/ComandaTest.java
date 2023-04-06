package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Comanda.Comanda;
import Comanda.ItemComanda;
import Comanda.Produto;

public class ComandaTest {
    Comanda comanda = new Comanda();

    Produto celular = new Produto(1, "Celular", (float) 1500.0);
    Produto teclado = new Produto(2, "Teclado", (float) 100.0);
    Produto mouse = new Produto(3, "Mouse", (float) 20.0);
    
    @Test
    void testCalcularValorTotal() {
        ItemComanda tcl1 = new ItemComanda(teclado, 2);
        ItemComanda cel = new ItemComanda(celular, 1);

        comanda.registrarItem(tcl1);
        comanda.registrarItem(cel);

        float valorTotalEsperado = 200.0f + 1500.0f; 
        float valorTotalAtual = comanda.calcularValorTotal();
        assertEquals(valorTotalEsperado, valorTotalAtual, 0.01f);




    }

    @Test
    void testFormatarParaImpressao() {
        Produto Monitor = new Produto(55, "Monitor", 1000.0f);

        
        String test = " 55|Monitor        |R$ 1000,00";
        String atual = Monitor.formatarParaImpressao();
        assertEquals(test, atual);

    }

    @Test
    void testRegistrarItem() {
        ItemComanda mous = new ItemComanda(mouse, 1);
        comanda.registrarItem(mous);

        
        comanda.registrarItem(mous);

        assertTrue(comanda.getItens().contains(mous));
    }
}
