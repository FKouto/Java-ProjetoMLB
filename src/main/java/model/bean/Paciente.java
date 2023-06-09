package model.bean;

public class Paciente extends Pessoa {

    private int cpf;

    //Construtor
    public Paciente() {
    }

    public Paciente(int cpf, String nome, String email, String senha, int idTelefone, int idEndereco) {
        super(nome, email, senha);
        this.cpf = cpf;
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
}
