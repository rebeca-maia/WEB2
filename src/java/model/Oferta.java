package model;

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
