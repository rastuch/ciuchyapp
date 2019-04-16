package pl.karolciuchy.ciuchyapp.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.karolciuchy.ciuchyapp.dao.entity.Cloth;
import pl.karolciuchy.ciuchyapp.dao.ClothRepo;

import java.util.Optional;

@Service
public class ClothManager {

    private ClothRepo clothRepo;

    @Autowired
    public ClothManager(ClothRepo clothRepo) {
        this.clothRepo = clothRepo;
    }

    public Optional<Cloth> getClothById(Long id){
        return clothRepo.findById(id);
    }

    public Iterable<Cloth> getAllCloth(){
        return clothRepo.findAll();
    }

    public Cloth saveCloth(Cloth cloth){
        return clothRepo.save(cloth);
    }

    public void deleteClothById(Long id){
        clothRepo.deleteById(id);

    }

    public void addExample(){
        saveCloth(new Cloth(1L, "sweter", 3L, 20.00, 30.50, "2019-11-20", "2019-11-20"));

    }

}

