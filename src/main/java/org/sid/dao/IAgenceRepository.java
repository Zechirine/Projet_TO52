package org.sid.dao;
//on est dans la couche dao --> donc on ne met que les fonctionalit�s de base (select, add, delete,update) 
//--> ��d que : ajout , consulter, supprimer , mettre � jour --> afin de distinguer la couche dao de la couche metier
//--> et dans la couche metier , on met ce qui est sp�cifications fonctionnels

import org.sid.entities.AgenceBancaire;
import org.springframework.data.jpa.repository.JpaRepository;

//utilisation de spring data
//cette interface permet de gérer l'entite agence
public interface IAgenceRepository extends JpaRepository<AgenceBancaire, Long> {

}
