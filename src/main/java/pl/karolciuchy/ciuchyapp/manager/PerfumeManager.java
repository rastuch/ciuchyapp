package pl.karolciuchy.ciuchyapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.karolciuchy.ciuchyapp.dao.PerfumeRepo;
import pl.karolciuchy.ciuchyapp.dao.entity.Perfume;

import java.util.List;
import java.util.Optional;

@Service
public class PerfumeManager {

    PerfumeRepo perfumeRepo;

    @Autowired
    public PerfumeManager(PerfumeRepo perfumeRepo) {
        this.perfumeRepo = perfumeRepo;
    }

    public Iterable<Perfume> getAllPerfume()
    {
        return perfumeRepo.findAll();
    }

    public Optional<Perfume> getPerfumeById(Long id){
        return perfumeRepo.findById(id);
    }

    public void savePerfume(Perfume perfume) {
        perfumeRepo.save(perfume);
    }

    public void deletePerfume(Long id){
        perfumeRepo.deleteById(id);
    }

    public void addPerfumes(Iterable<Perfume> perfumes){
        perfumeRepo.saveAll(perfumes);
    }
}
