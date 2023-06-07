package model;

public class Profissional extends Pessoa {

    private int numConselho;
    private String qualification;
    private String queryType;

    /*Criando método construtor*/
    public Profissional(int id, String name, String email, String address, String password, int numConselho, String qualification, String queryType) {
        super(id, name, email, address, password);
        this.numConselho = numConselho;
        this.qualification = qualification;
        this.queryType = queryType;
    }

    /*Getters & Setters*/
    public int getNumConselho() {
        return numConselho;
    }

    public void setNumConselho(int numConselho) {
        this.numConselho = numConselho;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }
}
