package com.curso.curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    private Long idMatricula;

    private String nome;
    private Curso curso;
    
    public Long getIdMatricula() {
        return idMatricula;
    }
    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
}