package grupo8.retos.retotres.repositorios;

import org.springframework.data.repository.CrudRepository;

import grupo8.retos.retotres.modelo.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer>{
    
}
