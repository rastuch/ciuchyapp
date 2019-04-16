package pl.karolciuchy.ciuchyapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karolciuchy.ciuchyapp.dao.StatisticRepo;
import pl.karolciuchy.ciuchyapp.dao.entity.Perfume;
import pl.karolciuchy.ciuchyapp.dao.helpers.StatisticHelper;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/statistic")
public class StatisticApi {

    StatisticRepo statisticRepo;

    @Autowired
    StatisticApi(StatisticRepo statisticRepo){this.statisticRepo = statisticRepo;}

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public List<Perfume> getDataBetween(@RequestBody StatisticHelper statisticHelper){

      return statisticRepo.findAllByRecieveDateBetween(statisticHelper);
    }

    @GetMapping("/isnotnull")
    public List<Perfume> getIsNotNullDate(){
        return statisticRepo.findByRecieveDateIsNotNull();
    }
}
