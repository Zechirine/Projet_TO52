package org.sid.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "AgenceBancaire")
public class AgenceBancaire {
	@Id
	@Column (name="code_Agence") //cette annotation n'est pas obligatoire (on peut l'�liminer comme pour les autres attributs et utiliser le nom de l'attribut comme non du colonne )
	private Long Code;
	private String nom;
	@OneToMany (mappedBy = "agent",fetch=FetchType.LAZY)  // "agent" est attribut $ d'association $ de la classe client (association entre la classe Client et AgenceBancaire )
	private Collection<Client> clients;
	
	public AgenceBancaire(Long code, String nom) {
		super();
		Code = code;
		this.nom = nom;
	}

	public Long getCode() {
		return Code;
	}

	public void setCode(Long code) {
		Code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "AgenceBancaire [Code=" + Code + ", nom=" + nom + ", clients=" + clients + "]";
	}
	
	
	
	

}
