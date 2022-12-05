USE repas_db;
GO

BEGIN TRAN

INSERT 
	INTO repas (dateRepas,heureRepas) 
	VALUES ('12/12/2022','12:22');

INSERT 
	INTO repas (dateRepas,heureRepas) 
	VALUES ('12/11/2022','10:22');

COMMIT TRAN