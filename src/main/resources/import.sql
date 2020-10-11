INSERT INTO users (name, lastname, username, email, password, enabled) VALUES('william', 'rehel','admin', 'william.rehel@gmail.com', '$2a$10$DOMDxjYyfZ/e7RcBfUpzqeaCs8pLgcizuiQWXPkU35nOhZlFcE9MS', 1);

INSERT INTO authorities (user_id, authority) VALUES(1, 'ROLE_ADMIN');
