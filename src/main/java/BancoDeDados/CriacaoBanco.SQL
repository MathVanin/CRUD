-- CRIAR BANCO DE DADOS

CREATE DATABASE "Portifolio"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


-- CRIAR TABELA DE PRODUTOS

CREATE TABLE Produtos (
  IDPRODUTO serial PRIMARY KEY,
  UUIDPRODUTO uuid NOT NULL,
  CODINTERNO varchar(15) NOT NULL,
  NOME varchar(100) NOT NULL,
  DESCRICAO varchar(150) NOT NULL,
  DESCRITIVO text,
  LARGURA real,
  ALTURA real,
  COMPRIMENTO real,
  PESOBRUTO real,
  PESOLIQUIDO real,
  VALORCOMPRA numeric(10,2),
  VALORVENDA numeric(10,2)
);
