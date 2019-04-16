package pl.karolciuchy.ciuchyapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karolciuchy.ciuchyapp.dao.entity.Cloth;
import pl.karolciuchy.ciuchyapp.manager.ClothManager;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClothApi {

    ClothManager clothManager;

    @Autowired
    public ClothApi(ClothManager clothManager) {
        this.clothManager = clothManager;
    }

    @GetMapping("/getbyid")
    public Optional<Cloth> getById(@RequestParam Long index){
       return clothManager.getClothById(index);
    }

    @GetMapping("/all")
    public Iterable<Cloth> getAll(){
       return clothManager.getAllCloth();
    }
//
//    @GetMapping("/add")
//    public void addToDB(){
//        clothManager.addExample();
//    }

    @DeleteMapping("/delete")
    public void deleteCloth(@RequestParam Long index) {
        clothManager.deleteClothById(index);
    }
    @PutMapping
     public Cloth updateCloth(@RequestBody Cloth cloth){
       return clothManager.saveCloth(cloth);
        }
        @PostMapping
    public Cloth addCloth(@RequestBody Cloth cloth){
       return clothManager.saveCloth(cloth);
        }
    }


