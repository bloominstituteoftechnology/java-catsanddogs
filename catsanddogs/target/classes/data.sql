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

/*
We must tell hibernate the ids that have already been used.
The number must be larger than the last used id.
15 > 3 so we are good!
 */

alter sequence hibernate_sequence restart with 15;
