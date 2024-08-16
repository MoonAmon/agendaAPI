package dev.moon.agendaapi.agendamento;

import dev.moon.agendaapi.aluno.Aluno;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
