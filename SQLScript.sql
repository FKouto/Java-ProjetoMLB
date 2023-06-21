/*Criando o banco de dados*/
create database db_mlb;

/*Usando o banco de dados*/
use db_mlb;

/*Paciente*/
/* Endereco paciente */
create table endereco_paciente (
    cod_endereco int primary key auto_increment,
    rua varchar(50) not null,
    bairro varchar(35) not null,
    cidade varchar(35) not null,
    estado varchar(35) not null,
    cep int not null
);

/* Telefone paciente */
create table telefone_paciente (
    cod_tel int primary key auto_increment,
    celular varchar(15) not null
);
/* Tabela Paciente */
create table paciente (
    id_paciente int primary key auto_increment,
    nome varchar(50) not null,
    cpf int not null,
    email varchar (40) not null,
    senha varchar (16) not null,
    cod_tel int not null,
    cod_endereco int not null,
    foreign key (cod_tel) references telefone_paciente (cod_tel),
    foreign key (cod_endereco) references endereco_paciente (cod_endereco)
);
/*Psicologo*/
/* Endereco psicologo */
create table endereco_psicologo (
    cod_endereco int primary key auto_increment,
    rua varchar(50) not null,
    bairro varchar(35) not null,
    cidade varchar(35) not null,
    estado varchar(35) not null,
    cep int not null
);
/* Telefone psicologo */
create table telefone_psicologo (
    cod_tel int primary key auto_increment,
    comercial varchar(15) not null
);
/* Tabela Psicologo */
create table psicologo (
    id_psicologo int primary key auto_increment,
    nome varchar(50) not null,
    numero_conselho int not null,
    profissionalizacao varchar(40) not null,
    tipo_consulta varchar(30) not null,
    email varchar (40) not null,
    senha varchar (16) not null,
    cod_tel int not null,
    cod_endereco int not null,
    foreign key (cod_tel) references telefone_psicologo (cod_tel),
    foreign key (cod_endereco) references endereco_psicologo (cod_endereco)
);
/*Psiquiatra*/
/* Endereco psiquiatra */
create table endereco_psiquiatra (
    cod_endereco int primary key auto_increment,
    rua varchar(50) not null,
    bairro varchar(35) not null,
    cidade varchar(35) not null,
    estado varchar(35) not null,
    cep int not null
);
/* Telefone psiquiatra */
create table telefone_psiquiatra (
    cod_tel int primary key auto_increment,
    comercial varchar(15) not null
);
/* Tabela Psiquiatra */
create table psiquiatra (
    id_psiquiatra int primary key auto_increment,
    nome varchar(50) not null,
    numero_conselho int not null,
    profissionalizacao varchar(40) not null,
    tipo_consulta varchar(30) not null,
    email varchar (40) not null,
    senha varchar (16) not null,
    cod_tel int not null,
    cod_endereco int not null,
    foreign key (cod_tel) references telefone_psiquiatra (cod_tel),
    foreign key (cod_endereco) references endereco_psiquiatra (cod_endereco)
);
/*Funcionario*/
create table funcionario (
    id_funcionario int primary key auto_increment,
    nome varchar (50) not null,
    email varchar (40) not null,
    senha varchar (16) not null
);
/*Login*/
/* Tabela Login */
create table login (
    id_paciente int null,
    id_psicologo int null,
    id_psiquiatra int null,
    id_funcionario int null,
    foreign key (id_paciente) references paciente (id_paciente),
    foreign key (id_psicologo) references psicologo (id_psicologo),
	foreign key (id_psiquiatra) references psiquiatra (id_psiquiatra),
    foreign key (id_funcionario) references funcionario (id_funcionario)
);

/*INSERT FUNCIONARIO*/
INSERT INTO funcionario (nome, email, senha) VALUES ('Jay Graber', 'Jay@mentelivre.br','jaymlb');

/*INSERT PACIENTE*/
INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Rua Alegria', 'Jardim das Flores', 'São Paulo', 'SP', 01234);

INSERT INTO telefone_paciente (celular)
VALUES ('11987654321');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('João Silva', 123456789, 'joao.silva@gmail.com', 'joao1234', 1, 1);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Rua Felicidade', 'Centro', 'Campinas', 'SP', 56789);

