package dev.moon.agendaapi.service;

import dev.moon.agendaapi.models.Agenda;

import java.util.List;
import java.util.Optional;

public interface AgendaService {
    Agenda save(Agenda agenda);

    List<Agenda> findAll();

    Optional<Agenda> findById(Long id);

    Agenda update(Agenda agenda);

    void deleteById(Long id);
}
