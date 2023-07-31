package tn.arabsoft.auth.controler;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.arabsoft.auth.Service.TypeorgService;
import tn.arabsoft.auth.entity.TypeorgEntity;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/typeorg")
public class TypeorgController {
    @Autowired
    private TypeorgService typeorgService;

    @GetMapping("/allTypeorg")
    @ResponseBody
    public List<TypeorgEntity> getAllTypeorg() {

        return this.typeorgService.getAlltypeorg();
    }
    @PostMapping("/addTypeorg")
    @ResponseBody
    public void addTypeorg(@RequestBody TypeorgEntity typeorgEntity) {
        this.typeorgService.addTypeorg(typeorgEntity);
    }
    @DeleteMapping("/deleteTypeorg/{id}")
    @ResponseBody
    public void deleteTypeorg(@PathVariable("type_org") Long type_org) {
        this.typeorgService.deleteTypeorg(type_org);
    }

}
