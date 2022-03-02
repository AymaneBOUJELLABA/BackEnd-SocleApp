package fr.ubo.socleapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ubo.socleapp.entities.Enseignant;
import fr.ubo.socleapp.services.EnseignantService;
@SpringBootTest
class SocleappApplicationTests
{
	@Autowired
	EnseignantService enseignantService;
	
	@Test void contextLoads()
	{
		assertThat(enseignantService).isNotNull();
	}
	
	@Test void verifierLesDonnees()
	{
		assertThat(enseignantService.findAll()).isNotEmpty();
	}

	@Test void verifierUneDonne()
	{
		assertEquals(enseignantService.chercherParNoEnseignant(1).getNom(),"hello");
	}
	
	@Test void suppressionduDonnes()
	{
		Enseignant e = new Enseignant();
		e.setNom("test");
		e.setPrenom("test");
		Enseignant r = enseignantService.ajouterEnseignant(e);
		
		assertThat(enseignantService.supprimerParId(r.getNoEnseignant())).isTrue();
		assertThat(enseignantService.chercherParNoEnseignant(r.getNoEnseignant())).isNull();
	}
	
}
