/**
 * 
 */
package fr.ubo.socleapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ubo.socleapp.entities.Enseignant;

/**
 * @author aymaneB
 * Repository résponsable à faire les appèlles à la base de données
 *
 */
@Repository
public interface EnseignantRepo extends JpaRepository<Enseignant, Integer>
{
	/**
	 * 
	 * @param nom
	 * @return l'Enseignant par son nom 
	 */
	public Enseignant findByNom(String nom);
	/**
	 * 
	 * @param emailUbo
	 * @return l'Enseignant par son Email de l'UBO
	 */
	public Enseignant findByEmailUbo(String emailUbo);
	/**
	 * 
	 * @param emailPerso
	 * @return l'Enseignant par son Email Personnel
	 */
	public Enseignant findByEmailPerso(String emailPerso);
}
