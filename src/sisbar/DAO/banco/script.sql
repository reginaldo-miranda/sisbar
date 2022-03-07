USE bar;
CREATE table clientes
(  
  id_clientes INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(80) NOT NULL,
  fone VARCHAR(40)
);



CREATE table produtos
(
  id-produtos INT PRIMARY KEY AUTO_INCREMENT,
  descricao VARCHAR(100),
  unid_medida VARCHAR(20),
  preco_venda DOUBLE,
  qde DOUBLE,
  grupo VARCHAR(30) 
);
