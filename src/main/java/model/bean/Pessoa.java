package model.bean;

public abstract class Pessoa {

    private int idPessoa; // ID da pessoa
    private String nome; // Nome da pessoa
    private String email; // Email da pessoa
    private String senha; // Senha da pessoa

    // CONSTRUTOR
    public Pessoa() {
    }
    
    public Pessoa(int idPessoa, String nome, String email, String senha) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Construtor alternativo que recebe apenas email e senha(Usado para Login
    public Pessoa(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // Getters & Setters
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

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}
