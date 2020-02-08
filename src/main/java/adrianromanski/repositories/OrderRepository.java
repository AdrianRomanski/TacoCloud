package adrianromanski.repositories;



import org.springframework.data.repository.CrudRepository;
import adrianromanski.model.Order;

public interface OrderRepository 
         extends CrudRepository<Order, Long> {

}
