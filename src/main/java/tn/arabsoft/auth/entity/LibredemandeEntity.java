package tn.arabsoft.auth.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;




import java.util.Date;
@Table(name="LIBRE_DEMANDE")
@Entity
public class LibredemandeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLibre")
    @SequenceGenerator(name = "seqLibre", sequenceName = "SEQ_LIBRE_DEMANDE", allocationSize = 1)

    @Column(name = "ID_LIBRE_DEMANDE"
    )
   @Getter @Setter private long id;

    @Column(
            name = "COD_SOC"

    )
    @Getter @Setter private String Cod_Soc;
    @Column(
            name = "MAT_PERS"

    )
    @Getter @Setter private String matricule;
    @Column(
            name = "TYP_DEMANDE"

    )
    @Setter @Getter private String Type_Demande;
    @Column(
            name = "DATE_DEMANDE"

    )
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Setter @Getter private Date Date_Demande;

    public String getCod_Soc() {
        return Cod_Soc;
    }

    public void setCod_Soc(String cod_Soc) {
        Cod_Soc = cod_Soc;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getType_Demande() {
        return Type_Demande;
    }

    public void setType_Demande(String type_Demande) {
        Type_Demande = type_Demande;
    }

    public Date getDate_Demande() {
        return Date_Demande;
    }

    public void setDate_Demande(Date date_Demande) {
        Date_Demande = date_Demande;
    }

    public Date getDate_Debut() {
        return Date_Debut;
    }

    public void setDate_Debut(Date date_Debut) {
        Date_Debut = date_Debut;
    }

    public Date getDate_Fin() {
        return Date_Fin;
    }

    public void setDate_Fin(Date date_Fin) {
        Date_Fin = date_Fin;
    }

    public Double getHeure_Sortie() {
        return Heure_Sortie;
    }

    public void setHeure_Sortie(Double heure_Sortie) {
        Heure_Sortie = heure_Sortie;
    }

    public Double getMinute_Sortie() {
        return Minute_Sortie;
    }

    public void setMinute_Sortie(Double minute_Sortie) {
        Minute_Sortie = minute_Sortie;
    }

    public Double getHeure_Retour() {
        return Heure_Retour;
    }

    public void setHeure_Retour(Double heure_Retour) {
        Heure_Retour = heure_Retour;
    }

    @Column(
            name = "DAT_DEBUT"

    )
    @Setter @Getter private Date Date_Debut;
    @Column(
            name = "DAT_FIN"

    )
    @Getter @Setter private Date Date_Fin;
    @Column(
            name = "HEUR_S"

    )
    @Getter @Setter private Double Heure_Sortie;
    @Column(
            name = "MIN_S"

    )
     @Getter @Setter private Double Minute_Sortie;
    @Column(
            name = "HEUR_R"

    )
   @Getter @Setter private Double Heure_Retour;

    @Column(
            name = "MIN_R"

    )
   @Getter @Setter private Double Minute_Retour;
    @Column(
            name = "COD_GRP_PRET"

    )
     private String Code_Groupe_Pret;

    @Column(
            name = "MNT_DEM"

    )
    private Double Montant_Demande;
    @Column(
            name = "NUM_ATTEST"

    )
    private Double Numero_Attestation;
    @Column(
            name = "TXT_DEM"

    )
    private String Text_Demande;
    @Column(
            name = "TXT_REPONSE"
    )
    private String Texte_Reponse;
    @Column(
            name = "REPONSE_CHEF"
    )
    private String Reponse_Chef;
    @Column(
            name = "REPONSE"
    )
    private String Reponse;
    @Column(
            name = "TXT_CHEF"
    )
    private String Texte_Chef;
    @Column(
            name = "FILE_NAME"
    )
    private String File_Name;
    @Column(
            name = "CONTENT_TYPE"

    )
    private String Content_Type;
    @Column(
            name = "PATH"
    )
    private String path;

    @Lob //pour le type blob:pour plus de stockage
    @Column(
            name = "FICHIER_JOINT",
            columnDefinition = "BLOB")
    private byte[] Fichier_Joint;

    @Column(
            name = "COD_M"
    )
    private String Code_Mariage;

    @Column(
            name = "CNG_TEMPS_FIN"
    )
    private String Conge_Temps_Fin;
    @Column(
            name = "CNG_TEMPS_DEBUT"
    )
    private String Conge_Temps_Debut;
    @Column(
            name = "CNG_TEMPS"
    )
    private String Conge_Temps;
    @Column(
            name = "COD_AUT"
    )
    private String Code_Autorisation;
    @Column(
            name = "ANNEE"
    )
    private Double Annee;
    @Column(
            name = "SOLD_CNG"
    )
    private Double Solde_Conge;

    @Column(
            name = "PRIS_CNG"
    )
    private Double Pris_Conge;


    public LibredemandeEntity() {
    }

    public LibredemandeEntity(long id, String cod_Soc, String matricule, String type_Demande, Date date_Demande, Date date_Debut, Date date_Fin, Double  heure_Sortie, Double minute_Sortie, Double  heure_Retour, Double minute_Retour, String code_Groupe_Pret, Double montant_Demande, Double numero_Attestation, String text_Demande, String texte_Reponse, String reponse_Chef, String reponse, String texte_Chef, String file_Name, String content_Type, String path, byte[] fichier_Joint, String code_Mariage, String conge_Temps_Fin, String conge_Temps_Debut, String conge_Temps, String code_Autorisation, Double annee, Double solde_Conge, Double pris_Conge) {
        this.id = id;
        Cod_Soc = cod_Soc;
        this.matricule = matricule;
        Type_Demande = type_Demande;
        Date_Demande = date_Demande;
        Date_Debut = date_Debut;
        Date_Fin = date_Fin;
        Heure_Sortie = heure_Sortie;
        Minute_Sortie = minute_Sortie;
        Heure_Retour = heure_Retour;
        Minute_Retour = minute_Retour;
        Code_Groupe_Pret = code_Groupe_Pret;
        Montant_Demande = montant_Demande;
        Numero_Attestation = numero_Attestation;
        Text_Demande = text_Demande;
        Texte_Reponse = texte_Reponse;
        Reponse_Chef = reponse_Chef;
        Reponse = reponse;
        Texte_Chef = texte_Chef;
        File_Name = file_Name;
        Content_Type = content_Type;
        this.path = path;
        Fichier_Joint = fichier_Joint;
        Code_Mariage = code_Mariage;
        Conge_Temps_Fin = conge_Temps_Fin;
        Conge_Temps_Debut = conge_Temps_Debut;
        Conge_Temps = conge_Temps;
        Code_Autorisation = code_Autorisation;
        Annee = annee;
        Solde_Conge = solde_Conge;
        Pris_Conge = pris_Conge;
    }

    public LibredemandeEntity(String cod_Soc, String matricule, String type_Demande, Date date_Demande, Date date_Debut, Date date_Fin, Double  heure_Sortie, Double minute_Sortie, Double  heure_Retour, Double minute_Retour, String code_Groupe_Pret, Double montant_Demande, Double numero_Attestation, String text_Demande, String texte_Reponse, String reponse_Chef, String reponse, String texte_Chef, String file_Name, String content_Type, String path, byte[] fichier_Joint, String code_Mariage, String conge_Temps_Fin, String conge_Temps_Debut, String conge_Temps, String code_Autorisation, Double annee, Double solde_Conge, Double pris_Conge) {
        Cod_Soc = cod_Soc;
        this.matricule = matricule;
        Type_Demande = type_Demande;
        Date_Demande = date_Demande;
        Date_Debut = date_Debut;
        Date_Fin = date_Fin;
        Heure_Sortie = heure_Sortie;
        Minute_Sortie = minute_Sortie;
        Heure_Retour = heure_Retour;
        Minute_Retour = minute_Retour;
        Code_Groupe_Pret = code_Groupe_Pret;
        Montant_Demande = montant_Demande;
        Numero_Attestation = numero_Attestation;
        Text_Demande = text_Demande;
        Texte_Reponse = texte_Reponse;
        Reponse_Chef = reponse_Chef;
        Reponse = reponse;
        Texte_Chef = texte_Chef;
        File_Name = file_Name;
        Content_Type = content_Type;
        this.path = path;
        Fichier_Joint = fichier_Joint;
        Code_Mariage = code_Mariage;
        Conge_Temps_Fin = conge_Temps_Fin;
        Conge_Temps_Debut = conge_Temps_Debut;
        Conge_Temps = conge_Temps;
        Code_Autorisation = code_Autorisation;
        Annee = annee;
        Solde_Conge = solde_Conge;
        Pris_Conge = pris_Conge;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getMinute_Retour() {
        return Minute_Retour;
    }

    public void setMinute_Retour(Double minute_Retour) {
        Minute_Retour = minute_Retour;
    }

    public String getCode_Groupe_Pret() {
        return Code_Groupe_Pret;
    }

    public void setCode_Groupe_Pret(String code_Groupe_Pret) {
        Code_Groupe_Pret = code_Groupe_Pret;
    }

    public Double getMontant_Demande() {
        return Montant_Demande;
    }

    public void setMontant_Demande(Double montant_Demande) {
        Montant_Demande = montant_Demande;
    }

    public Double getNumero_Attestation() {
        return Numero_Attestation;
    }

    public void setNumero_Attestation(Double numero_Attestation) {
        Numero_Attestation = numero_Attestation;
    }

    public String getText_Demande() {
        return Text_Demande;
    }

    public void setText_Demande(String text_Demande) {
        Text_Demande = text_Demande;
    }

    public String getTexte_Reponse() {
        return Texte_Reponse;
    }

    public void setTexte_Reponse(String texte_Reponse) {
        Texte_Reponse = texte_Reponse;
    }

    public String getReponse_Chef() {
        return Reponse_Chef;
    }

    public void setReponse_Chef(String reponse_Chef) {
        Reponse_Chef = reponse_Chef;
    }

    public String getReponse() {
        return Reponse;
    }

    public void setReponse(String reponse) {
        Reponse = reponse;
    }

    public String getTexte_Chef() {
        return Texte_Chef;
    }

    public void setTexte_Chef(String texte_Chef) {
        Texte_Chef = texte_Chef;
    }

    public String getFile_Name() {
        return File_Name;
    }

    public void setFile_Name(String file_Name) {
        File_Name = file_Name;
    }

    public String getContent_Type() {
        return Content_Type;
    }

    public void setContent_Type(String content_Type) {
        Content_Type = content_Type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public byte[] getFichier_Joint() {
        return Fichier_Joint;
    }

    public void setFichier_Joint(byte[] fichier_Joint) {
        Fichier_Joint = fichier_Joint;
    }

    public String getCode_Mariage() {
        return Code_Mariage;
    }

    public void setCode_Mariage(String code_Mariage) {
        Code_Mariage = code_Mariage;
    }

    public String getConge_Temps_Fin() {
        return Conge_Temps_Fin;
    }

    public void setConge_Temps_Fin(String conge_Temps_Fin) {
        Conge_Temps_Fin = conge_Temps_Fin;
    }

    public String getConge_Temps_Debut() {
        return Conge_Temps_Debut;
    }

    public void setConge_Temps_Debut(String conge_Temps_Debut) {
        Conge_Temps_Debut = conge_Temps_Debut;
    }

    public String getConge_Temps() {
        return Conge_Temps;
    }

    public void setConge_Temps(String conge_Temps) {
        Conge_Temps = conge_Temps;
    }

    public String getCode_Autorisation() {
        return Code_Autorisation;
    }

    public void setCode_Autorisation(String code_Autorisation) {
        Code_Autorisation = code_Autorisation;
    }

    public Double getAnnee() {
        return Annee;
    }

    public void setAnnee(Double annee) {
        Annee = annee;
    }

    public Double getSolde_Conge() {
        return Solde_Conge;
    }

    public void setSolde_Conge(Double solde_Conge) {
        Solde_Conge = solde_Conge;
    }

    public Double getPris_Conge() {
        return Pris_Conge;
    }

    public void setPris_Conge(Double pris_Conge) {
        Pris_Conge = pris_Conge;
    }

}


