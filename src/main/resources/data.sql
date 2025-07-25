-- CREATE DATABASE digital_market;

use digital_market;

CREATE TABLE app_users (
	id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    date_created DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE business (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    department VARCHAR(255)
);

CREATE TABLE product (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250),
    description VARCHAR(255),
    price DECIMAL,
    business_id int,
    FOREIGN KEY(business_id) REFERENCES business(id)
);

CREATE TABLE market (
	id INT AUTO_INCREMENT PRIMARY KEY,
    business_id INT,
    FOREIGN KEY(business_id) REFERENCES business(id)
);


