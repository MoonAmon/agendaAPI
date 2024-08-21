package dev.moon.agendaapi.repos;

import dev.moon.agendaapi.models.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
