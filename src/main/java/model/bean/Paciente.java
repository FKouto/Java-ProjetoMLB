package model.bean;

public class Paciente extends Pessoa {
    private int cpf; // CPF do paciente
    private Telefone telefone; // Objeto Telefone que armazena o número de telefone do paciente
    private Endereco endereco; // Objeto Endereco que representa o endereço do paciente

    // CONSTRUTOR
    public Paciente(int cpf, Telefone telefone, Endereco endereco, int idPessoa, String nome, String email, String senha) {
        super(idPessoa, nome, email, senha); // Chama o construtor da classe pai (Pessoa)
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Paciente(int idPessoa, String nome, int cpf, String email, String senha) {
        super(idPessoa, nome, email, senha); // Chama o construtor da classe pai (Pessoa)
        this.cpf = cpf;
    }
    
    public Paciente(String email, String senha){
        super(email,senha);
    }
    
    public Paciente(String email){
        super(email);
    }
    // Getters & Setters
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
