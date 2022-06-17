USE adlister_db;

# DROP TABLE users;
# DROP TABLE ads;

CREATE TABLE IF NOT EXISTS users (
             id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
             username VARCHAR(30) NOT NULL,
             email VARCHAR(100) NOT NULL,
             password VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS ads (
           id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
           user_id INT UNSIGNED NOT NULL,
           title VARCHAR(30),
           description TEXT,
           FOREIGN KEY (user_id) REFERENCES users (id)
);

DESCRIBE users;
DESCRIBE ads;
INSERT INTO users (username, email, password)
VALUES ("user", "user@email.com", "user123");
#
INSERT INTO ads (user_id, title, description)
VALUES (1, 'Frog Legs', 'Read comment');
INSERT INTO ads (user_id, title, description)
VALUES (2, 'title 2', 'description 2');
INSERT INTO ads (user_id, title, description)
VALUES (3, 'title 3', 'description 3');