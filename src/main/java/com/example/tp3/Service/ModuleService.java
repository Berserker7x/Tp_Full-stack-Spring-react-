package com.example.tp3.Service;

import com.example.tp3.Modele.Module;


import com.example.tp3.Modele.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ModuleService {
 @Autowired
 ModuleRepository moduleRepository;
    public List<Module> getAllModules() {

     return    moduleRepository.findAll();

    }
    public void ajouterModule(Module module) {
        moduleRepository.save(module);
    }
    public Optional<Module> getModule(Integer id){
            return moduleRepository.findById(id);
    }
    public void modifierModule(Integer Id,Module module){
        moduleRepository.save(module);
    }
    public void supprimerModule(Integer id){
        moduleRepository.deleteById(id);
    }
}
