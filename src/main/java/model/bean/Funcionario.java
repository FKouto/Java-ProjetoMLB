package model.bean;

public class Funcionario extends Pessoa {
    public Funcionario(int idPessoa, String nome, String email, String senha){
        super(idPessoa, nome, email, senha);
    }
    
    public Funcionario(String email, String senha){
        super(email,senha);
    }
}
