DELETE
FROM DOGS;

DELETE
FROM CATS;

INSERT INTO DOGS (dogid, dogname)
        VALUES (1, 'DOTTIE'),
               (2, 'GINGER'),
               (3, 'MOJO');

INSERT INTO CATS (catid, catname)
        VALUES (1, 'Tiger');

alter sequence hibernate_sequence restart with 15;
