CREATE TABLE cliente (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE animal (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255),
    especie VARCHAR(50),
    idade BIGINT,
    cliente_id BIGINT,
    CONSTRAINT fk_animal_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);
