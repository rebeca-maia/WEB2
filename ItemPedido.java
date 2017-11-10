package model;

import java.util.ArrayList;

/**
 *
 * @author Rebeca
 */
public class ItemPedido {
    private float precoTotal;
    private int quant;
    private ArrayList<Produto> produtos = new ArrayList<> ();

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    

}
