create table product (
    product_id          serial primary key NOT NULL,
    product_name        VARCHAR(50),
    product_stock       INT,
    product_price       DECIMAL(10,5)
);

create table payment (
    payment_id          serial primary key NOT NULL
);