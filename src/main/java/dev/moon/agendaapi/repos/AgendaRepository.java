package dev.moon.agendaapi.agendamento;

import dev.moon.agendaapi.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Aluno, Long> {
}
