USE bar;
/*
CREATE table clientes
(  
  id_clientes INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(80) NOT NULL,
  fone VARCHAR(40)
);
*/

CREATE table produtos(
  id_produtos INT not null PRIMARY KEY AUTO_INCREMENT,
  descricao varchar(100),
  unid_medida varchar(20),
  grupo VARCHAR(30), 
  preco_venda DOUBLE,
  qde DOUBLE
 
)
