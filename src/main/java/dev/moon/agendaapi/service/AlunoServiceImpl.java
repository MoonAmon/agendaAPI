package dev.moon.agendaapi.service;

import dev.moon.agendaapi.models.Aluno;
import dev.moon.agendaapi.repos.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> saveAll(List<Aluno> alunos) {
        return alunoRepository.saveAll(alunos);
    }

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }

}
