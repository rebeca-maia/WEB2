package model;

import java.util.ArrayList;

/**
 *
 * @author Rebeca
 */
public class Pedido {
    private float precoTotal;
    private int qtdTotal;
    private ArrayList<ItemPedido> itens = new ArrayList<> ();

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }
    
    
}
