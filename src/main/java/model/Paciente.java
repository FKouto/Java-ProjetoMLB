package model;

public class Paciente extends Pessoa{
    private int cpf;
    private int phone;
    private int age;
    private String profession;
    private String cause;

    /*Criando método construtor*/
    public Paciente(String name, String email, String address, int cpf, int phone, int age, String profession, String cause) {
        super(name, email, address);
        this.cpf = cpf;
        this.phone = phone;
        this.age = age;
        this.profession = profession;
        this.cause = cause;
    }
    /*Getters & Setters*/
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
    /*Methods*/
    
}
