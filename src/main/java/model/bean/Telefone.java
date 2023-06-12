package model.bean;

public class Telefone {

    private int codTel;
    private String numero;

    //Construtor
    public Telefone() {
    }
    
    public Telefone(int codTel, String numero) {
        this.codTel = codTel;
        this.numero = numero;
    }

    //Getters & Setters
    public int getCodTel() {
        return codTel;
    }

    public void setCodTel(int codTel) {
        this.codTel = codTel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
