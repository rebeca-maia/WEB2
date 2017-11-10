package model;
/**
 *
 * @author Rebeca
 */
import java.util.ArrayList;

public class Empresa {
    private String tipo;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private ArrayList<Usuario> funcionarios = new ArrayList<> ();
    private Endereco end;

    public Endereco getEnd() {
        return end;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public ArrayList<Usuario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Usuario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
