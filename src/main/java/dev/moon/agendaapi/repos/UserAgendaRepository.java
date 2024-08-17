package dev.moon.agendaapi.repos;

import dev.moon.agendaapi.model.UserAgenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgendaRepository extends JpaRepository<UserAgenda, Long> {
}
