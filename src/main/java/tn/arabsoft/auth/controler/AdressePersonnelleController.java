package tn.arabsoft.auth.controler;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.arabsoft.auth.Service.AdressePersonnelleService;
import tn.arabsoft.auth.entity.AdressePersonnelle;


@RestController
@RequestMapping("/adress")
public class AdressePersonnelleController {

    @Autowired
    private AdressePersonnelleService adressePersonnelleService;

    @GetMapping("/alladrpersonne")
    public List<AdressePersonnelle> findAll() {
        return adressePersonnelleService.findAll();
    }

  
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        adressePersonnelleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
