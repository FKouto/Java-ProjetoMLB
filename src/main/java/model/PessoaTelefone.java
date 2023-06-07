package model;

public class PessoaTelefone extends PessoaEndereco{
    private int idTelefone;
    private int telefone;
    
    /*Método Construtor*/
    public PessoaTelefone(int idTelefone, int telefone, int idEndereco, String rua, String bairro, String cidade, String estado, int cep){
        super(idEndereco, rua, bairro, cidade, estado, cep);
        this.idTelefone = idTelefone;
        this.telefone = telefone;
    }
    
    //Getters & Setters
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }
    
}
