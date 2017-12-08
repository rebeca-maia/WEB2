package model;

public class Company {

    private int id;
    private String tipo;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private Address endereco;
    private String email;
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        if (tipo == null || tipo.isEmpty()) {
            throw new Exception("O campo Tipo é obrigatório.");
        } else {
            this.tipo = tipo;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws Exception {
        if (cnpj == null || cnpj.isEmpty()) {
            throw new Exception("O campo CNPJ é obrigatório.");
        } else {
            this.cnpj = cnpj;
        }
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) throws Exception {
        if (razaoSocial == null || razaoSocial.isEmpty()) {
            throw new Exception("O campo Razão Social é obrigatório.");
        } else {
            this.razaoSocial = razaoSocial;
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) throws Exception {
        if (nomeFantasia == null || nomeFantasia.isEmpty()) {
            throw new Exception("O campo Nome Fantasia é obrigatório.");
        } else {
            this.nomeFantasia = nomeFantasia;
        }
    }

    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email == null || email.isEmpty()) {
            throw new Exception("O campo Email é obrigatório.");
        } else {
            this.email = email;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha == null || senha.isEmpty()) {
            throw new Exception("O campo Senha é obrigatório.");
        } else {
            this.senha = senha;
        }
    }
}
