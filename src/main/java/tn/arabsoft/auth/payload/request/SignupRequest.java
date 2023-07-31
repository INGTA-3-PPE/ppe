package tn.arabsoft.auth.payload.request;

public class SignupRequest {
	private String username;
	private String matricule;

	private String email;

	private String password;

	private String nom;

	private String prenom;
	
	
	

	private String date_naissance;
	
	private String service;
	private String EmailConfirmed;
	
	
	
	private String NomPrenom;
	
	
	
	private String resp_dep;
	private Integer roles;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getEmailConfirmed() {
		return EmailConfirmed;
	}
	public void setEmailConfirmed(String emailConfirmed) {
		EmailConfirmed = emailConfirmed;
	}
	public String getNomPrenom() {
		return NomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		NomPrenom = nomPrenom;
	}
	public String getResp_dep() {
		return resp_dep;
	}
	public void setResp_dep(String resp_dep) {
		this.resp_dep = resp_dep;
	}
	public Integer getRoles() {
		return roles;
	}
	public void setRoles(Integer roles) {
		this.roles = roles;
	}
	public SignupRequest(String username, String matricule, String email, String password, String nom, String prenom,
			String date_naissance, String service, String emailConfirmed, String nomPrenom, String resp_dep,
			Integer roles) {
		super();
		this.username = username;
		this.matricule = matricule;
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.service = service;
		EmailConfirmed = emailConfirmed;
		NomPrenom = nomPrenom;
		this.resp_dep = resp_dep;
		this.roles = roles;
	}
	public SignupRequest(String username, String matricule, String email, String password, String nom, String prenom,
			String date_naissance, String service, String emailConfirmed, String nomPrenom, String resp_dep) {
		super();
		this.username = username;
		this.matricule = matricule;
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.service = service;
		EmailConfirmed = emailConfirmed;
		NomPrenom = nomPrenom;
		this.resp_dep = resp_dep;
	}
	public SignupRequest() {
		super();
	}
	


}
