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

INSERT INTO tb_cliente (nome, CPF_OU_CNPJ, habilitacao, email, tipocliente ) VALUES ('Maria Silva', '99999999999', '123456789', 'maria@email.com.br', '1');

INSERT INTO tb_telefone (cliente_id, telefones) VALUES ('1','98155-9030');
INSERT INTO tb_telefone (cliente_id, telefones) VALUES ('1','98158-3030');

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade_id, cliente_id) VALUES ('Av. Almirante Barroso', '100', 'Apto 101', 'Centro', '66000-000', '1', '1');
INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade_id, cliente_id) VALUES ('Av. Castro Silva', '150', 'Apto 01', 'Distrito', '66000-250', '2', '1');



