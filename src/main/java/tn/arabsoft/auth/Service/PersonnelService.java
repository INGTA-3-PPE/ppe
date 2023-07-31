package tn.arabsoft.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.Personnel;
import tn.arabsoft.auth.repository.PersonnelRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service

public class PersonnelService {
	@Bean(name = "nouveauNom")
	public PersonnelService personnelService() {
	   return new PersonnelService();
	}

    @Autowired
    private PersonnelRepository personnelRepository;


    public List<Personnel> getAllPersonnel() {
        return this.personnelRepository.findAll();

    }


    public Personnel ajouterPersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    public Personnel getPersonnelParMatricule(String matricule) {
        return personnelRepository.findById(matricule).orElse(null);

    
    }
    public Personnel updateUser(Personnel personnel) {
        //personnel.setDateNaissance(new Date());
        personnel.setCOD_SOC("1");
        return this.personnelRepository.save(personnel);
    }


   

}


