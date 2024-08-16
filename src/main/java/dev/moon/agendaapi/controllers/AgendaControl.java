package dev.moon.agendaapi.agenda;

import dev.moon.agendaapi.aluno.Aluno;
import dev.moon.agendaapi.repos.AgendaRepository;
import dev.moon.agendaapi.repos.AlunoRepository;
import dev.moon.agendaapi.repos.UserAgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AgendaControl {
    private final AlunoRepository alunoRepository;
    private final AgendaRepository agendaRepository;
    private final UserAgendaRepository userAgendaRepository;

    @Autowired
    public AgendaControl(AlunoRepository alunoRepository, AgendaRepository agendaRepository, UserAgendaRepository userAgendaRepository) {
        this.alunoRepository = alunoRepository;
        this.agendaRepository = agendaRepository;
        this.userAgendaRepository = userAgendaRepository;
    }

    @GetMapping("")
    List<Aluno> getAllAgendas() {
        return agendaRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void createAluno(@Valid @RequestBody Aluno aluno) {
        alunoRepository.create(aluno);
    }
}
