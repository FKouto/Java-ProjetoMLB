package model;

public abstract class Pessoa extends PessoaTelefone{
    private int idPessoa;
    private String nome;
    private String email;
    private String senha;

    /*Criando o método construtor Pessoa, para Paciente, Psicólogo e Psiquiatra herdarem*/    
    public Pessoa(int idPessoa, String nome, String email, int idTelefone, int telefone, int idEndereco, String rua, String bairro, String cidade, String estado, int cep, String senha) {
        super(idTelefone, telefone, idEndereco, rua, bairro, cidade, estado, cep);
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    //Getters & Setters
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
