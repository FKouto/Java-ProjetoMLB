package model;

public abstract class Pessoa {

    private String name;
    private String email;
    private String address;
    private String password;

    /*Criando o método construtor Pessoa, para Paciente, Psicólogo e Psiquiatra herdarem*/
    public Pessoa(String name, String email, String address, String password) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
    }
    public Pessoa(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /*Getters & Setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
