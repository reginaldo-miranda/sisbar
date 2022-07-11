USE sisbar;


CREATE table vendaItens(
   id INT not null PRIMARY KEY AUTO_INCREMENT,
   quantidade Double,
   valorUnitario Double,
   valorTotal Double
)
/*
CREATE table venda(
 id INT not null PRIMARY KEY AUTO_INCREMENT,
 data date,
 valorTotal Double,
 parcelas Integer
 
)
/*



CREATE table pdv(
    id_pdv INT not null PRIMARY KEY AUTO_INCREMENT,
    nomeCliente varchar(100),
    total_pdv double,
    data datetime
    
)



CREATE table grupo(
  id_grupo INT not null PRIMARY KEY AUTO_INCREMENT,
  descricao varchar(100),
  desconto DOUBLE
 
 
)




CREATE table clientes
(  
  id_clientes INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(80) NOT NULL,
  fone VARCHAR(40)
)


CREATE table produtos(
  id_produtos INT not null PRIMARY KEY AUTO_INCREMENT,
  descricao varchar(100),
  unid_medida varchar(20),
  grupo VARCHAR(30), 
  preco_venda DOUBLE,
  qde DOUBLE
 
)


CREATE table pdv(
    id_pdv INT not null PRIMARY KEY AUTO_INCREMENT,
    nomeCliente varchar(100),
    total_pdv double,
    data datetime
    
)
/*
CREATE table pdvItens(
  id_pdvItens INT not null PRIMARY KEY AUTO_INCREMENT,
  id_cliente varchar(100),
  id_produtos int,
  qde int,
  preco_venda double,
  precoTotal double,
  data datetime
)
*/
