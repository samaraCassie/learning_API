package com.curso.curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Professor {
    @Id
    private Long idProfessor;

    private String nome;
    private Curso[] cursos;
    private Aluno[] alunos;
    
    public Long getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Curso[] getCursos() {
        return cursos;
    }
    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
