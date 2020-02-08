package adrianromanski.repositories;


import org.springframework.data.repository.CrudRepository;
import adrianromanski.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
