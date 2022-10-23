create table if not exists products (id bigserial primary key, title varchar(255), price int);

insert into products (title, price)
values
('Тыква', 100),
('Лимон', 80),
('Арбуз', 90),
('Апельсин', 100),
('Лук', 80),
('Картошка', 90),
('Свекла', 65),
('Огурец', 34),
('Помидор', 120);