package dev.moon.agendaapi.aluno;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;

    private String nome;

    private LocalDate dataNascimento;

    private String cpf;

    private String email;

    private String contato;

    @Enumerated(EnumType.STRING)
    private Turno turnoDisponivel;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    private String motivoDesc;
}
