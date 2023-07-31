package tn.arabsoft.auth.entity;

import javax.persistence.*;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Personnel{

    @Id
    @Column(name = "MAT_PERS")
    private String matricule;

    @Column(name = "NOM_PERS")
   private String nom;

    @Column(name = "PREN_PERS")
    private String prenom;

    @Column(name = "NOM_JF")
     private String nomJeuneFille;

    @Column(name = "CIN")
     private String cin;

    @Column(name = "SEXE")
   private String sexe;

    @Column(name = "COD_SIT")
     private String situationFamiliale;

    @Column(name = "DAT_SIT")
    @Temporal(TemporalType.DATE)
     private Date dateSituationFamiliale;

    @Column(name = "CHEF_FAM")
    private String chefFamille;

    @Column(name = "NBRE_ENF")
    private Integer nombreEnfants;

    @Column(name = "DAT_ENT")
    @Temporal(TemporalType.DATE)
    private Date dateEntree;

    @Column(name = "DAT_TIT")
    @Temporal(TemporalType.DATE)
     private Date dateTitularisation;

    @Column(name = "COD_SERV")
   private String codeService;

    @Column(name = "COD_FONCT")
   private String codeFonction;

    @Column(name = "COD_NATP")
    private String codeNationalite;

    @Column(name = "DAT_SERV")
    @Temporal(TemporalType.DATE)
     private Date dateAffectationService;

    @Column(name = "DAT_FONCT")
    @Temporal(TemporalType.DATE)
     private Date dateFonction;

    @Column(name = "DAT_EMB")
    @Temporal(TemporalType.DATE)
     private Date dateEmbauche;

    @Column(name = "DAT_NAIS")
    @Temporal(TemporalType.DATE)
     private Date dateNaissance;

    @Column(name = "ETAT_ACT")
    private String etatPaie;

    @Column(name = "ADM_TECH")
     private String posteTravail;

    @Column(name = "DAT_CIN")
    @Temporal(TemporalType.DATE)
     private Date dateDelivranceIdentifiant;

    @Column(name = "LIEU_EMI_CIN")
     private String lieuDelivranceIdentifiant;

    @Column(name = "DAT_AFFECT")
    @Temporal(TemporalType.DATE)
     private Date dateChangementStatutAdministratif;

    @Column(name = "LIEU_NAIS")
    private String lieuNaissance;

    @Column(name = "GRP_SANG")
    private String groupeSanguin;

    @Column(name = "NUM_RETR")
    private String numeroCnss;

    @Column(name = "HANDICAP")
     private Integer handicap;

    @Column(name = "POURCENT_HAND")
     private Double pourcentageHandicap;

    @Column(name = "TYP_HANDICAP")
      private String typeHandicap;

    @Column(name = "NUM_FICH_HAND")
    private String numeroFicheHandicap;

    @Column(name = "TYP_ID")
    private String typeIdentifiant;

    @Column(name = "COD_SOC")
    private String COD_SOC;

    public String getCOD_SOC() {
        return COD_SOC;
    }

    public void setCOD_SOC(String COD_SOC) {
        this.COD_SOC = COD_SOC;
    }

    public String getMatricule() {
		return matricule;
	}

    public Personnel() {
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    public void setNomJeuneFille(String nomJeuneFille) {
        this.nomJeuneFille = nomJeuneFille;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSituationFamiliale() {
        return situationFamiliale;
    }

    public void setSituationFamiliale(String situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public Date getDateSituationFamiliale() {
        return dateSituationFamiliale;
    }

    public void setDateSituationFamiliale(Date dateSituationFamiliale) {
        this.dateSituationFamiliale = dateSituationFamiliale;
    }

    public String getChefFamille() {
        return chefFamille;
    }

    public void setChefFamille(String chefFamille) {
        this.chefFamille = chefFamille;
    }

    public Integer getNombreEnfants() {
        return nombreEnfants;
    }

    public void setNombreEnfants(Integer nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateTitularisation() {
        return dateTitularisation;
    }

    public void setDateTitularisation(Date dateTitularisation) {
        this.dateTitularisation = dateTitularisation;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getCodeFonction() {
        return codeFonction;
    }

    public void setCodeFonction(String codeFonction) {
        this.codeFonction = codeFonction;
    }

    public String getCodeNationalite() {
        return codeNationalite;
    }

    public void setCodeNationalite(String codeNationalite) {
        this.codeNationalite = codeNationalite;
    }

    public Date getDateAffectationService() {
        return dateAffectationService;
    }

    public void setDateAffectationService(Date dateAffectationService) {
        this.dateAffectationService = dateAffectationService;
    }

    public Date getDateFonction() {
        return dateFonction;
    }

    public void setDateFonction(Date dateFonction) {
        this.dateFonction = dateFonction;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEtatPaie() {
        return etatPaie;
    }

    public void setEtatPaie(String etatPaie) {
        this.etatPaie = etatPaie;
    }

    public String getPosteTravail() {
        return posteTravail;
    }

    public void setPosteTravail(String posteTravail) {
        this.posteTravail = posteTravail;
    }

    public Date getDateDelivranceIdentifiant() {
        return dateDelivranceIdentifiant;
    }

    public void setDateDelivranceIdentifiant(Date dateDelivranceIdentifiant) {
        this.dateDelivranceIdentifiant = dateDelivranceIdentifiant;
    }

    public String getLieuDelivranceIdentifiant() {
        return lieuDelivranceIdentifiant;
    }

    public void setLieuDelivranceIdentifiant(String lieuDelivranceIdentifiant) {
        this.lieuDelivranceIdentifiant = lieuDelivranceIdentifiant;
    }

    public Date getDateChangementStatutAdministratif() {
        return dateChangementStatutAdministratif;
    }

    public void setDateChangementStatutAdministratif(Date dateChangementStatutAdministratif) {
        this.dateChangementStatutAdministratif = dateChangementStatutAdministratif;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public String getNumeroCnss() {
        return numeroCnss;
    }

    public void setNumeroCnss(String numeroCnss) {
        this.numeroCnss = numeroCnss;
    }

    public Integer getHandicap() {
        return handicap;
    }

    public void setHandicap(Integer handicap) {
        this.handicap = handicap;
    }

    public Double getPourcentageHandicap() {
        return pourcentageHandicap;
    }

    public void setPourcentageHandicap(Double pourcentageHandicap) {
        this.pourcentageHandicap = pourcentageHandicap;
    }

    public String getTypeHandicap() {
        return typeHandicap;
    }

    public void setTypeHandicap(String typeHandicap) {
        this.typeHandicap = typeHandicap;
    }

    public String getNumeroFicheHandicap() {
        return numeroFicheHandicap;
    }

    public void setNumeroFicheHandicap(String numeroFicheHandicap) {
        this.numeroFicheHandicap = numeroFicheHandicap;
    }

    public String getTypeIdentifiant() {
        return typeIdentifiant;
    }

    public void setTypeIdentifiant(String typeIdentifiant) {
        this.typeIdentifiant = typeIdentifiant;
    }

    public Personnel(String matricule, String nom, String prenom, String nomJeuneFille, String cin, String sexe, String situationFamiliale, Date dateSituationFamiliale, String chefFamille, Integer nombreEnfants, Date dateEntree, Date dateTitularisation, String codeService, String codeFonction, String codeNationalite, Date dateAffectationService, Date dateFonction, Date dateEmbauche, Date dateNaissance, String etatPaie, String posteTravail, Date dateDelivranceIdentifiant, String lieuDelivranceIdentifiant, Date dateChangementStatutAdministratif, String lieuNaissance, String groupeSanguin, String numeroCnss, Integer handicap, Double pourcentageHandicap, String typeHandicap, String numeroFicheHandicap, String typeIdentifiant) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.nomJeuneFille = nomJeuneFille;
        this.cin = cin;
        this.sexe = sexe;
        this.situationFamiliale = situationFamiliale;
        this.dateSituationFamiliale = dateSituationFamiliale;
        this.chefFamille = chefFamille;
        this.nombreEnfants = nombreEnfants;
        this.dateEntree = dateEntree;
        this.dateTitularisation = dateTitularisation;
        this.codeService = codeService;
        this.codeFonction = codeFonction;
        this.codeNationalite = codeNationalite;
        this.dateAffectationService = dateAffectationService;
        this.dateFonction = dateFonction;
        this.dateEmbauche = dateEmbauche;
        this.dateNaissance = dateNaissance;
        this.etatPaie = etatPaie;
        this.posteTravail = posteTravail;
        this.dateDelivranceIdentifiant = dateDelivranceIdentifiant;
        this.lieuDelivranceIdentifiant = lieuDelivranceIdentifiant;
        this.dateChangementStatutAdministratif = dateChangementStatutAdministratif;
        this.lieuNaissance = lieuNaissance;
        this.groupeSanguin = groupeSanguin;
        this.numeroCnss = numeroCnss;
        this.handicap = handicap;
        this.pourcentageHandicap = pourcentageHandicap;
        this.typeHandicap = typeHandicap;
        this.numeroFicheHandicap = numeroFicheHandicap;
        this.typeIdentifiant = typeIdentifiant;
    }
}

