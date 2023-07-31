package tn.arabsoft.auth.controler;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import tn.arabsoft.auth.Service.LibredemandeService;
import tn.arabsoft.auth.entity.LibredemandeEntity;



@CrossOrigin("*")
@RestController

@RequestMapping("/libredeman")

public class LibredemandeController {
    @Autowired
    private LibredemandeService libredemandeService;

    @GetMapping("getByMatricule/{matricule}")
    public List<LibredemandeEntity> getPersonnelParMatricule(@PathVariable String matricule) {
        return libredemandeService.getDemandeParMatricule(matricule);


    }

    @GetMapping("/allDemand")
    public ResponseEntity<List<LibredemandeEntity>> findAll() {
        List<LibredemandeEntity> libredemandeEntities = libredemandeService.getAllDemand();
        return ResponseEntity.ok().body(libredemandeEntities);
    }

    @GetMapping("/allDemandByType")
    public ResponseEntity<List<LibredemandeEntity>> findAllByType() {
        List<LibredemandeEntity> libredemandeEntities = libredemandeService.getAllDemand();
        return ResponseEntity.ok().body(libredemandeEntities.stream().filter(e-> e.getType_Demande() != null && (e.getType_Demande().equals("Mutation") || e.getType_Demande().equals("Congé") || e.getType_Demande().equals("Autorisation") )).collect(Collectors.toList()));

    }

    @PostMapping("/addDemand")
    @ResponseBody
    public void addDemand(@RequestBody LibredemandeEntity libredemandeentity) {
        libredemandeentity.setDate_Demande(new Date());
        this.libredemandeService.addDemand(libredemandeentity);
    }

    @DeleteMapping("/deleteDemand/{id}")
    @ResponseBody
    public void deleteDemand(@PathVariable Long Id_Libre_Demande) {
        this.libredemandeService.deleteDemand(Id_Libre_Demande);
    }

    @PutMapping("/updateAccepted/{Id_Libre_Demande}")
    @ResponseBody
    public ResponseEntity<LibredemandeEntity> updateA(@PathVariable Long Id_Libre_Demande) {
        LibredemandeEntity updateDemand = this.libredemandeService.updateDemandA(Id_Libre_Demande);
        return new ResponseEntity<>(updateDemand, HttpStatus.OK);
    }


    @PutMapping("/updateRefused/{Id_Libre_Demande}")
    @ResponseBody
    public ResponseEntity<LibredemandeEntity> updateR(@PathVariable Long Id_Libre_Demande) {
        LibredemandeEntity updateDemand = this.libredemandeService.updateDemandR(Id_Libre_Demande);
        return new ResponseEntity<>(updateDemand, HttpStatus.OK);


    }
}
