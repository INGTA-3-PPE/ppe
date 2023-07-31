package tn.arabsoft.auth.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.arabsoft.auth.Service.SocieteService;
import tn.arabsoft.auth.entity.Societe;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/societes")
public class SocieteController {
    
    @Autowired
    private SocieteService societeService;
    
    @GetMapping
    public List<Societe> getAllSocietes() {
        return societeService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Societe> getSocieteById(@PathVariable String id) {
        Optional<Societe> societe = societeService.findById(id);
        if (societe.isPresent()) {
            return ResponseEntity.ok(societe.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSociete(@PathVariable String id) {
        societeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
