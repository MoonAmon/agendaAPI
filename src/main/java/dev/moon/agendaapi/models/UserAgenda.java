package dev.moon.agendaapi.models;

import dev.moon.agendaapi.models.enums.Cargo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class UserAgenda {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true, nullable = false)
        private Long matricula;

        @Enumerated(EnumType.STRING)
        private Cargo role;

        private LocalDateTime createdAt;

        @OneToOne
        @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable = false, updatable = false)
        private Aluno aluno;

        @PrePersist
        protected void onCreate() {
                createdAt = LocalDateTime.now();
        }
}
