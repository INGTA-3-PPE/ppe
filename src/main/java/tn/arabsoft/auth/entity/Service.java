package tn.arabsoft.auth.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
public class Service {

    @Id
    @Column(name = "COD_SERV")
    private String codServ;
    
    @Column(name = "LIB_SERV", nullable = false)
    private String libServ;
    
    @Column(name = "SER_COD_SERV")
    private String serCodServ;
    
  
    @Column(name = "TYPE_SERV")
    private String typeServ;
    
    @Column(name = "ABR_SERV")
    private String abrServ;
;

    @ManyToOne
    @JoinColumn(name = "COD_SOC")
   @Getter @Setter
    private Societe societe;

    public Service() {
    	
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }

    public String getLibServ() {
        return libServ;
    }

    public void setLibServ(String libServ) {
        this.libServ = libServ;
    }

    public String getSerCodServ() {
        return serCodServ;
    }

    public void setSerCodServ(String serCodServ) {
        this.serCodServ = serCodServ;
    }

    public String getTypeServ() {
        return typeServ;
    }

    public void setTypeServ(String typeServ) {
        this.typeServ = typeServ;
    }

    public String getAbrServ() {
        return abrServ;
    }

    public void setAbrServ(String abrServ) {
        this.abrServ = abrServ;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Service(String codServ, String libServ, String serCodServ, String typeServ, String abrServ, Societe societe) {
        this.codServ = codServ;
        this.libServ = libServ;
        this.serCodServ = serCodServ;
        this.typeServ = typeServ;
        this.abrServ = abrServ;
        this.societe = societe;
    }
}

