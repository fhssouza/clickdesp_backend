INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Fabio', 'Brown', 'fabio@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Marcelo', 'Green', 'marcelo@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_categoria (nome) VALUES ('HABILITAÇÃO');
INSERT INTO tb_categoria (nome) VALUES ('VEICULOS');
INSERT INTO tb_categoria (nome) VALUES ('OUTROS');

INSERT INTO tb_servico (descricao) VALUES ('TRANSFERÊNCIA DE PROPRIEDADE');
INSERT INTO tb_servico (descricao) VALUES ('LICENCIAMENTO');
INSERT INTO tb_servico (descricao) VALUES ('MUDANÇA DE CARACTERÍSTICA');
INSERT INTO tb_servico (descricao) VALUES ('HABILITAÇÃO');

INSERT INTO tb_servico_categoria (servico_id, categoria_id) VALUES (1, 2);
INSERT INTO tb_servico_categoria (servico_id, categoria_id) VALUES (2, 2);
INSERT INTO tb_servico_categoria (servico_id, categoria_id) VALUES (3, 2);
INSERT INTO tb_servico_categoria (servico_id, categoria_id) VALUES (4, 1);

INSERT INTO tb_estado (nome) VALUES ('Pará');
INSERT INTO tb_estado (nome) VALUES ('Amazonas');

INSERT INTO tb_cidade (nome, estado_id) VALUES ('Belém', 1);
INSERT INTO tb_cidade (nome, estado_id) VALUES ('Manaus', 2);

INSERT INTO tb_cliente (nome, CPF_OU_CNPJ, habilitacao, email, tipocliente ) VALUES ('Maria Silva', '257.953.580-29', '84263744746', 'maria@email.com.br', '1');
INSERT INTO tb_cliente (nome, CPF_OU_CNPJ, habilitacao, email, tipocliente ) VALUES ('Deyvid Andrade', '44.838.371/0001-12', '85591845514', 'deyvid@email.com.br', '2');

INSERT INTO tb_telefone (cliente_id, telefones) VALUES ('1','98155-9030');
INSERT INTO tb_telefone (cliente_id, telefones) VALUES ('1','98158-3030');
INSERT INTO tb_telefone (cliente_id, telefones) VALUES ('2','98178-9090');
INSERT INTO tb_telefone (cliente_id, telefones) VALUES ('2','98558-2020');

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade_id, cliente_id) VALUES ('Av. Almirante Barroso', '100', 'Apto 101', 'Centro', '66000-000', '1', '1');
INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade_id, cliente_id) VALUES ('Av. Castro Silva', '150', 'Apto 01', 'Distrito', '66000-250', '2', '1');
INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade_id, cliente_id) VALUES ('Av. Julio Cezar', '300', 'Sem Complemento', 'Maracangalha', '66000-000', '1', '2');
INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade_id, cliente_id) VALUES ('Av. Fernando Silva', '800', 'Apto 100', 'Centro', '66000-251', '1', '2');

INSERT INTO tb_tiposervico (descricao) values ('Transferência');

INSERT INTO tb_veiculo (placa, marca, modelo, chassi, renavam, cor, combustivel, ano, arrendamento, procedencia, alienacao_fiduciaria, crv, crv_data, cliente_id) VALUES ('JVC5857', 'Honda', 'Fit DX 1.4 Flex 16V 5p Aut.', '123456', '81065431584', 'Azul', '3', '2011', 'FALSE', '1', 'FALSE', '123456', '2011-12-03', 1);

INSERT INTO tb_ordemservico (instante, status, observacao, tipo_servico_id, cliente_id, veiculo_id) VALUES ('2023-03-26', '1', 'Teste', '1', '1', '1');





