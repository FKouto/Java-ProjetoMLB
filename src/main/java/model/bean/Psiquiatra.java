package model.bean;

public class Psiquiatra extends Pessoa {

    private int numConselho;
    private String profissionalização;
    private String tipoConsulta;
    private Telefone telefone; // Objeto Telefone que armazena o número de telefone do paciente
    private Endereco endereco; // Objeto Endereco que representa o endereço do paciente

    // CONSTRUTOR
    public Psiquiatra(int numConselho, String profissionalização, String tipoConsulta, Telefone telefone, Endereco endereco, int idPessoa, String nome, String email, String senha) {
        super(idPessoa, nome, email, senha);
        this.numConselho = numConselho;
        this.profissionalização = profissionalização;
        this.tipoConsulta = tipoConsulta;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters & Setters
    public int getNumConselho() {
        return numConselho;
    }

    public void setNumConselho(int numConselho) {
        this.numConselho = numConselho;
    }

    public String getProfissionalização() {
        return profissionalização;
    }

    public void setProfissionalização(String profissionalização) {
        this.profissionalização = profissionalização;
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
