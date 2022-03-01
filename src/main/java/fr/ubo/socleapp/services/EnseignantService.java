package fr.ubo.socleapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.ubo.socleapp.entities.Enseignant;

/**
 * 
 * @author aymaneB
 * 
 * L'interface qui contient les fonctions basic de notre service Enseignants
 *
 */
public interface EnseignantService
{
	/**
	 * 
	 * @param nom
	 * @return l'Enseignant par son nom 
	 */
	public Enseignant chercherParNom(String nom);
	/**
	 * 
	 * @param emailUbo
	 * @return l'Enseignant par son Email de l'UBO
	 */
	public Enseignant chercherParEmailUbo(String emailUbo);
	/**
	 * 
	 * @param emailPerso
	 * @return l'Enseignant par son Email Personnel
	 */
	public Enseignant chercherParEmailPerso(String emailPerso);
	/**
	 * 
	 * @param id
	 * @return supprimer l'enseignant par son id
	 */
	public boolean supprimerParId(Integer id);
	/**
	 * 
	 * @return une List des enseignants
	 */
	public List<Enseignant> findAll();
	/**
	 * 
	 * @return Ajouter un nouveau Enseignant
	 */
	public Enseignant ajouterEnseignant(Enseignant entity);
	/**
	 * 
	 * @param id
	 * @return chercher l'enseignant par son id
	 */
	public Enseignant chercherParNoEnseignant(Integer id);
}
