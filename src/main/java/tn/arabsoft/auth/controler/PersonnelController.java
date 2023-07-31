package tn.arabsoft.auth.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.arabsoft.auth.Service.PersonnelService;
import tn.arabsoft.auth.entity.Personnel;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/personnel")
public class PersonnelController {
    
    @Autowired
    private PersonnelService personnelService;

    @GetMapping("/allPersonnel")
    @ResponseBody
    public List<Personnel> getAllPersonnel() {

        return this.personnelService.getAllPersonnel();
    }
    
    @PostMapping("/addPers")
    public ResponseEntity<Personnel> ajouterPersonnel(@RequestBody Personnel personnel) {
        Personnel personnelCree = personnelService.ajouterPersonnel(personnel);
        return new ResponseEntity<>(personnelCree, HttpStatus.CREATED);
    }

    @GetMapping("/{matricule}")
    public ResponseEntity<Personnel> getPersonnelParMatricule(@PathVariable String matricule) {
        Personnel personnel = personnelService.getPersonnelParMatricule(matricule);
        if (personnel != null) {
            return new ResponseEntity<>(personnel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update")
    public ResponseEntity<Personnel> update(@RequestBody Personnel utilisateur) {
        Personnel updateUser = this.personnelService.updateUser(utilisateur);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
}
