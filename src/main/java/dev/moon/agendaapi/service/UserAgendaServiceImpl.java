package dev.moon.agendaapi.service;

import dev.moon.agendaapi.models.UserAgenda;
import dev.moon.agendaapi.repos.UserAgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAgendaServiceImpl implements UserAgendaService {

    @Autowired
    private UserAgendaRepository userAgendaRepository;

    @Override
    public UserAgenda save(UserAgenda userAgenda) {
        return userAgendaRepository.save(userAgenda);
    }

    @Override
    public List<UserAgenda> findAll() {
        return userAgendaRepository.findAll();
    }

    @Override
    public Optional<UserAgenda> findById(Long id) {
        return userAgendaRepository.findById(id);
    }

    @Override
    public UserAgenda update(UserAgenda userAgenda) {
        return userAgendaRepository.save(userAgenda);
    }

    @Override
    public void deleteById(Long id) {
        userAgendaRepository.deleteById(id);
    }

}
