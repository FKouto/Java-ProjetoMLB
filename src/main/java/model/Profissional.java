package model;

public class Profissional extends Pessoa {

    private int numConselho;
    private String profissionalização;
    private String tipoConsulta;

    /*Criando método construtor*/
    public Profissional(int numConselho, String especializacao, String tipoConsulta, int idPessoa, String nome, String email, int idTelefone, int telefone, int idEndereco, String rua, String bairro, String cidade, String estado, int cep, String senha) {
        super(idPessoa, nome, email, idTelefone, telefone, idEndereco, rua, bairro, cidade, estado, cep, senha);
        this.numConselho = numConselho;
        this.profissionalização = especializacao;
        this.tipoConsulta = tipoConsulta;
    }

    /*Getters & Setters*/
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
    
}
