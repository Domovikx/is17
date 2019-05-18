DROP DATABASE IF EXISTS online_shope;

CREATE DATABASE IF NOT EXISTS online_shope DEFAULT CHARACTER SET utf8;

USE online_shope;

/*Таблица поставщиков*/
/*DROP TABLE IF EXISTS  supplier;*/
CREATE TABLE  IF NOT EXISTS supplier (
id INT NOT NULL AUTO_INCREMENT,
supplier VARCHAR (30) NOT NULL,
address VARCHAR (100) NOT NULL,
phone VARCHAR (20) UNIQUE,
PRIMARY KEY (id));

/*Таблица товаров*/
/*DROP TABLE IF EXISTS product;*/
CREATE TABLE  IF NOT EXISTS product (
id INT NOT NULL AUTO_INCREMENT,
product_name VARCHAR (250) NOT NULL,
messure VARCHAR (10) NOT NULL,
price DECIMAL (15, 2) NOT NULL,
PRIMARY KEY (id));

/*Таблица поставки*/
/*DROP TABLE IF EXISTS supply;*/
CREATE TABLE  IF NOT EXISTS supply (
id INT NOT NULL AUTO_INCREMENT,
supplier_id INT NOT NULL,
data_supply TIMESTAMP NOT NULL,
amount DECIMAL (15, 2) NOT NULL,
PRIMARY KEY (id),
CONSTRAINT fk_supply_supplier
    FOREIGN KEY (supplier_id)
    REFERENCES supplier (id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);
    
    CREATE TABLE  IF NOT EXISTS supply_details (
    supply_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT DEFAULT 0,
    PRIMARY KEY (supply_id, product_id),
    CONSTRAINT fk_supply_details_supply
		FOREIGN KEY (supply_id)
		REFERENCES supply (id)
		ON DELETE RESTRICT
		ON UPDATE RESTRICT,
    CONSTRAINT fk_supply_details_product
		FOREIGN KEY (product_id)
		REFERENCES product(id)
		ON DELETE RESTRICT
		ON UPDATE RESTRICT);
    
/*Таблица заказов*/
/*DROP TABLE IF EXISTS orders;*/
CREATE TABLE  IF NOT EXISTS orders (
id INT NOT NULL AUTO_INCREMENT,
data_sold TIMESTAMP NOT NULL,
product_id INT NOT NULL,
quantity INT UNSIGNED DEFAULT 0,
PRIMARY KEY (id),
CONSTRAINT fk_orders_product
    FOREIGN KEY (product_id)
    REFERENCES product (id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);
    
INSERT INTO supplier (supplier, address, phone)    
VALUES 
('OOO Рога и копыта', 'Витебск', '+375(29)123-45-67');

INSERT INTO product (product_name, messure, price)    
VALUES 
('шкаф', 'шт', 150.00),
('молоко', 'л', 1.25),
('обои', 'м', 10.01);

INSERT INTO supply (supplier_id, product_id, data_supply, quantity)    
VALUES 
(1, 1, '2019-04-15 12:10:00', 15),
(1, 2, '2019-04-16 12:10:00', 100);

INSERT INTO orders (product_id, data_sold, quantity)    
VALUES 
(1, '2019-04-18 12:10:00', 2),
(2, '2019-04-16 12:10:00', 1);

