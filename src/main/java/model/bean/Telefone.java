package model.bean;

public abstract class Telefone {

    private int idTelefone;
    private int telefone;
    private int idPaciente;

    //Construtor
    public Telefone() {
    }

    public Telefone(int telefone, int idPaciente) {
        this.telefone = telefone;
        this.idPaciente = idPaciente;
    }
    //Getters & Setters

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
}
