package tn.arabsoft.auth.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.arabsoft.auth.Service.SoldcongService;
import tn.arabsoft.auth.entity.SoldcongEntity;

import java.util.List;
@RestController
@RequestMapping("/soldcng")
public class SoldcongController {
    @Autowired
    private SoldcongService soldcongService;



    @GetMapping("/allSold")
    @ResponseBody
    public List<SoldcongEntity> getAllSold() {

        return this.soldcongService.getAllSold();
    }


    @PostMapping("/addSold")
    @ResponseBody
    public void addSold(@RequestBody SoldcongEntity soldcongEntity) {
        this.soldcongService.addSold(soldcongEntity);
    }
    @DeleteMapping("/deleteSold/{id}")
    @ResponseBody
    public void deleteSold(@PathVariable("solde_Conge") Long solde_Conge) {
        this.soldcongService.deleteSold(solde_Conge);
    }
}
