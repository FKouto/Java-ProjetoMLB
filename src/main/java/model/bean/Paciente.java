package model.bean;

public class Paciente extends Pessoa {

    private int cpf;
    private Telefone telefone;
    private Endereco endereco;

    //Construtor
    public Paciente() {
    }

    public Paciente(int cpf, Telefone telefone, Endereco endereco, String nome, String email, String senha) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /*DAO*/
    public Paciente(String nome, int cpf, String email, String senha) {
        super(nome, email, senha);
        this.cpf = cpf;
    }

    //Getters & Setters
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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
