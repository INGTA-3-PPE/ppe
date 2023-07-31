package tn.arabsoft.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.EtatpaieEntity;
import tn.arabsoft.auth.repository.EtatpaieRepository;

import java.util.List;
@Service
public class EtatpaieService {

    @Autowired
    public EtatpaieRepository etatpaieRepository;

    public List<EtatpaieEntity> getAllCode() {
        return this.etatpaieRepository.findAll();
    }
    public void addCode(EtatpaieEntity etatpaieEntity) {

        this.etatpaieRepository.save(etatpaieEntity);
    }
    public void deleteCode(Long Code_Etat) {

        this.etatpaieRepository.deleteById(  Code_Etat);
    }
}
