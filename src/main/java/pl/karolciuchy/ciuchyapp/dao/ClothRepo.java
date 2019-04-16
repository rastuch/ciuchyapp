package pl.karolciuchy.ciuchyapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.karolciuchy.ciuchyapp.dao.entity.Cloth;

public interface ClothRepo extends CrudRepository<Cloth, Long> {
}
