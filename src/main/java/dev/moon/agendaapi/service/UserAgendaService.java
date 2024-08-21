package dev.moon.agendaapi.service;

import dev.moon.agendaapi.models.UserAgenda;

import java.util.List;
import java.util.Optional;

public interface UserAgendaService {
    UserAgenda save(UserAgenda userAgenda);

    List<UserAgenda> findAll();

    Optional<UserAgenda> findById(Long id);

    UserAgenda update(UserAgenda userAgenda);

    void deleteById(Long id);

}
