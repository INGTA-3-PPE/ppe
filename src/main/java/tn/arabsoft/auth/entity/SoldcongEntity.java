package tn.arabsoft.auth.entity;

import javax.persistence.*;
@Entity
public class SoldcongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SOLD_CNG")
    private Long solde_Conge;


    @Column(name = "COD_SOC")
    private String Code_Societe;

    @Column(name = "ANNEE_CNG")
    private String Annee_Conge;

    @Column(name = "TYP_CNG")
    private String Type_Conge;

    @Column(name = "INIT_CNG")
    private String Init_Conge;

    @Column(name = "CUM_CNG")
    private String Droit_annee;

    @Column(name = "PRIS_CNG")
    private String Nbj_Conge;

    @Column(name = "OBS_CNG")
    private String Observation;

    public SoldcongEntity(Long solde_Conge, String code_Societe, String annee_Conge, String type_Conge, String init_Conge, String droit_annee, String nbj_Conge, String observation) {
        this.solde_Conge = solde_Conge;
        Code_Societe = code_Societe;
        Annee_Conge = annee_Conge;
        Type_Conge = type_Conge;
        Init_Conge = init_Conge;
        Droit_annee = droit_annee;
        Nbj_Conge = nbj_Conge;
        Observation = observation;
    }

    public Long getSolde_Conge() {
        return solde_Conge;
    }

    public void setSolde_Conge(Long solde_Conge) {
        this.solde_Conge = solde_Conge;
    }

    public String getCode_Societe() {
        return Code_Societe;
    }

    public void setCode_Societe(String code_Societe) {
        Code_Societe = code_Societe;
    }

    public String getAnnee_Conge() {
        return Annee_Conge;
    }

    public void setAnnee_Conge(String annee_Conge) {
        Annee_Conge = annee_Conge;
    }

    public String getType_Conge() {
        return Type_Conge;
    }

    public void setType_Conge(String type_Conge) {
        Type_Conge = type_Conge;
    }

    public String getInit_Conge() {
        return Init_Conge;
    }

    public void setInit_Conge(String init_Conge) {
        Init_Conge = init_Conge;
    }

    public String getDroit_annee() {
        return Droit_annee;
    }

    public void setDroit_annee(String droit_annee) {
        Droit_annee = droit_annee;
    }

    public String getNbj_Conge() {
        return Nbj_Conge;
    }

    public void setNbj_Conge(String nbj_Conge) {
        Nbj_Conge = nbj_Conge;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public SoldcongEntity() {
    }
}
