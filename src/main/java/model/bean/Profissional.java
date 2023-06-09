package model.bean;

public class Profissional extends Pessoa {

    private int numConselho;
    private String profissionalização;
    private String tipoConsulta;
    private Endereco endereco;
    private Telefone telefone;

    //Construtor
    public Profissional() {
    }

    public Profissional(int numConselho, String profissionalização, String tipoConsulta, String nome, String email, String senha, Endereco endereco, Telefone telefone) {
        super(nome, email, senha);
        this.numConselho = numConselho;
        this.profissionalização = profissionalização;
        this.tipoConsulta = tipoConsulta;
        this.endereco = endereco;
        this.telefone = telefone;
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
