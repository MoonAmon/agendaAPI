package dev.moon.agendaapi.user;

import dev.moon.agendaapi.model.Cargo;
import dev.moon.agendaapi.model.Aluno;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public record UserAgenda(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        Long matricula,
        @Enumerated(EnumType.STRING)
        Cargo role,
        LocalDateTime createdAt,

        @OneToOne
        @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable = false, updatable = false)
        Aluno aluno
) { }
