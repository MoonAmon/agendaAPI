package dev.moon.agendaapi.controllers;

import dev.moon.agendaapi.model.UserAgenda;
import dev.moon.agendaapi.service.UserAgendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserAgendaControl {

    @Autowired
    private UserAgendaService userAgendaService;

    @GetMapping
    public ResponseEntity<List<UserAgenda>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(userAgendaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserAgenda>> findById(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userAgendaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UserAgenda> create(@RequestBody UserAgenda userAgenda) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userAgendaService.save(userAgenda));
    }

    @PutMapping
    public ResponseEntity<UserAgenda> update(@RequestBody UserAgenda userAgenda) {
        return ResponseEntity.status(HttpStatus.OK).body(userAgendaService.update(userAgenda));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        userAgendaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
