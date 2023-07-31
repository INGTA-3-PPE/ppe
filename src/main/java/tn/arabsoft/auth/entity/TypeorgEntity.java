package tn.arabsoft.auth.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class TypeorgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "TYP_ORG",
            updatable = false)
    @Getter
    @Setter
    private Long type_org;

    @Column(
            name = "LIB_TYP_ORG",
            updatable = false
    )
    @Getter @Setter private String lib_type_org;

    @Column(
            name = "LIB_TYP_ORG_A",
            updatable = false
    )
    @Getter @Setter private String lib_type_orgA;


    @Column(
            name = "RANG",
            updatable = false
    )
    @Getter @Setter private Integer Rang;

    public TypeorgEntity() {
    }

    public Long getType_org() {
        return type_org;
    }

    public void setType_org(Long type_org) {
        this.type_org = type_org;
    }

    public String getLib_type_org() {
        return lib_type_org;
    }

    public void setLib_type_org(String lib_type_org) {
        this.lib_type_org = lib_type_org;
    }

    public String getLib_type_orgA() {
        return lib_type_orgA;
    }

    public void setLib_type_orgA(String lib_type_orgA) {
        this.lib_type_orgA = lib_type_orgA;
    }

    public Integer getRang() {
        return Rang;
    }

    public void setRang(Integer rang) {
        Rang = rang;
    }
}
