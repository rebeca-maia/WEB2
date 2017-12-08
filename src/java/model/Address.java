package model;

public class Address {

    private int idEndereco;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if (rua == null || rua.isEmpty()) {
            throw new Exception("O campo Rua é obrigatório.");
        } else {
            this.rua = rua;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if (numero == null || numero.isEmpty()) {
            throw new Exception("O campo Número é obrigatório.");
        } else {
            this.numero = numero;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro == null || bairro.isEmpty()) {
            throw new Exception("O campo Bairro é obrigatório.");
        } else {
            this.bairro = bairro;
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (complemento == null) {
            this.complemento = "";
        } else {
            this.complemento = complemento;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws Exception {
        if (cep == null || cep.isEmpty()) {
            throw new Exception("O campo CEP é obrigatório.");
        } else {
            this.cep = cep;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception {
        if (cidade == null || cidade.isEmpty()) {
            throw new Exception("O campo Cidade é obrigatório.");
        } else {
            this.cidade = cidade;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (estado == null || estado.isEmpty()) {
            throw new Exception("O campo Estado é obrigatório.");
        } else {
            this.estado = estado;
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws Exception {
        if (pais == null || pais.isEmpty()) {
            throw new Exception("O campo País é obrigatório.");
        } else {
            this.pais = pais;
        }
    }
}
