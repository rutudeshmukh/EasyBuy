Create database easybuy;
use easybuy;
CREATE TABLE Products (
    ID int NOT NULL,
    name varchar(255) NOT NULL,
    price double,
    quantity int,
    PRIMARY KEY (ID)
);
select * from Products;