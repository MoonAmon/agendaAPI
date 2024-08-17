package dev.moon.agendaapi.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Agenda {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "matricula_aluno", nullable = false)
        private Long matriculaAluno;

        @Column(nullable = false)
        private LocalDateTime dataHoraAtendimento;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Turno turno;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Status status;

        @Column(nullable = false)
        private LocalDateTime createdAt;

        @ManyToOne
        @JoinColumn(name = "matricula_aluno", referencedColumnName = "matricula", insertable = false, updatable = false)
        private Aluno aluno;

        @PrePersist
        protected void onCreate() {
                createdAt = LocalDateTime.now();
        }
}