INSERT INTO telefone_paciente (celular)
VALUES ('11987654322');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Maria Santos', 109876543, 'maria.santos@icloud.com', 'maria5678', 2, 2);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Avenida Liberdade', 'Jardins', 'São Paulo', 'SP', 09876);

INSERT INTO telefone_paciente (celular)
VALUES ('11987654323');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Pedro Oliveira', 987654321, 'pedro.oliveira@outlook.com', 'pedro0987', 3, 3);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Rua Harmonia', 'Vila Madalena', 'São Paulo', 'SP', 98765);

INSERT INTO telefone_paciente (celular)
VALUES ('11987654324');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Ana Pereira', 765432109, 'ana.pereira@aol.com', 'ana9876', 4, 4);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Rua das Flores', 'Vila Nova', 'São Paulo', 'SP', 12345);

INSERT INTO telefone_paciente (celular)
VALUES ('11912345678');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Fernanda Oliveira', 987654321, 'fernanda.oliveira@gmail.com', 'fernanda123', 5, 5);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Avenida Paulista', 'Bela Vista', 'São Paulo', 'SP', 54321);

INSERT INTO telefone_paciente (celular)
VALUES ('11987651234');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Ricardo Almeida', 765432109, 'ricardo.almeida@outlook.com', 'ricardo987', 6, 6);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Rua dos Sonhos', 'Centro', 'Santos', 'SP', 98765);

INSERT INTO telefone_paciente (celular)
VALUES ('11954321987');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Mariana Costa', 109876543, 'mariana.costa@aol.com', 'mariana321', 7, 7);

INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep)
VALUES ('Avenida do Sol', 'Jardim América', 'São Paulo', 'SP', 56789);

INSERT INTO telefone_paciente (celular)
VALUES ('11923456789');

INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco)
VALUES ('Gabriel Santos', 234567890, 'gabriel.santos@gmail.com', 'gabriel890', 8, 8);

/*INSERT PSICOLOGO*/
INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Rua da Esperança', 'Centro', 'São Paulo', 'SP', 12345);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11987654321');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Carolina Silva', 123456, 'Psicologia Clínica', 'Presencial', 'carolina.silva@gmail.com', 'carolina123', 1, 1);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Avenida das Flores', 'Jardim Europa', 'São Paulo', 'SP', 54321);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11987651234');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Fernando Oliveira', 654321, 'Psicologia Organizacional', 'Online', 'fernando.oliveira@outlook.com', 'fernando987', 2, 2);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Rua das Palmeiras', 'Jardim Botânico', 'Campinas', 'SP', 98765);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11954321987');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Mariana Costa', 987654, 'Psicologia Escolar', 'Presencial', 'mariana.costa@aol.com', 'mariana321', 3, 3);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Avenida da Liberdade', 'Centro', 'São Paulo', 'SP', 56789);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11923456789');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Gabriel Santos', 876543, 'Psicologia Hospitalar', 'Presencial', 'gabriel.santos@gmail.com', 'gabriel890', 4, 4);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Rua das Flores', 'Vila Nova', 'São Paulo', 'SP', 12345);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11912345678');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Rafaela Lima', 345678, 'Psicologia Clínica', 'Presencial', 'rafaela.lima@gmail.com', 'rafaela123', 5, 5);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Avenida Paulista', 'Bela Vista', 'São Paulo', 'SP', 54321);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11987651234');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Gustavo Fernandes', 567890, 'Psicologia Organizacional', 'Online', 'gustavo.fernandes@outlook.com', 'gustavo987', 6, 6);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Rua dos Sonhos', 'Centro', 'Santos', 'SP', 98765);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11954321987');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Carla Souza', 789012, 'Psicologia Escolar', 'Presencial', 'carla.souza@aol.com', 'carla321', 7, 7);

INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep)
VALUES ('Avenida do Sol', 'Jardim América', 'São Paulo', 'SP', 56789);

INSERT INTO telefone_psicologo (comercial)
VALUES ('11923456789');

INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Ricardo Santos', 901234, 'Psicologia Hospitalar', 'Presencial', 'ricardo.santos@gmail.com', 'ricardo890', 8, 8);

