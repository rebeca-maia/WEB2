package model;

import dao.PedidoDAO;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rebeca
 */
public class Pedido {
    private float precoTotal;
    private int qtdTotal;
    private ArrayList<ItemPedido> itens = new ArrayList<> ();
    private ArrayList<Oferta> of = new ArrayList<>();
    private int id;
    private Date d;
    
    
    PedidoDAO pdao = PedidoDAO.getInstance();
    
    public void adicionarPedido(Pedido p){
        Pedido novopedido = new Pedido();
        
        System.out.println("Entrou em cadastrar pedido");
        try{
            novopedido.setD(p.getD());
            novopedido.setItens(p.getItens());
            novopedido.setPrecoTotal(p.getPrecoTotal());
            novopedido.setQtdTotal(p.getQtdTotal());
            
            pdao.adicionarPedido(novopedido);
        }catch(Exception e){
             System.out.println(e.getMessage()+"Erro ao cadastrar pedido");
    
        }
    }
    
    public void deletarPedido(Pedido p){
        Pedido novopedido = new Pedido();
        
        System.out.println("Entrou em deletar pedido");
        try{
            novopedido.setD(p.getD());
            novopedido.setItens(p.getItens());
            novopedido.setPrecoTotal(p.getPrecoTotal());
            novopedido.setQtdTotal(p.getQtdTotal());
            
            pdao.deletarPedido(novopedido);
        }catch(Exception e){
             System.out.println(e.getMessage()+"Erro ao deletar pedido");
    
        }
    }
    
    public void atualizarPedido(Pedido p){
        Pedido novopedido = new Pedido();
        
        System.out.println("Entrou em atualizar pedido");
        try{
            novopedido.setD(p.getD());
            novopedido.setItens(p.getItens());
            novopedido.setPrecoTotal(p.getPrecoTotal());
            novopedido.setQtdTotal(p.getQtdTotal());
            
            pdao.deletarPedido(novopedido);
        }catch(Exception e){
             System.out.println(e.getMessage()+"Erro ao atualizar pedido");
    
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }
  
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
    
    public void adicionarItemPedido(ItemPedido p){
        p.setIdPedido(this.id);
        this.itens.add(p);
    }
    
    
}
