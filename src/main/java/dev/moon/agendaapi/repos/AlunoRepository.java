package dev.moon.agendaapi.repos;

import dev.moon.agendaapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
