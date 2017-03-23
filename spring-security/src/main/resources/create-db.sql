drop table if exists User;
drop table if exists Authority;

create table if not exists Authority (
    name varchar(50) PRIMARY KEY
);

create table if not exists User (
    login varchar(50) PRIMARY KEY,
    password varchar(100) not null,
    name varchar(50) not null,
    phone varchar(50),
    authority varchar(50) not null,
    constraint fk_authority foreign key(authority) references Authority(name) on delete cascade on update cascade
);