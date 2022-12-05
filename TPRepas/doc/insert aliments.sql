USE repas_db;
GO

BEGIN TRAN

INSERT 
	INTO aliments (nomAliment,idRepas)
	VALUES ('Carotte',3);

INSERT 
	INTO aliments (nomAliment,idRepas)
	VALUES ('Viande',3);

INSERT 
	INTO aliments (nomAliment,idRepas)
	VALUES ('Riz',3);

INSERT 
	INTO aliments (nomAliment,idRepas)
	VALUES ('Pate',4);

ROLLBACK TRAN