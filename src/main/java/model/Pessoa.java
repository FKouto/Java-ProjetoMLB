package model;

public abstract class Pessoa {
private String name;
    private String email;
    private String address;

    /*Criando o método construtor Pessoa, para Paciente, Psicólogo e Psiquiatra herdarem*/
    public Pessoa(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
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
}
