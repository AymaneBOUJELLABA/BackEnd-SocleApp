/**
 * 
 */
package fr.ubo.socleapp.services;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ubo.socleapp.entities.Enseignant;
import fr.ubo.socleapp.repositories.EnseignantRepo;

/**
 * @author aymaneB
 * 
 * L'implementation du service Enseignant
 *
 */
@Service
public class EnseignantServiceImpl implements EnseignantService
{

	private static Logger logger = LogManager.getLogger(EnseignantServiceImpl.class);
	@Autowired
	EnseignantRepo enseignantRepo;
	
	public EnseignantServiceImpl()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * Chercher l'enseignant par Nom
	 */
	@Override
	public Enseignant chercherParNom(String nom)
	{
		return enseignantRepo.findByNom(nom);
	}
	/**
	 * Chercher l'enseignant par Email Ubo
	 */
	@Override
	public Enseignant chercherParEmailUbo(String emailUbo)
	{
		return enseignantRepo.findByEmailUbo(emailUbo);
	}
	/**
	 * Chercher l'enseignant par EmailPerso
	*/ 
	@Override
	public Enseignant chercherParEmailPerso(String emailPerso)
	{
		return enseignantRepo.findByEmailPerso(emailPerso);
	}

	/**
	 * supprimer Enseignant par ID
	 */
	@Override
	public boolean supprimerParId(Integer id)
	{
		try{
			enseignantRepo.deleteById(id);
		}catch(Exception e)
		{
			logger.error("supprimerParId : " + e);
			return false;
		}
		return true;
	}

	/**
	 * chercher tous les enseignants
	 */
	@Override
	public List<Enseignant> findAll()
	{
		return enseignantRepo.findAll();
	}

	/**
	 * Ajouter un nouveau Enseignant
	 */
	@Override
	public Enseignant ajouterEnseignant(Enseignant entity)
	{
		return enseignantRepo.save(entity);
	}
	
	@Override
	public Enseignant chercherParNoEnseignant(Integer id)
	{
		return enseignantRepo.getById(id);
	}
}
