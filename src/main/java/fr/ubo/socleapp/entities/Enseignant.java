package fr.ubo.socleapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author aymane
 * L'entité qui représente la table des enseignants
 *
 */
@Entity
public class Enseignant
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer noEnseignant;
	
	private String nom;
	private String sexe;
	private String pays;
	private String adresse;
	private String ville;
	private String codePostal;
	private String telephone;
	private String mobile;
	private String type;
	private String emailUbo;
	private String emailPerso;
	/**
	 * @return the noEnseignant
	 */
	public Integer getNoEnseignant() {
		return noEnseignant;
	}
	/**
	 * @param noEnseignant the noEnseignant to set
	 */
	public void setNoEnseignant(Integer noEnseignant) {
		this.noEnseignant = noEnseignant;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the emailUbo
	 */
	public String getEmailUbo() {
		return emailUbo;
	}
	/**
	 * @param emailUbo the emailUbo to set
	 */
	public void setEmailUbo(String emailUbo) {
		this.emailUbo = emailUbo;
	}
	/**
	 * @return the emailPerso
	 */
	public String getEmailPerso() {
		return emailPerso;
	}
	/**
	 * @param emailPerso the emailPerso to set
	 */
	public void setEmailPerso(String emailPerso) {
		this.emailPerso = emailPerso;
	}
	/**
	 * @param noEnseignant
	 * @param nom
	 * @param sexe
	 * @param pays
	 * @param adresse
	 * @param ville
	 * @param codePostal
	 * @param telephone
	 * @param mobile
	 * @param type
	 * @param emailUbo
	 * @param emailPerso
	 */
	public Enseignant(Integer noEnseignant, String nom, String sexe, String pays, String adresse, String ville,
			String codePostal, String telephone, String mobile, String type, String emailUbo, String emailPerso) {
		super();
		this.noEnseignant = noEnseignant;
		this.nom = nom;
		this.sexe = sexe;
		this.pays = pays;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.mobile = mobile;
		this.type = type;
		this.emailUbo = emailUbo;
		this.emailPerso = emailPerso;
	}
	/**
	 * 
	 */
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Enseignant [noEnseignant=" + noEnseignant + ", nom=" + nom + ", sexe=" + sexe + ", pays=" + pays
				+ ", adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", telephone="
				+ telephone + ", mobile=" + mobile + ", type=" + type + ", emailUbo=" + emailUbo + ", emailPerso="
				+ emailPerso + "]";
	}
}
