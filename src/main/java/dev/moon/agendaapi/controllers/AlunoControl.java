package dev.moon.agendaapi.controllers;

import dev.moon.agendaapi.model.Aluno;
import dev.moon.agendaapi.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/aluno")
public class AlunoControl {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aluno>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));
    }

    @PostMapping("/all")
    public ResponseEntity<List<Aluno>> createBatch(@RequestBody List<Aluno> alunos) {
        List<Aluno> savedAlunos = alunoService.saveAll(alunos);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.saveAll(savedAlunos));
    }

    @PutMapping
    public ResponseEntity<Aluno> update(@RequestBody Aluno aluno) {
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.update(aluno));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        alunoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
