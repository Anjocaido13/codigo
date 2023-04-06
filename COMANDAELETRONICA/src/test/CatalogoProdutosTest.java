package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import Comanda.CatalogoProdutos;
import Comanda.Produto;

public class CatalogoProdutosTest {
    CatalogoProdutos catalogoProdutos = new CatalogoProdutos();
    //aqui eu usei alguns produtos de teste

    Produto celular = new Produto(1, "Celular", (float) 1500.00);
    Produto teclado = new Produto(2, "Teclado", (float) 100.0);
    Produto mouse = new Produto(3, "Mouse", (float) 20.0);
    @Test
    void testBuscarProduto() {



        //vai cadastrar os produtos 
        catalogoProdutos.cadastrarProdutos(celular);
        catalogoProdutos.cadastrarProdutos(teclado);
        catalogoProdutos.cadastrarProdutos(mouse);

        //vai testar se os produtos está na prateleira
        assertEquals(celular, catalogoProdutos.buscarProduto(1));
        assertEquals(teclado, catalogoProdutos.buscarProduto(2));
        assertEquals(mouse, catalogoProdutos.buscarProduto(3));

        //vai testar o codigo de um produto que não existe e vai retornar null
        assertNull(catalogoProdutos.buscarProduto(8));


    }

    @Test
    void testCadastrarProdutos() {
        //cadastrar o produto celular
        catalogoProdutos.cadastrarProdutos(celular);
        //vai ver se o celular esta no catalogo de produtos
        assertEquals(celular, catalogoProdutos.buscarProduto(1));


    }

    @Test
    void testFormatarParaImpressao() {
        Produto Impressora = new Produto(25, "Impressora", 800.0f);

        
        String test = " 25|Impressora     |R$ 800,00";
        String atual = Impressora.formatarParaImpressao();
        assertEquals(test, atual);


    }
}
