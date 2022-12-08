package com.example.tp3.Modele;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
    public List<Cours> findByModuleId(Integer moduleId);
}
