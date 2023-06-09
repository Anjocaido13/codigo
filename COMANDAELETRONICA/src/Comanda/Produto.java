package Comanda;



public class Produto {

    private int codigo;
    private String descricao;
    private float precoUnitario;

    public Produto(int c, String d, float p) {
        codigo = c;
        descricao = d;
        precoUnitario = p;
    }

    public String formatarParaImpressao() {
        return String.format("%3d|%-15s|R$ %.2f", codigo, descricao, precoUnitario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}