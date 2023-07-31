package tn.arabsoft.auth.controler;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.arabsoft.auth.Service.EtatpaieService;
import tn.arabsoft.auth.entity.EtatpaieEntity;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/etatpaie")
public class EtatpaieController {
    @Autowired
    private EtatpaieService etatpaieService;

    @GetMapping("/allCode")
    @ResponseBody
    public List<EtatpaieEntity> getAllCode() {
        return this.etatpaieService.getAllCode();
    }
    @PostMapping("/addCode")
    @ResponseBody
    public void addCode(@RequestBody EtatpaieEntity etatpaieEntity) {
        this.etatpaieService.addCode(etatpaieEntity);
    }
    @DeleteMapping("/deleteCode/{Code_Etat}")
    @ResponseBody
    public void deletecode(@PathVariable("Code_Etat") Long Code_Etat) {
        this.etatpaieService.deleteCode(Code_Etat);
    }
}
