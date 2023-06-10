package model.bean;

public class Paciente extends Pessoa {

    private int cpf;
    private int idTelefone;
    private int idEndereco;

    //Construtor
    public Paciente() {
    }

    public Paciente(int cpf, String nome, String email, String senha, int idTelefone, int idEndereco) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.idTelefone = idTelefone;
        this.idEndereco = idEndereco;
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

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    

}
