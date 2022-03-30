package com.company;

public class Aluno {
    private int ra;
    private String nome;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(int ra, String nome, String telefone,
                 String email, String cidade, String estado){
        this(ra, nome);
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
    }
    public Aluno(){

    }
}
