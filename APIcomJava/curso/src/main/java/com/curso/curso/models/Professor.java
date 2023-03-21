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
}
