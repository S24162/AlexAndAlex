USE alexandalex;
DROP TABLE IF EXISTS kitchen_measurements, materials, colors, mechanisms;

-- materiały
CREATE TABLE materials (
		id BIGINT AUTO_INCREMENT PRIMARY KEY,
		name VARCHAR(100) NOT NULL,
		price_per_m2 DOUBLE NOT NULL
);

-- kolory
CREATE TABLE colors (
		id BIGINT AUTO_INCREMENT PRIMARY KEY,
		name VARCHAR(100) NOT NULL,
		extra_cost DOUBLE NOT NULL
);

-- mechanizmy
CREATE TABLE mechanisms (
		id BIGINT AUTO_INCREMENT PRIMARY KEY,
		name VARCHAR(100) NOT NULL,
		price_per_unit DOUBLE NOT NULL
);

-- pomiary kuchni
CREATE TABLE kitchen_measurements (
		id BIGINT AUTO_INCREMENT PRIMARY KEY,

		a1_length DOUBLE NOT NULL,
		b1_length DOUBLE NOT NULL,
		c1_length DOUBLE NOT NULL,

		a2_height DOUBLE NOT NULL,
		b2_height DOUBLE NOT NULL,
		c2_height DOUBLE NOT NULL,

		a3_depth DOUBLE NOT NULL,
		b3_depth DOUBLE NOT NULL,
		c3_depth DOUBLE NOT NULL,

		material_id BIGINT NOT NULL,
		color_id BIGINT NOT NULL,
		mechanism_id BIGINT NOT NULL,

		price DOUBLE NOT NULL,

		FOREIGN KEY (material_id) REFERENCES materials(id),
		FOREIGN KEY (color_id) REFERENCES colors(id),
		FOREIGN KEY (mechanism_id) REFERENCES mechanisms(id)
);