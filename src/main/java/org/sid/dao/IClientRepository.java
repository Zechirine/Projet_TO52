package org.sid.dao;
//on est dans la couche dao --> donc on ne met que les fonctionalit�s de base (select, add, delete,update) 
// --> ��d que : ajout , consulter, supprimer , mettre � jour --> afin de distinguer la couche dao de la couche metier
// --> et dans la couche metier , on met ce qui est sp�cifications fonctionnels

 
import org.sid.entities.Client;
import org.sid.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
 
//utilisation de spring data
//cette interface permet de gérer l'entite client 
public interface IClientRepository extends JpaRepository<Client,Long> {  //interface JPA/repository (utilisation de spring data necessite la creation de l'interface jpaRepository)  ---- le Id de Client est de type long
	@Query("select c from Client c where c.agent.code=:x")  //
	public Page<Client>  listClient(@Param("x")Long code,Pageable pageable);
	 
}
