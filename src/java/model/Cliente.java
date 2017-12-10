package model;

import dao.ClienteDAO;

/**
 *
 * @author Rebeca
 */

public class Cliente extends Empresa{
    
    private int id;
    private ClienteDAO d = ClienteDAO.getInstance();

    private void cadastrarCliente(Cliente c){
        Cliente novoc=new Cliente();
        System.out.println("entrou em cadastrar cliente");
        
        try{
            novoc.setCnpj(c.getCnpj());
            novoc.setEmail(c.getEmail());
            novoc.setEnd(c.getEnd());
            novoc.setLogin(c.getLogin());
            novoc.setNomeFantasia(c.getNomeFantasia());
            novoc.setRazaoSocial(c.getRazaoSocial());
            novoc.setSenha(c.getSenha());
            novoc.setTipo(c.getTipo());
            
            d.adicionarCliente(novoc);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao adicionar cliente");
        
        }
    }
    
    public void deletarCliente(Cliente c){
        Cliente novoc=new Cliente();
        System.out.println("entrou em deletar cliente");
        
        try{
            novoc.setCnpj(c.getCnpj());
            novoc.setEmail(c.getEmail());
            novoc.setEnd(c.getEnd());
            novoc.setLogin(c.getLogin());
            novoc.setNomeFantasia(c.getNomeFantasia());
            novoc.setRazaoSocial(c.getRazaoSocial());
            novoc.setSenha(c.getSenha());
            novoc.setTipo(c.getTipo());
            
            d.deletarCliente(novoc);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao deletar cliente");
        
        }
    }
    
    public void atualizarCliente(Cliente c){
        Cliente novoc=new Cliente();
        System.out.println("entrou em atualizar cliente");
        
        try{
            novoc.setCnpj(c.getCnpj());
            novoc.setEmail(c.getEmail());
            novoc.setEnd(c.getEnd());
            novoc.setLogin(c.getLogin());
            novoc.setNomeFantasia(c.getNomeFantasia());
            novoc.setRazaoSocial(c.getRazaoSocial());
            novoc.setSenha(c.getSenha());
            novoc.setTipo(c.getTipo());
            
            d.atualizarCliente(novoc);
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro ao atualizar cliente");
        
        }
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
   
    
}
