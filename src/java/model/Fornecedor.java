package model;

import dao.FornecedorDAO;
import java.util.ArrayList;

/**
 *
 * @author Rebeca
 */
public class Fornecedor extends Empresa{
    private int id;
    
    private FornecedorDAO d = FornecedorDAO.getInstance();
    
    public void cadastrarFornecedor(Fornecedor c){
        Fornecedor novoc=new Fornecedor();
        System.out.println("entrou em cadastrar fornecedor");
        
        try{
            novoc.setCnpj(c.getCnpj());
            novoc.setEmail(c.getEmail());
            novoc.setEnd(c.getEnd());
            novoc.setLogin(c.getLogin());
            novoc.setNomeFantasia(c.getNomeFantasia());
            novoc.setRazaoSocial(c.getRazaoSocial());
            novoc.setSenha(c.getSenha());
            novoc.setTipo(c.getTipo());
            
            d.adicionarFornecedor(novoc);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao adicionar fornecedor");
        
        }
    }
    
    public void deletarFornecedor(Fornecedor c){
        Fornecedor novoc=new Fornecedor();
        System.out.println("entrou em deletar fornecedor");
        
        try{
            novoc.setCnpj(c.getCnpj());
            novoc.setEmail(c.getEmail());
            novoc.setEnd(c.getEnd());
            novoc.setLogin(c.getLogin());
            novoc.setNomeFantasia(c.getNomeFantasia());
            novoc.setRazaoSocial(c.getRazaoSocial());
            novoc.setSenha(c.getSenha());
            novoc.setTipo(c.getTipo());
            
            d.deletarFornecedor(novoc);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao deletar fornecedor");
        
        }
    }
    
    public Fornecedor buscarFornecedorPorCNPJ(String cnpj){
        System.out.println("entrou em buscar fornecedor por cnpj");
        try{
            return d.buscarFornecedorPorCNPJ(cnpj);
        
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao buscar fornecedor por cnpj");
            return null;
        }
    }
     
    public ArrayList buscarFornecedorPorNome(String nome){
        System.out.println("entrou em buscar fornecedor por nome");
        try{
            return d.buscarFornecedorPorNome(nome);
        
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao buscar fornecedor por nome");
            return null;
        }
    }
    
    
    public ArrayList buscarFornecedorPorRazSoc(String nome){
         System.out.println("entrou em buscar fornecedor por razao social");
        try{
            return d.buscarFornecedorPorRazSoc(nome);
        
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao buscar fornecedor por razao social");
            return null;
        }
    }
    
    public void atualizarFornecedor(Fornecedor c){
         Fornecedor novoc=new Fornecedor();
        System.out.println("entrou em atualizar fornecedor");
        
        try{
            novoc.setCnpj(c.getCnpj());
            novoc.setEmail(c.getEmail());
            novoc.setEnd(c.getEnd());
            novoc.setLogin(c.getLogin());
            novoc.setNomeFantasia(c.getNomeFantasia());
            novoc.setRazaoSocial(c.getRazaoSocial());
            novoc.setSenha(c.getSenha());
            novoc.setTipo(c.getTipo());
            
            d.atualizarFornecedor(novoc);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao atualizar fornecedor");
        
        }
    }
    
    public void cadastrarOferta(Oferta o){
        o.cadastrarOferta(o);
    }
    
    public void deletarOferta(Oferta o){
        o.deletarOferta(o);
    }
    
    public void atualizarOferta(Oferta o){
        o.atualizarOferta(o);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void fazerOferta(){}
    
    
}
