package model;

import dao.ProdutoDAO;
import java.util.ArrayList;

/**
 *
 * @author Rebeca
 */
public class Produto {
    private int id;
    private String titulo;
    private String descricao;
    private float preco;
    
    
    private ProdutoDAO prodDAO = ProdutoDAO.getInstance();
    
    public void cadastrarProduto(Produto p){
        Produto novoProduto = new Produto();
        
        System.out.println("Entrou em cadastrar produto");
        try{
            novoProduto.setTitulo(p.getTitulo());
            novoProduto.setPreco(p.getPreco());
            novoProduto.setDescricao(p.getDescricao());
            
            prodDAO.adicionarProduto(novoProduto);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao cadastrar produto");
        
        }
    }
    
    public void deletarProduto(Produto p){
        Produto novoProduto = new Produto();
        System.out.println("Entrou em deletar produto");
        try{
            novoProduto.setTitulo(p.getTitulo());
            novoProduto.setPreco(p.getPreco());
            novoProduto.setDescricao(p.getDescricao());
            
            prodDAO.deletarProduto(novoProduto);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao deletar produto");
        }
    }
    
    public void atualizarProduto(Produto p){
        Produto novoProduto = new Produto();
        System.out.println("Entrou em deletar produto");
        try{
            novoProduto.setTitulo(p.getTitulo());
            novoProduto.setPreco(p.getPreco());
            novoProduto.setDescricao(p.getDescricao());
            
            prodDAO.atualizarProduto(novoProduto);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao alterar produto");
        }
    }
    
    public ArrayList buscarProdutoPorTitulo(String titulo){
        System.out.println("Entrou em deletar produto");
        try{
            return prodDAO.buscarProdutoPorTitulo(titulo);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao alterar produto");
            return null;
        }
    }
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
