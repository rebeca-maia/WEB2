package model;

import dao.EnderecoDAO;

/**
 *
 * @author Rebeca
 */

public class Endereco {
    private String rua;
    private String num;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private int id;
    
    private EnderecoDAO edao = EnderecoDAO.getInstance();
    
    public void adicionarEndereco(Endereco e){
        Endereco novoe = new Endereco();
        System.out.println("entrou em adicionar endereço");
        try{
            novoe.setBairro(e.getBairro());
            novoe.setCep(e.getCep());
            novoe.setCidade(e.getCidade());
            novoe.setComplemento(e.getComplemento());
            novoe.setEstado(e.getEstado());
            novoe.setNum(e.getNum());
            novoe.setPais(e.getPais());
            novoe.setRua(e.getRua());
            
            edao.adicionarEndereco(novoe);
        }catch(Exception ex){
            System.out.println(ex.getMessage()+"Erro ao adicionar endereco");
        }
    }
    
    public void atualizarEndereco(Endereco e){
        Endereco novoe = new Endereco();
        System.out.println("entrou em atualizar endereço");
        try{
            novoe.setBairro(e.getBairro());
            novoe.setCep(e.getCep());
            novoe.setCidade(e.getCidade());
            novoe.setComplemento(e.getComplemento());
            novoe.setEstado(e.getEstado());
            novoe.setNum(e.getNum());
            novoe.setPais(e.getPais());
            novoe.setRua(e.getRua());
            
            edao.atualizarEndereco(novoe);
        }catch(Exception ex){
            System.out.println(ex.getMessage()+"Erro ao atualizar endereco");
        }
    }
    
    public void deleteEndereco(Endereco e){
        Endereco novoe = new Endereco();
        System.out.println("entrou em deletar endereço");
        try{
            novoe.setBairro(e.getBairro());
            novoe.setCep(e.getCep());
            novoe.setCidade(e.getCidade());
            novoe.setComplemento(e.getComplemento());
            novoe.setEstado(e.getEstado());
            novoe.setNum(e.getNum());
            novoe.setPais(e.getPais());
            novoe.setRua(e.getRua());
            
            edao.deleteEndereco(novoe);
        }catch(Exception ex){
            System.out.println(ex.getMessage()+"Erro ao deletar endereco");
        }
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
