package model.bean;

public class Paciente extends Pessoa {

    private int cpf;
    private Telefone telefone;
    private Endereco endereco;

    //Construtor
    
    /*DAO*/

    public Paciente(int cpf, Telefone telefone, Endereco endereco, int idPessoa, String nome, String email, String senha) {
        super(idPessoa, nome, email, senha);
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Paciente(int idPessoa, String nome, int cpf, String email, String senha) {
        super(idPessoa, nome, email, senha);
        this.cpf = cpf;
    }
    

    //Getters & Setters
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
