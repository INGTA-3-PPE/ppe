package tn.arabsoft.auth.entity;


import javax.persistence.*;

@Table(name = "ADR_PERS")
@Entity

public class AdressePersonnelle {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID_ADR_PERS")
	 private Integer id;

	@Column(name = "COD_GOUV")
	private String codeGouv;

	@Column(name = "COD_DELEG")
	private String codeDeleg;

	@Column(name = "COD_POST")
	private String codePost;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_SOC")

	private Societe societe;

	@Column(name = "MAT_PERS")
	private String matPers;

	@Column(name = "NUM_ADR")
	private int numAdr;

	@Column(name = "RUE")
	private String rue;

	@Column(name = "TEL_PERS")
	private String telPers;

	@Column(name = "FAX_PERS")
	private String faxPers;

	@Column(name = "ADR_COURANT")
	private String adrCourant;

	@Column(name = "ADR_ELECTRONIQUE")
	private String adrElectronique;

	@Column(name = "TEL_PORT_PERS")
	private String telPortPers;

	@Column(name = "NUMERO_ADR")
	private int numeroAdr;

	@Column(name = "ETAT_ADR")
	private String etatAdr;

	@Column(name = "IMMB_PERS")
	private String immbPers;

	@Column(name = "APP_PERS")
	private String appPers;

	@Column(name = "LOCAL_PERS")
	private String localPers;

	@Column(name = "REC_MAIL", columnDefinition = "VARCHAR2(1) default 'O'")
	private String recMail;


	// Constructeurs, getters et setters omis pour simplifier


	public AdressePersonnelle(Integer id, String codeGouv, String codeDeleg, String codePost, Societe societe, String matPers, int numAdr, String rue, String telPers, String faxPers, String adrCourant, String adrElectronique, String telPortPers, int numeroAdr, String etatAdr, String immbPers, String appPers, String localPers, String recMail) {
		this.id = id;
		this.codeGouv = codeGouv;
		this.codeDeleg = codeDeleg;
		this.codePost = codePost;
		this.societe = societe;
		this.matPers = matPers;
		this.numAdr = numAdr;
		this.rue = rue;
		this.telPers = telPers;
		this.faxPers = faxPers;
		this.adrCourant = adrCourant;
		this.adrElectronique = adrElectronique;
		this.telPortPers = telPortPers;
		this.numeroAdr = numeroAdr;
		this.etatAdr = etatAdr;
		this.immbPers = immbPers;
		this.appPers = appPers;
		this.localPers = localPers;
		this.recMail = recMail;
	}

	public AdressePersonnelle() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeGouv() {
		return codeGouv;
	}

	public void setCodeGouv(String codeGouv) {
		this.codeGouv = codeGouv;
	}

	public String getCodeDeleg() {
		return codeDeleg;
	}

	public void setCodeDeleg(String codeDeleg) {
		this.codeDeleg = codeDeleg;
	}

	public String getCodePost() {
		return codePost;
	}

	public void setCodePost(String codePost) {
		this.codePost = codePost;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public String getMatPers() {
		return matPers;
	}

	public void setMatPers(String matPers) {
		this.matPers = matPers;
	}

	public int getNumAdr() {
		return numAdr;
	}

	public void setNumAdr(int numAdr) {
		this.numAdr = numAdr;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getTelPers() {
		return telPers;
	}

	public void setTelPers(String telPers) {
		this.telPers = telPers;
	}

	public String getFaxPers() {
		return faxPers;
	}

	public void setFaxPers(String faxPers) {
		this.faxPers = faxPers;
	}

	public String getAdrCourant() {
		return adrCourant;
	}

	public void setAdrCourant(String adrCourant) {
		this.adrCourant = adrCourant;
	}

	public String getAdrElectronique() {
		return adrElectronique;
	}

	public void setAdrElectronique(String adrElectronique) {
		this.adrElectronique = adrElectronique;
	}

	public String getTelPortPers() {
		return telPortPers;
	}

	public void setTelPortPers(String telPortPers) {
		this.telPortPers = telPortPers;
	}

	public int getNumeroAdr() {
		return numeroAdr;
	}

	public void setNumeroAdr(int numeroAdr) {
		this.numeroAdr = numeroAdr;
	}

	public String getEtatAdr() {
		return etatAdr;
	}

	public void setEtatAdr(String etatAdr) {
		this.etatAdr = etatAdr;
	}

	public String getImmbPers() {
		return immbPers;
	}

	public void setImmbPers(String immbPers) {
		this.immbPers = immbPers;
	}

	public String getAppPers() {
		return appPers;
	}

	public void setAppPers(String appPers) {
		this.appPers = appPers;
	}

	public String getLocalPers() {
		return localPers;
	}

	public void setLocalPers(String localPers) {
		this.localPers = localPers;
	}

	public String getRecMail() {
		return recMail;
	}

	public void setRecMail(String recMail) {
		this.recMail = recMail;
	}
}