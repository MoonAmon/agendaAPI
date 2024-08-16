package dev.moon.agendaapi.agendamento;

import dev.moon.agendaapi.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAgendaRepository extends JpaRepository<Aluno, Long> {
}
