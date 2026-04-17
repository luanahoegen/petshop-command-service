CREATE TABLE agenda (
    id BIGSERIAL PRIMARY KEY,
    data_hora TIMESTAMP NOT NULL,
    descricao VARCHAR(255),
    tipo_servico VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    animal_id BIGINT NOT NULL,
    CONSTRAINT fk_agenda_animal FOREIGN KEY (animal_id) REFERENCES animal(id)
);
