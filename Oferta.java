package model;

import dao.OfertaDAO;

/**
 *
 * @author Rebeca
 */
public class Oferta {
    private String categoria; //papelaria,hardware,software,veiculo,serviços
    private Produto p;
    private float precoTotal;
    private int qtd;
    private int id;
    private Pedido or;

    private OfertaDAO d = OfertaDAO.getInstance();
    
    public void cadastrar(Oferta o){
        Oferta novao = new Oferta();
        System.out.println("entrou em cadastrar oferta");
        
        try{
            novao.setCategoria(o.getCategoria());
            novao.setOr(o.getOr());
            novao.setP(o.getP());
            novao.setPrecoTotal(o.getPrecoTotal());
            novao.setQtd(o.getQtd());
                    
           d.cadastrar(novao);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao adicionar oferta");
        
        }
    } 
    
    public void deletarOferta(Oferta o){
         Oferta novao = new Oferta();
        System.out.println("entrou em deletar oferta");
        
        try{
            novao.setCategoria(o.getCategoria());
            novao.setOr(o.getOr());
            novao.setP(o.getP());
            novao.setPrecoTotal(o.getPrecoTotal());
            novao.setQtd(o.getQtd());
                    
           d.deletarOferta(novao);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao deletar oferta");
        
        }
    }
    
    public void atualizarOferta(Oferta o){
        Oferta novao = new Oferta();
        System.out.println("entrou em atualizar oferta");
        
        try{
            novao.setCategoria(o.getCategoria());
            novao.setOr(o.getOr());
            novao.setP(o.getP());
            novao.setPrecoTotal(o.getPrecoTotal());
            novao.setQtd(o.getQtd());
                    
           d.atualizarOferta(novao);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao atualizar oferta");
        
        }
    }
    
    public Pedido getOr() {
        return or;
    }

    public void setOr(Pedido or) {
        this.or = or;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
}
