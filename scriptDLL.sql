CREATE TYPE turno AS ENUM ('manha', 'tarde', 'noite');
CREATE TYPE curso AS ENUM ('graduação', 'ensino médio', 'técnico');
CREATE TYPE cargo AS ENUM ('administrador', 'aluno');
CREATE TYPE status AS ENUM('previsto', 'realizado', 'cancelado', 'reagendado');

CREATE TABLE Aluno (
    matricula INT UNIQUE NOT NULL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    data_nascimento DATE NOT NULL,
    cpf INT UNIQUE NOT NULL,
    nome_responsavel VARCHAR(150) NULL,
    email VARCHAR(250) UNIQUE NOT NULL,
    contato CHAR(13) NOT NULL,
    turno_disponivel turno NOT NULL,
    curso curso NOT NULL,
    motivo_desc TEXT NOT NULL
);

CREATE TABLE UserAgenda (
    id SERIAL PRIMARY KEY,
    matricula INT UNIQUE NOT NULL,
    role cargo NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (matricula) REFERENCES Aluno(matricula)
);

CREATE TABLE Agenda (
    id SERIAL PRIMARY KEY,
    matricula_aluno INT NOT NULL,
    data_hora_atendimento TIMESTAMP NOT NULL,
    turno turno NOT NULL,
    status status NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (matricula_aluno) REFERENCES UserAgenda(matricula)
);