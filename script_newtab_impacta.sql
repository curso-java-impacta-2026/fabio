-- Ativar o banco de dados para que os próximos comandos rodem dentro dele
USE impacta;

-- 2. Criar a tabela 'alunos' com as características solicitadas
CREATE TABLE alunos (
    codigo INT NOT NULL DEFAULT 1 PRIMARY KEY,
    nome VARCHAR(30),
    telefone VARCHAR(25)
);