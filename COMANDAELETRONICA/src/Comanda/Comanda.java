package Comanda;

import java.util.ArrayList;

	public class Comanda {

	    private ArrayList<ItemComanda> itens;

	    public Comanda() {
	        itens = new ArrayList<ItemComanda>();
	    }

	    public void registrarItem(ItemComanda item) {
	        itens.add(item);
	    }

	    public float calcularValorTotal() {
	        float total = 0.0f;
	        for (ItemComanda item : itens) {
	            total += item.calcularPreco();
	        }
	        return total;
	    }

	    public String formatarParaImpressao() {
	        StringBuilder sb = new StringBuilder();
	        for (ItemComanda item : itens) {
	            sb.append(item.formatarParaImpressao() + "\n");
	        }
	        return sb.toString();
	    }

		public ArrayList<ItemComanda> getItens() {   //foi criado uma get e set para poder retornar o valor do item 
			return itens;
		}

		public void setItens(ArrayList<ItemComanda> itens) { //foi criado uma get e set para poder retornar o valor do item
			this.itens = itens;
		}
	

}
