package tn.arabsoft.auth.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity(name="TypcongEntity")
public class TypcongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "TYP_CNG",
            updatable = false)
    @Getter
    @Setter
    private Long Type_Conge;


    @Column(name = "LIB_CNG",
            updatable = false)
    @Getter
    @Setter
    private String Lib_Conge;

    @Column(name = "MOIS_DEBUT",
            updatable = false)
    @Getter
    @Setter
    private String debut_Cycle;

    @Column(name = "MOIS_FIN",
            updatable = false)
    @Getter
    @Setter
    private String Fin_Cycle;

    public TypcongEntity() {
    }

    public Long getType_Conge() {
        return Type_Conge;
    }

    public void setType_Conge(Long type_Conge) {
        Type_Conge = type_Conge;
    }

    public String getLib_Conge() {
        return Lib_Conge;
    }

    public void setLib_Conge(String lib_Conge) {
        Lib_Conge = lib_Conge;
    }

    public String getDebut_Cycle() {
        return debut_Cycle;
    }

    public void setDebut_Cycle(String debut_Cycle) {
        this.debut_Cycle = debut_Cycle;
    }

    public String getFin_Cycle() {
        return Fin_Cycle;
    }

    public void setFin_Cycle(String fin_Cycle) {
        Fin_Cycle = fin_Cycle;
    }
}