/*INSERT PSIQUIATRA*/
INSERT INTO endereco_psiquiatra (rua, bairro, cidade, estado, cep)
VALUES ('Rua da Paz', 'Centro', 'São Paulo', 'SP', 12345);

INSERT INTO telefone_psiquiatra (comercial)
VALUES ('11987654321');

INSERT INTO psiquiatra (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Fernanda Oliveira', 123456, 'Psiquiatria Clínica', 'Presencial', 'fernanda.oliveira@gmail.com', 'fernanda123', 1, 1);

INSERT INTO endereco_psiquiatra (rua, bairro, cidade, estado, cep)
VALUES ('Avenida das Palmeiras', 'Jardim Europa', 'São Paulo', 'SP', 54321);

INSERT INTO telefone_psiquiatra (comercial)
VALUES ('11987651234');

INSERT INTO psiquiatra (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Roberto Santos', 654321, 'Psiquiatria Infantil', 'Online', 'roberto.santos@outlook.com', 'roberto987', 2, 2);

INSERT INTO endereco_psiquiatra (rua, bairro, cidade, estado, cep)
VALUES ('Rua das Violetas', 'Jardim Botânico', 'Campinas', 'SP', 98765);

INSERT INTO telefone_psiquiatra (comercial)
VALUES ('11954321987');

INSERT INTO psiquiatra (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Márcia Costa', 987654, 'Psiquiatria Geriátrica', 'Presencial', 'marcia.costa@aol.com', 'marcia321', 3, 3);

INSERT INTO endereco_psiquiatra (rua, bairro, cidade, estado, cep)
VALUES ('Avenida da Liberdade', 'Centro', 'São Paulo', 'SP', 56789);

INSERT INTO telefone_psiquiatra (comercial)
VALUES ('11923456789');

INSERT INTO psiquiatra (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco)
VALUES ('Gabriel Oliveira', 876543, 'Psiquiatria Forense', 'Presencial', 'gabriel.oliveira@gmail.com', 'gabriel890', 4, 4);

/*SELECTS*/
SELECT * FROM telefone_paciente ORDER BY cod_tel DESC LIMIT 1;
SELECT * FROM endereco_paciente ORDER BY cod_endereco DESC LIMIT 1;

SELECT paciente.*, telefone_paciente.celular, endereco_paciente.rua, endereco_paciente.bairro, endereco_paciente.cidade, endereco_paciente.estado, endereco_paciente.cep
FROM paciente
INNER JOIN telefone_paciente ON paciente.cod_tel = telefone_paciente.cod_tel
INNER JOIN endereco_paciente ON paciente.cod_endereco = endereco_paciente.cod_endereco;

SELECT *
FROM psicologo
INNER JOIN telefone_psicologo ON psicologo.cod_tel = telefone_psicologo.cod_tel
INNER JOIN endereco_psicologo ON psicologo.cod_endereco = endereco_psicologo.cod_endereco;

SELECT *
FROM psiquiatra
INNER JOIN telefone_psiquiatra ON psiquiatra.cod_tel = telefone_psiquiatra.cod_tel
INNER JOIN endereco_psiquiatra ON psiquiatra.cod_endereco = endereco_psiquiatra.cod_endereco;

SELECT nome, profissionalizacao, tipo_consulta, telefone_psiquiatra.comercial, CONCAT(endereco_psiquiatra.rua, ', ', endereco_psiquiatra.bairro, ', ', endereco_psiquiatra.estado) AS endereco_completo
FROM psiquiatra
INNER JOIN telefone_psiquiatra ON psiquiatra.cod_tel = telefone_psiquiatra.cod_tel
INNER JOIN endereco_psiquiatra ON psiquiatra.cod_endereco = endereco_psiquiatra.cod_endereco;

SELECT paciente.nome, paciente.email, paciente.cpf, telefone_paciente.celular, CONCAT(endereco_paciente.rua, ', ', endereco_paciente.bairro, ', ', endereco_paciente.cidade, ', ', endereco_paciente.estado, ', ', endereco_paciente.cep) AS endereco_completo
FROM paciente
INNER JOIN telefone_paciente ON paciente.cod_tel = telefone_paciente.cod_tel
INNER JOIN endereco_paciente ON paciente.cod_endereco = endereco_paciente.cod_endereco;