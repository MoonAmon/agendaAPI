package dev.moon.agendaapi.controllers;

import dev.moon.agendaapi.model.Agenda;
import dev.moon.agendaapi.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/agenda")
public class AgendaControl {

    @Autowired
    private AgendaService agendaService;

    @GetMapping
    public ResponseEntity<List<Agenda>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(agendaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Agenda>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(agendaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Agenda> create(@RequestBody Agenda agenda) {
        return ResponseEntity.status(HttpStatus.OK).body(agendaService.save(agenda));
    }

    @PutMapping
    public ResponseEntity<Agenda> update(@RequestBody Agenda agenda) {
        return ResponseEntity.status(HttpStatus.OK).body(agendaService.update(agenda));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        agendaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
