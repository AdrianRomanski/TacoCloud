package adrianromanski.repositories;

import org.springframework.data.repository.CrudRepository;

import adrianromanski.model.Taco;

public interface TacoRepository 
         extends CrudRepository<Taco, Long> {

}
