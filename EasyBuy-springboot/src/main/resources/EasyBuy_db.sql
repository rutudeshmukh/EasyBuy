-- This file is for demodb opertions


--fields are changed now..test accordingly


-- Create database if not exists
CREATE DATABASE IF NOT EXISTS `EasyBuy_SP`;

-- Use the database
USE `EasyBuy_SP`;

-- Table: users
CREATE TABLE `users` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL
);

-- Table: categories
CREATE TABLE `categories` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL
);

-- Table: products
CREATE TABLE `products` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `price` DOUBLE NOT NULL,
    `category_id` BIGINT,
    FOREIGN KEY (`category_id`) REFERENCES `categories`(`id`)
);

-- Table: carts
CREATE TABLE `carts` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `user_id` BIGINT,
    FOREIGN KEY (`user_id`) REFERENCES `users`(`id`)
);

-- Table: cart_products
CREATE TABLE `cart_products` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `cart_id` BIGINT,
    `product_id` BIGINT,
    `quantity` INT NOT NULL,
    FOREIGN KEY (`cart_id`) REFERENCES `carts`(`id`),
    FOREIGN KEY (`product_id`) REFERENCES `products`(`id`)
);

-- Sample data insertion for `categories`
INSERT INTO `categories` (`name`) VALUES 
    ('Electronics'),
    ('Clothing'),
    ('Books');

-- Sample data insertion for `products`
INSERT INTO `products` (`name`, `price`, `category_id`) VALUES 
    ('Laptop', 1200.00, 1),
    ('T-Shirt', 25.99, 2),
    ('Java Programming Book', 45.50, 3),
    ('Smartphone', 800.00, 1),
    ('Jeans', 39.95, 2);

-- Sample data insertion for `users`
INSERT INTO `users` (`username`, `email`) VALUES 
    ('john_doe', 'john.doe@example.com'),
    ('jane_smith', 'jane.smith@example.com');

-- Sample data insertion for `carts`
INSERT INTO `carts` (`user_id`) VALUES 
    (1), -- John Doe's cart
    (2); -- Jane Smith's cart

-- Sample data insertion for `cart_products`
INSERT INTO `cart_products` (`cart_id`, `product_id`, `quantity`) VALUES 
    (1, 1, 1), -- John Doe adds 1 Laptop to his cart
    (1, 4, 2), -- John Doe adds 2 Smartphones to his cart
    (2, 2, 3), -- Jane Smith adds 3 T-Shirts to her cart
    (2, 5, 1); -- Jane Smith adds 1 Jeans to her cart

select * from users;
select * from categories;
select * from products;
select * from carts;
select * from cart_products;