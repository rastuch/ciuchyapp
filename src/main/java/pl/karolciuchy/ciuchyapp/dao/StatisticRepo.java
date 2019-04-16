package pl.karolciuchy.ciuchyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.karolciuchy.ciuchyapp.dao.entity.Perfume;
import pl.karolciuchy.ciuchyapp.dao.helpers.StatisticHelper;


import java.util.Date;
import java.util.List;

public interface StatisticRepo extends JpaRepository<Perfume, Long> {

   List<Perfume> findAllByRecieveDateBetween(Date startDate, Date endDate);

   List<Perfume> findByRecieveDateIsNotNull();
}
