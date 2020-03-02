create table cliente (
	id int not null auto_increment,
	nome varchar(100) not null,
	cpf varchar(11) not null,
	data_cadastro datetime default now(),
constraint pk_cliente primary key(id),
constraint uk_cpf unique(cpf)
)

insert into poc_avro.cliente (nome, cpf) values ('Cliente de Testes', '01234567890');