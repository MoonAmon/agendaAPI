package dev.moon.agendaapi.service;

import dev.moon.agendaapi.models.Aluno;

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
