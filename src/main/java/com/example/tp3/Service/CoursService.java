package com.example.tp3.Service;

import com.example.tp3.Modele.Cours;
import com.example.tp3.Modele.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;

    public List<Cours> getAllCours(Integer moduleId) {
        List<Cours> cours=new ArrayList<>();
        coursRepository.findByModuleId(moduleId).forEach(cours::add);
        return cours;
    }

    public Optional<Cours> getCours(Integer id) {
        return coursRepository.findById(id);
    }

    public void ajouterCours(Cours cours) {
        coursRepository.save(cours);
    }

    public void modifierCours(Cours cours) {
        coursRepository.save(cours);
    }

    public void supprimerCours(Integer id) {
        coursRepository.deleteById(id);
    }
}
