package model.bean;

public abstract class Telefone {

    private int idTelefone;
    private String telefone;

    //Construtor
    public Telefone() {
    }

    public Telefone(int idTelefone, String telefone) {
        this.idTelefone = idTelefone;
        this.telefone = telefone;
    }

    //Getters & Setters
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

}
