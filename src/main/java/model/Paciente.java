package model;

public class Paciente extends Pessoa {

    private int cpf;
    private int phone;

    /*Criando método construtor*/
    public Paciente(int id, String name, String email, String address, int phone, int cpf, String password) {
        super(id, name, email, address, password);
        this.cpf = cpf;
        this.phone = phone;
    }
    //Metódo construtor usado em ViewLogin para verificar email e senha no banco de dados
    public Paciente(String email, String password){
        super(email, password);
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
}
