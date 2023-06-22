package model.bean;

public class Endereco {

    private int codEndereco; // Código do endereço
    private String rua; // Nome da rua
    private String bairro; // Nome do bairro
    private String cidade; // Nome da cidade
    private String estado; // Nome do estado
    private int cep; // CEP do endereço

    // CONSTRUTOR
    public Endereco() {
    }
    
    public Endereco(int codEndereco, String rua, String bairro, String cidade, String estado, int cep) {
        this.codEndereco = codEndereco;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters & Setters
    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
