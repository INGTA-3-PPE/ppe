package tn.arabsoft.auth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.AdressePersonnelle;
import tn.arabsoft.auth.repository.AdressePersonnelleRepository;


@Service
public class AdressePersonnelleService {

    @Autowired
    private AdressePersonnelleRepository adressePersonnelleRepository;

    public List<AdressePersonnelle> findAll() {
        return adressePersonnelleRepository.findAll();
    }

    public Optional<AdressePersonnelle> findById(Integer id) {
        return adressePersonnelleRepository.findById(id);
    }

    public AdressePersonnelle save(AdressePersonnelle adressePersonnelle) {
        return adressePersonnelleRepository.save(adressePersonnelle);
    }

    public void deleteById(Integer id) {
        adressePersonnelleRepository.deleteById(id);
    }
}

