package dev.moon.agendaapi.user;

import dev.moon.agendaapi.model.Aluno;
import dev.moon.agendaapi.model.Status;
import dev.moon.agendaapi.model.Turno;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public record Agenda(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        Long matriculaAluno,
        LocalDateTime dataHoraAtendimento,
        @Enumerated(EnumType.STRING)
        Turno turno,
        @Enumerated(EnumType.STRING)
        Status status,
        LocalDateTime createdAt,

        @ManyToOne
        @JoinColumn(name = "matriculaAluno", referencedColumnName = "matricula", insertable = false, updatable = false)
        Aluno aluno
) {
}
