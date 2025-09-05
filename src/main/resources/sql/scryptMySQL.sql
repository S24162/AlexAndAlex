USE alexandalex;

DROP TABLE IF EXISTS kitchen_measurements;
DROP TABLE IF EXISTS materials;
DROP TABLE IF EXISTS colors;
DROP TABLE IF EXISTS mechanisms;


CREATE TABLE materials
		(id           BIGINT AUTO_INCREMENT PRIMARY KEY,
		 code         VARCHAR(50)    NOT NULL, -- identyfikator do frontend
		 name         VARCHAR(100)   NOT NULL, -- wyświetlana nazwa
		 price_per_m2 DECIMAL(10, 2) NOT NULL);


CREATE TABLE colors
		(id         BIGINT AUTO_INCREMENT PRIMARY KEY,
		 code       VARCHAR(50)    NOT NULL, -- identyfikator do frontend
		 name       VARCHAR(100)   NOT NULL, -- wyświetlana nazwa
		 extra_cost DECIMAL(10, 2) NOT NULL);


CREATE TABLE mechanisms
		(id             BIGINT AUTO_INCREMENT PRIMARY KEY,
		 code           VARCHAR(50)    NOT NULL, -- identyfikator do frontend
		 name           VARCHAR(100)   NOT NULL, -- wyświetlana nazwa
		 price_per_unit DECIMAL(10, 2) NOT NULL);


CREATE TABLE kitchen_measurements
		(id           BIGINT AUTO_INCREMENT PRIMARY KEY,

		 a1_length    DOUBLE         NOT NULL,
		 b1_length    DOUBLE         NOT NULL,
		 c1_length    DOUBLE         NOT NULL,

		 a2_height    DOUBLE         NOT NULL,
		 b2_height    DOUBLE         NOT NULL,
		 c2_height    DOUBLE         NOT NULL,

		 a3_depth     DOUBLE         NOT NULL,
		 b3_depth     DOUBLE         NOT NULL,
		 c3_depth     DOUBLE         NOT NULL,

		 material_id  BIGINT         NOT NULL,
		 color_id     BIGINT         NOT NULL,
		 mechanism_id BIGINT         NOT NULL,

		 price        DECIMAL(10, 2) NOT NULL,

		 FOREIGN KEY (material_id) REFERENCES materials (id),
		 FOREIGN KEY (color_id) REFERENCES colors (id),
		 FOREIGN KEY (mechanism_id) REFERENCES mechanisms (id));


INSERT INTO materials (code, name, price_per_m2)
VALUES ('laminated_board', 'Płyta laminowana', 120.00),
		 ('varnished_mdf', 'MDF lakierowany', 200.00);


INSERT INTO colors (code, name, extra_cost)
VALUES ('white_matt', 'Biały mat', 0.00),
		 ('black_gloss', 'Czarny połysk', 50.00);


INSERT INTO mechanisms (code, name, price_per_unit)
VALUES ('box_blum', 'Szuflada BLUM', 150.00),
		 ('silent_closing_system', 'System cichy domyk', 250.00);
