/* POPULATE TABLA ZONAS */
INSERT INTO tont_zonas (cdzona, dsnombre) VALUES('100', 'Templado');
INSERT INTO tont_zonas (cdzona, dsnombre) VALUES('101', 'Calido');
INSERT INTO tont_zonas (cdzona, dsnombre) VALUES('102', 'Frio');


/* POPULATE TABLA PAISES */
INSERT INTO tont_paises (cdpais, dsnombre, cdzona) VALUES('200', 'Colombia', '100');
INSERT INTO tont_paises (cdpais, dsnombre, cdzona) VALUES('201', 'Venezuela', '102');


/* POPULATE TABLA AVES */
INSERT INTO tont_aves (cdave, dsnombre_comun, dsnombre_cientifico) VALUES('1', 'Lora', 'Poicephalus');
INSERT INTO tont_aves (cdave, dsnombre_comun, dsnombre_cientifico) VALUES('2', 'Canario', 'Fringillidae');


/* POPULATE TABLA AVES PAIS */
INSERT INTO tont_aves_pais (cdpais, cdave) VALUES('200','1');
INSERT INTO tont_aves_pais (cdpais, cdave) VALUES('200','2');
INSERT INTO tont_aves_pais (cdpais, cdave) VALUES('201','1');
