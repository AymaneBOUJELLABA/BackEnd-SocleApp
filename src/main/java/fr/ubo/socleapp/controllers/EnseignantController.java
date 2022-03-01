/**
 * 
 */
package fr.ubo.socleapp.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ubo.socleapp.entities.Enseignant;
import fr.ubo.socleapp.services.EnseignantService;
import fr.ubo.socleapp.services.EnseignantServiceImpl;

/**
 * @author aymane
 * 
 * Le controller qui servira à exposer les endpoints pour la gestion des enseignants
 *
 */
@RestController
@RequestMapping("/enseignants")
public class EnseignantController
{
	private static Logger logger = LogManager.getLogger(EnseignantServiceImpl.class);

	@Autowired
	EnseignantService enseignantService;

	/**
	 * Constructeur par default
	 */
	public EnseignantController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public List<Enseignant> getAllEnseignants()
	{
		try{
			return enseignantService.findAll();
		}catch(Exception e)
		{
			logger.error("getAllEnseignants : " + e);
			return null;
		}
	}
	
	@GetMapping("/emailUbo/{emailUbo}")
	public Enseignant getEnseignantByEmailUbo(@PathVariable String emailUbo)
	{
		try{
			return enseignantService.chercherParEmailUbo(emailUbo);
		}catch(Exception e)
		{
			logger.error("getEnseignantByEmailUbo : "  +e);
			return null;
		}
	}
	
	@GetMapping("/emailPerso/{emailPerso}")
	public Enseignant getEnseignantByEmailPerso(@PathVariable String emailPerso)
	{
		try{
			return enseignantService.chercherParEmailPerso(emailPerso);
		}catch(Exception e)
		{
			logger.error("getEnseignantByEmailPerso : "  +e);
			return null;
		}
	}
	
	@GetMapping("/{noEnseignant}")
	public Enseignant getEnseignantByNoEnseignant(@PathVariable Integer noEnseignant)
	{
		try{
			return enseignantService.chercherParNoEnseignant(noEnseignant);
		}catch(Exception e)
		{
			logger.error("getEnseignantByNoEnseignant : "  +e);
			return null;
		}
	}
	
	@PostMapping("/")
	public Enseignant postEnseignant(@RequestBody Enseignant entity)
	{
		try
		{
			return enseignantService.ajouterEnseignant(entity);
			
		}catch(Exception e)
		{
			logger.error("postEnseignant : " + e);
			return null;
		}
	}
	
	@DeleteMapping("/{noEnseignant}")
	public String deleteEnseignant(@PathVariable)

}
