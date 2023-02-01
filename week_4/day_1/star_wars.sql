DROP TABLE lightsabers;
DROP TABLE characters;

CREATE TABLE characters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    darkside BOOLEAN,
    age INT
);

CREATE TABLE lightsabers (
    id SERIAL PRIMARY KEY,
    hilt_metal VARCHAR(255) NOT NULL,
    colour VARCHAR(255) NOT NULL,
    character_id INT REFERENCES characters(id)
);

INSERT INTO characters (name, darkside, age) VALUES ('Obi-Wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);
INSERT INTO characters (name, darkside) VALUES ('Yoda', false);
INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);

INSERT INTO lightsabers (colour, character_id hilt_metal) VALUES ('green', 2, 'palladium');
INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('red', 1,  'gold');
INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('purple',);

-- UPDATE lightsabers SET ID = 1;

SELECT * FROM lightsabers;
-- SELECT * FROM characters;

-- SELECT COUNT(*) FROM characters;
-- SELECT SUM(age) FROM characters;
-- SELECT MAX(age) FROM characters;

UPDATE characters SET darkside = true WHERE name = 'Anakin Skywalker';
UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name ='Yoda';
UPDATE characters SET age = 65 WHERE name = 'Obi-Wan Kenobi';

DELETE FROM characters WHERE name = 'Darth Maul';
INSERT INTO characters (name, darkside, age) VALUES('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES('Stormtrooper', true, 25);

-- SELECT * FROM characters ORDER BY id;