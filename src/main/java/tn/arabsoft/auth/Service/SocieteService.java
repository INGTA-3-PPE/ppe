package tn.arabsoft.auth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.arabsoft.auth.entity.Societe;
import tn.arabsoft.auth.repository.SocieteRepository;

import java.util.List;
import java.util.Optional;


@Service
public class SocieteService {

    @Autowired
    private SocieteRepository societeRepository;

    public List<Societe> findAll() {
        return societeRepository.findAll();
    }

    public Optional<Societe> findById(String id) {
        return societeRepository.findById(id);
    }

    public Societe save(Societe societe) {
        return societeRepository.save(societe);
    }

    public void deleteById(String id) {
        societeRepository.deleteById(id);
  
}
    
}
