#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Etat
#------------------------------------------------------------

CREATE TABLE Etat(
        id      Int  Auto_increment  NOT NULL ,
        libelle Varchar (50) NOT NULL
	,CONSTRAINT Etat_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Catégorie
#------------------------------------------------------------

CREATE TABLE Categorie(
        id      Int  Auto_increment  NOT NULL ,
        libelle Varchar (50) NOT NULL
	,CONSTRAINT Categorie_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: TypeUtilisateur
#------------------------------------------------------------

CREATE TABLE TypeUtilisateur(
        id      Int  Auto_increment  NOT NULL ,
        libelle Varchar (50) NOT NULL
	,CONSTRAINT TypeUtilisateur_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Utilisateur
#------------------------------------------------------------

CREATE TABLE Utilisateur(
        Mail      Varchar (50) NOT NULL ,
        Telephone Varchar (50) NOT NULL ,
        Nom       Varchar (50) NOT NULL ,
        Prenom    Varchar (50) NOT NULL ,
        id        Int NOT NULL
	,CONSTRAINT Utilisateur_PK PRIMARY KEY (Mail)

	,CONSTRAINT Utilisateur_TypeUtilisateur_FK FOREIGN KEY (id) REFERENCES TypeUtilisateur(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: TypeAnnonce
#------------------------------------------------------------

CREATE TABLE TypeAnnonce(
        id      Int  Auto_increment  NOT NULL ,
        libelle Varchar (50) NOT NULL
	,CONSTRAINT TypeAnnonce_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Annonce
#------------------------------------------------------------

CREATE TABLE Annonce(
        id             Int  Auto_increment  NOT NULL ,
        titre          Varchar (50) NOT NULL ,
        description    Varchar (50) NOT NULL ,
        prix           Float NOT NULL ,
        ville          Varchar (50) NOT NULL ,
        dateCreation   Datetime NOT NULL ,
        dateUpdate     Datetime NOT NULL ,
        Mail           Varchar (50) NOT NULL ,
        id_TypeAnnonce Int NOT NULL ,
        id_Categorie   Int NOT NULL ,
        id_Etat        Int NOT NULL
	,CONSTRAINT Annonce_PK PRIMARY KEY (id)

	,CONSTRAINT Annonce_Utilisateur_FK FOREIGN KEY (Mail) REFERENCES Utilisateur(Mail)
	,CONSTRAINT Annonce_TypeAnnonce0_FK FOREIGN KEY (id_TypeAnnonce) REFERENCES TypeAnnonce(id)
	,CONSTRAINT Annonce_Categorie1_FK FOREIGN KEY (id_Categorie) REFERENCES Categorie(id)
	,CONSTRAINT Annonce_Etat2_FK FOREIGN KEY (id_Etat) REFERENCES Etat(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Photos
#------------------------------------------------------------

CREATE TABLE Photos(
        id         Int  Auto_increment  NOT NULL ,
        chemin     Varchar (255) NOT NULL ,
        id_Annonce Int NOT NULL
	,CONSTRAINT Photos_PK PRIMARY KEY (id)

	,CONSTRAINT Photos_Annonce_FK FOREIGN KEY (id_Annonce) REFERENCES Annonce(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: AnnoncesUtilisateurs
#------------------------------------------------------------

CREATE TABLE AnnoncesUtilisateurs(
        Mail    Varchar (50) NOT NULL ,
        id      Int NOT NULL ,
        favoris Bool NOT NULL ,
        vue     Bool NOT NULL
	,CONSTRAINT AnnoncesUtilisateurs_PK PRIMARY KEY (Mail,id)

	,CONSTRAINT AnnoncesUtilisateurs_Utilisateur_FK FOREIGN KEY (Mail) REFERENCES Utilisateur(Mail)
	,CONSTRAINT AnnoncesUtilisateurs_Annonce0_FK FOREIGN KEY (id) REFERENCES Annonce(id)
)ENGINE=InnoDB;

