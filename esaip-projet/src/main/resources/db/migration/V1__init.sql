/* Schema creation */

CREATE TABLE BOITEAIDEE(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    NOM VARCHAR(255)
);

CREATE TABLE IDEE(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    TITRE VARCHAR(255),
    AUTEUR VARCHAR(255),
    CONTENU VARCHAR(255)
    
);

/* Data insertion */

INSERT INTO BOITEAIDEE(ID, NOM) VALUES(1, 'BAI');
