package dev.moon.agendaapi.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDate;

@Data
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long matricula;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String contato;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Turno turnoDisponivel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Curso curso;

    @Column(nullable = false)
    private String motivoDesc;
}
