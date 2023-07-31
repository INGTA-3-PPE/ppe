package tn.arabsoft.auth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import tn.arabsoft.auth.entity.LibredemandeEntity;
import tn.arabsoft.auth.entity.Personnel;
import tn.arabsoft.auth.repository.LibredemandeRepository;



@Service
public class LibredemandeService {
    @Autowired
    public LibredemandeRepository libredemandeRepository;

    public List<LibredemandeEntity> getAllDemand() {

        return this.libredemandeRepository.findAll();





    }
    public void addDemand(LibredemandeEntity libredemandeEntity) {
        libredemandeEntity.setCod_Soc("1");
        libredemandeEntity.setTexte_Reponse("En cours");

        this.libredemandeRepository.save(libredemandeEntity);
    }
    public void deleteDemand(Long Id_Libre_Demande) {

        this.libredemandeRepository.deleteById(  Id_Libre_Demande);
    }

    public LibredemandeEntity updateDemandA(Long id) {
        LibredemandeEntity libredemandeEntity = new LibredemandeEntity();
        libredemandeEntity = this.libredemandeRepository.getReferenceById(id);
        libredemandeEntity.setTexte_Reponse("Acceptée");
        return  this.libredemandeRepository.save(libredemandeEntity);
    }
    public LibredemandeEntity updateDemandR(Long id) {
        LibredemandeEntity libredemandeEntity = new LibredemandeEntity();
        libredemandeEntity = this.libredemandeRepository.getReferenceById(id);
            libredemandeEntity.setTexte_Reponse("Annullée");
        return  this.libredemandeRepository.save(libredemandeEntity);
    }

    public  List<LibredemandeEntity>  getDemandeParMatricule(String matricule) {
        return libredemandeRepository.findByMatricule(matricule);


    }








}
