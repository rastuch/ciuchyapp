package pl.karolciuchy.ciuchyapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karolciuchy.ciuchyapp.dao.entity.Perfume;
import pl.karolciuchy.ciuchyapp.manager.PerfumeManager;


import java.util.Optional;

@RestController
@RequestMapping("/api/perfume")
public class PerfumeApi {

    PerfumeManager perfumeManager;

    @Autowired
    public PerfumeApi(PerfumeManager perfumeManager){
        this.perfumeManager = perfumeManager;
    }

    @GetMapping("/all")
    public Iterable<Perfume> addPerfume(){
        return perfumeManager.getAllPerfume();
    }

    @GetMapping
    public Optional<Perfume> getPerfumeById(@RequestParam Long index) {
        return perfumeManager.getPerfumeById(index);
    }

    @PostMapping
    public void addPerfume(@RequestBody Iterable<Perfume> perfumes){
        perfumeManager.addPerfumes(perfumes);
    }

    @PutMapping
    public void savePerfume(@RequestBody Perfume perfume){
        perfumeManager.savePerfume(perfume);
    }

    @DeleteMapping
    public void deletePerfume(Long index){
        perfumeManager.deletePerfume(index);
    }

}
