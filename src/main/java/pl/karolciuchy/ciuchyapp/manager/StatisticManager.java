package pl.karolciuchy.ciuchyapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import pl.karolciuchy.ciuchyapp.dao.StatisticRepo;
import pl.karolciuchy.ciuchyapp.dao.entity.Perfume;
import pl.karolciuchy.ciuchyapp.dao.helpers.StatisticHelper;


import java.sql.Date;
import java.util.List;

public class StatisticManager {

    StatisticRepo statisticRepo;

    @Autowired
    public StatisticManager(StatisticRepo statisticRepo){
        this.statisticRepo = statisticRepo;
    }

    public List<Perfume> getByDateBetween(Date startDate,Date endDate){
        return statisticRepo.findAllByRecieveDateBetween(startDate, endDate);
    }

    public List<Perfume> getPerfumeDateIsNotNull(){
        return statisticRepo.findByRecieveDateIsNotNull();
    }
}
