SET search_path TO alex_schema;

DROP TABLE IF EXISTS kitchen_measurements;
DROP TABLE IF EXISTS materials;
DROP TABLE IF EXISTS colors;
DROP TABLE IF EXISTS mechanisms;

CREATE TABLE materials (
		id BIGSERIAL PRIMARY KEY,
		code VARCHAR(50) NOT NULL,
		name VARCHAR(100) NOT NULL,
		price_per_m2 NUMERIC(10, 2) NOT NULL
);

CREATE TABLE colors (
		id BIGSERIAL PRIMARY KEY,
		code VARCHAR(50) NOT NULL,
		name VARCHAR(100) NOT NULL,
		extra_cost NUMERIC(10, 2) NOT NULL
);

CREATE TABLE mechanisms (
		id BIGSERIAL PRIMARY KEY,
		code VARCHAR(50) NOT NULL,
		name VARCHAR(100) NOT NULL,
		price_per_unit NUMERIC(10, 2) NOT NULL
);

CREATE TABLE kitchen_measurements (
		id BIGSERIAL PRIMARY KEY,

		a1_length DOUBLE PRECISION NOT NULL,
		b1_length DOUBLE PRECISION NOT NULL,
		c1_length DOUBLE PRECISION NOT NULL,

		a2_height DOUBLE PRECISION NOT NULL,
		b2_height DOUBLE PRECISION NOT NULL,
		c2_height DOUBLE PRECISION NOT NULL,

		a3_depth DOUBLE PRECISION NOT NULL,
		b3_depth DOUBLE PRECISION NOT NULL,
		c3_depth DOUBLE PRECISION NOT NULL,

		material_id BIGINT NOT NULL,
		color_id BIGINT NOT NULL,
		mechanism_id BIGINT NOT NULL,

		price NUMERIC(10, 2) NOT NULL,

		FOREIGN KEY (material_id) REFERENCES materials (id),
		FOREIGN KEY (color_id) REFERENCES colors (id),
		FOREIGN KEY (mechanism_id) REFERENCES mechanisms (id)
);

-- Dane startowe
INSERT INTO materials (code, name, price_per_m2) VALUES
																		 ('laminated_board', 'Płyta laminowana', 120.00),
																		 ('varnished_mdf', 'MDF lakierowany', 200.00);

INSERT INTO colors (code, name, extra_cost) VALUES
																  ('white_matt', 'Biały mat', 0.00),
																  ('black_gloss', 'Czarny połysk', 50.00);

INSERT INTO mechanisms (code, name, price_per_unit) VALUES
																			 ('box_blum', 'Szuflada BLUM', 150.00),
																			 ('silent_closing_system', 'System cichy domyk', 250.00);