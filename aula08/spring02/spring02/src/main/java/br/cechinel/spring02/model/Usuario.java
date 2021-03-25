package br.cechinel.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // classe mapeada no db
@Table(name="usuario")
public class Usuario {

    @Id //nao tem relacao com o nome do campo, o @id é anotacao de chave primaria na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerado automaticamente, identitu ele fara sequencial; auto o banco decide
    @Column(name= "Codigo") // detalhes da coluna no banco de dados
    private int id;

    @Column(name= "nome", length = 150, nullable = false) //nullable= false significa que e um campo obrigadorio
    private String nome;

    @Column(name= "email", length = 30, nullable = false, unique=true)  // unique=true significa que nao pode ter dois emails iguais
    private String email;

    @Column(name= "cpf", length = 11, nullable = false, unique=true) 
    private String cpf;

    @Column(name= "senha", length = 20, nullable = false)
    private String senha;




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
