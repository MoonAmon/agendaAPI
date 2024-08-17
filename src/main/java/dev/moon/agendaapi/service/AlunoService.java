package dev.moon.agendaapi.service;

import dev.moon.agendaapi.model.Aluno;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;
import java.util.Optional;

public interface AlunoService {
    Aluno save(Aluno aluno);

    List<Aluno> saveAll(List<Aluno> alunos);

    List<Aluno> findAll();

    Optional<Aluno> findById(Long id);

    Aluno update(Aluno aluno);

    void deleteById(Long id);

}
