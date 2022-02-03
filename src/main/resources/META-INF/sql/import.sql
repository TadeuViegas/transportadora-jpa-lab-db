INSERT INTO cliente(endereco, telefone, nome) VALUES ('Rua A', '+55 98 000000000', 'Astrogildo Luanova');
INSERT INTO cliente(endereco, telefone, nome) VALUES ('Rua B', '+55 98 111111111', 'Alcantra martiano');

INSERT INTO cidade(uf, taxa, nome) VALUES ('MA', 9.9, 'São Luís');
INSERT INTO cidade(uf, taxa, nome) VALUES ('MA', 13.9, 'São Jose de Ribamar');
INSERT INTO cidade(uf, taxa, nome) VALUES ('MA', 12.9, 'Raposa');


INSERT INTO frete(codigo_cidade, codigo_cliente, valor, peso, descricao) VALUES  (1, 1, 23.99, 1.30, 'Alguma descrição 1');
INSERT INTO frete(codigo_cidade, codigo_cliente, valor, peso, descricao) VALUES  (1, 2, 19.99, 1.50, 'Alguma descrição 2');
INSERT INTO frete(codigo_cidade, codigo_cliente, valor, peso, descricao) VALUES  (1, 2, 30.99, 0.50, 'Alguma descrição 3');

