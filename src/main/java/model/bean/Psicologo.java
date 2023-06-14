package model.bean;

public class Psicologo extends Pessoa {

    private int numConselho;
    private String profissionalizacao;
    private String tipoConsulta;
    private Telefone telefone; // Objeto Telefone que armazena o número de telefone do paciente
    private Endereco endereco; // Objeto Endereco que representa o endereço do paciente

    // CONSTRUTOR
    public Psicologo(int numConselho, String profissionalização, String tipoConsulta, Telefone telefone, Endereco endereco, int idPessoa, String nome, String email, String senha) {
        super(idPessoa, nome, email, senha);
        this.numConselho = numConselho;
        this.profissionalizacao = profissionalização;
        this.tipoConsulta = tipoConsulta;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Psicologo(int idPessoa, String nome, int numConselho, String profissionalizacao, String tipoConsulta, String email, String senha){
        super(idPessoa, nome, email, senha);
        this.numConselho = numConselho;
        this.profissionalizacao = profissionalizacao;
        this.tipoConsulta = tipoConsulta;
    }
    
    public Psicologo(String email, String senha){
        super(email,senha);
    }

    // Getters & Setters
    public int getNumConselho() {
        return numConselho;
    }

    public void setNumConselho(int numConselho) {
        this.numConselho = numConselho;
    }

    public String getProfissionalizacao() {
        return profissionalizacao;
    }

    public void setProfissionalizacao(String profissionalizacao) {
        this.profissionalizacao = profissionalizacao;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
