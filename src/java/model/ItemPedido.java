package model;

import dao.ItemPedidoDAO;

/**
 *
 * @author Rebeca
 */
public class ItemPedido {
    private int idPedido;
    private float precoTotal;
    private int quant;
    private Produto prod;
        
    ItemPedidoDAO idao = ItemPedidoDAO.getInstance();
    
    public void adicionarItemPedido(ItemPedido ip){
        ItemPedido novoip = new ItemPedido();
        
        System.out.println("Entrou em cadastrar itempedido");
        try{
            novoip.setPrecoTotal(ip.getPrecoTotal());
            novoip.setQuant(ip.getQuant());
            novoip.setProd(ip.getProd());
            
            idao.adicionarItemPedido(novoip);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao cadastrar itempedido");
        
        }
    }

    public void deletarItemPedido(ItemPedido ip){
        ItemPedido novoip = new ItemPedido();
        
        System.out.println("Entrou em deletar itempedido");
        try{
            novoip.setPrecoTotal(ip.getPrecoTotal());
            novoip.setQuant(ip.getQuant());
            novoip.setProd(ip.getProd());
            
            idao.deletarItemPedido(novoip);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao deletar itempedido");
        
        }
    }
    
    public void atualizarItemPedido(ItemPedido ip){
        ItemPedido novoip = new ItemPedido();
        
        System.out.println("Entrou em atualizar itempedido");
        try{
            novoip.setPrecoTotal(ip.getPrecoTotal());
            novoip.setQuant(ip.getQuant());
            novoip.setProd(ip.getProd());
            
            idao.atualizarItemPedido(novoip);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao atualizar itempedido");
        
        }
    }
    
    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }
    
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
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

    
}
