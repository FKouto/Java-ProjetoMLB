package model;

public class Paciente extends Pessoa{

    private int cpf;

    /*Criando método construtor*/
    public Paciente(int cpf, int idPessoa, String nome, String email, int idTelefone, int telefone, int idEndereco, String rua, String bairro, String cidade, String estado, int cep, String senha) {
        super(idPessoa, nome, email, idTelefone, telefone, idEndereco, rua, bairro, cidade, estado, cep, senha);
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
