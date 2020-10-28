-- INSERTS CLIENTE --
INSERT INTO cliente VALUES (1, 'Mari', '48765325987', 'endereço de caete', 45);
INSERT INTO cliente VALUES (2, 'Gui', '59874562358', 'endereco de betim', 10);
INSERT INTO cliente VALUES (3, 'Mel', '87456981253', 'endereco de bh', 22);

-- INSERTS TIPO_PET --
INSERT INTO tipo_pet VALUES (1, 'Cachorro');
INSERT INTO tipo_pet VALUES (2, 'Gato');
INSERT INTO tipo_pet VALUES (3, 'Coelho');
INSERT INTO tipo_pet VALUES (4, 'Ave');
INSERT INTO tipo_pet VALUES (5, 'Peixe');

-- INSERTS RACA --
INSERT INTO raca VALUES (1, 'Lhasa Apso', 1);
INSERT INTO raca VALUES (2, 'Beagle', 1 );
INSERT INTO raca VALUES (3, 'Shnauzer', 1);
INSERT INTO raca VALUES (4, 'Persa', 2);
INSERT INTO raca VALUES (5, 'Siamês', 2);
INSERT INTO raca VALUES (6, 'Sphynx', 2);
INSERT INTO raca VALUES (7, 'Angorá', 3);
INSERT INTO raca VALUES (8, 'Leão', 3);
INSERT INTO raca VALUES (9,  'Mini', 3);
INSERT INTO raca VALUES (10, 'Arara', 4);
INSERT INTO raca VALUES (11, 'Calopsita', 4);
INSERT INTO raca VALUES (12, 'Papagaio', 4);
INSERT INTO raca VALUES (13, 'Beta', 5);
INSERT INTO raca VALUES (14, 'Dourado', 5);
INSERT INTO raca VALUES (15, 'Pirarucu', 5);

-- INSERTS FABRICANTE --
INSERT INTO fabricante VALUES (1, 'Fabricante 1');
INSERT INTO fabricante VALUES (2, 'Fabricante 2');
INSERT INTO fabricante VALUES (3, 'Fabricante 3');
INSERT INTO fabricante VALUES (4, 'Fabricante 4');

-- INSERTS PRODUTO --
INSERT INTO produto VALUES (1, 'Shampoo para cachorros de pelo longo', 'Shampoo', true, 50.0, 10, 1);
INSERT INTO produto VALUES (2, 'Ração para cães de porte pequeno', 'Ração para cães', true, 30.5, 20, 2);
INSERT INTO produto VALUES (3, 'Coleira para gato tamanho médio', 'Coleira M', true, 15.0, 5, 3);
INSERT INTO produto VALUES (4,  'Fucinheira para cães tamanho pequeno', 'Fucinheira P', true, 20.0, 15, 4);

-- INSERTS SERVICO --
INSERT INTO servico VALUES (1, true, null, 1, 'Banho', 10, 25.0);
INSERT INTO servico VALUES (2, true, null, 1, 'Banho e tosa', 20, 35.0);

-- INSERTS FUNCIONARIO --
INSERT INTO funcionario VALUES (1, '58946523658', 'João', 568);
INSERT INTO funcionario VALUES (2, '23598745698', 'Maria', 845);


