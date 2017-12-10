package model;

import dao.ClienteDAO;

/**
 *
 * @author Rebeca
 */

public class Cliente extends Empresa{
    
    private int id;
    private ClienteDAO d = ClienteDAO.getInstance();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    private void lancarPedido(){}
    private void analisarOfertas(){}
    private void escolherOferta(){}
    private void adicBlacklist(Fornecedor e){}
    private void deletarBlacklist(Fornecedor e){}
    private void lerBlacklist(Fornecedor e){}
    private void cadastrarse(Cliente c){}
   
    
}
