package model;

import java.util.ArrayList;

/**
 *
 * @author Rebeca
 */
public class HistoricoPedidos {
     private ArrayList<Pedido> pedidos = new ArrayList<> ();
     
     public void adicPedidos(Pedido a){}
     public void lerHistorico(ArrayList<Pedido> b){}

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
     
     
     
}
