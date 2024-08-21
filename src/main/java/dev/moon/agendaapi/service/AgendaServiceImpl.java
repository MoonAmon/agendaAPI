package dev.moon.agendaapi.service;

import dev.moon.agendaapi.models.Agenda;
import dev.moon.agendaapi.repos.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Override
    public Agenda save(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @Override
    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    @Override
    public Agenda update(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @Override
    public void deleteById(Long id) {
        agendaRepository.deleteById(id);
    }

    @Override
    public Optional<Agenda> findById(Long id) {
        return agendaRepository.findById(id);
    }


}
