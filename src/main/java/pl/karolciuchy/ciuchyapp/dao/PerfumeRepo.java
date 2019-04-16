package pl.karolciuchy.ciuchyapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.karolciuchy.ciuchyapp.dao.entity.Perfume;

public interface PerfumeRepo extends CrudRepository<Perfume, Long> {
}
