create table product (
    product_id          serial primary key NOT NULL,
    product_name        VARCHAR(50),
    product_stock       INT,
    product_price       DECIMAL(10,5)
);

create table payment (
    payment_id          serial primary key NOT NULL,
    payment_cnumber     varchar(16),
    payment_cname       varchar(40),
    payment_edate       varchar(20),
    payment_scode       char(3)
);

create table certificate (
    certificate_id      serial primary key NOT NULL,
    certificate_name    varchar(80),
    certificate_type    varchar(60),
    certificate_title   varchar(100),
    certificate_date    varchar(10),
    certificate_exp     varchar(10)
);