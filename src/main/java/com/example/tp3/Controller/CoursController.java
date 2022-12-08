package com.example.tp3.Controller;

import com.example.tp3.Modele.Cours;
import com.example.tp3.Modele.Module;
import com.example.tp3.Service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CoursController {
    @Autowired
    private CoursService coursService;

    @RequestMapping("/modules/{id}/cours")
    public List<Cours> getAllCours(@PathVariable Integer id){
        return coursService.getAllCours(id);
    }

    @RequestMapping("/modules/{moduleId}/cours/{id}")

    public Optional<Cours> getCours(@PathVariable Integer id){
        return coursService.getCours(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/modules/{moduleId}/cours")

    public void ajouterCours(@RequestBody Cours cours, @PathVariable Integer moduleId) {
        cours.setModule(new Module(moduleId,"",""));
        coursService.ajouterCours(cours);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/modules/{moduleId}/cours/{id}")

    public void modifierCours(@RequestBody Cours cours, @PathVariable Integer moduleId, @PathVariable Integer id) {
        cours.setModule(new Module(moduleId,"",""));
        coursService.modifierCours(cours);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{moduleId}/cours/{id}")

    public void supprimerCours(@PathVariable Integer id) {
        coursService.supprimerCours(id);
    }
}
