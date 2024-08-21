package dev.moon.agendaapi.repos;

import dev.moon.agendaapi.models.Role;
import dev.moon.agendaapi.models.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository {
    Optional<Role> findByName(ERole name);
}
