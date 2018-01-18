INSERT INTO `Auteur` (`Nom`, `Prenom`) VALUES
('DeMAUPASSANT', 'Guy'),('HUGO', 'Victor'),('YOURCENAR', 'Marguerite'),('ASIMOV', 'Isaac'),('MUSSO', 'Guillaume');('SAND', 'Georges');('RENARD', 'Jules')

INSERT INTO `Livres` (`Titre`, `Code`, `Id_Auteur`,'Id_Section') VALUES
('Bel ami', '231', '1','2'),('Les memoires', '125', '3','3'),('Poil de carotte', '235', '7','1'),('Les Miserables', '423', '2','2'),('Central Park', '589', '5','1'), ('Fondation', '147', '4','3');

INSERT INTO `Section` (`Nom`) VALUES
('Roman'),('Thriller'),('Science fiction'),('Policier');
