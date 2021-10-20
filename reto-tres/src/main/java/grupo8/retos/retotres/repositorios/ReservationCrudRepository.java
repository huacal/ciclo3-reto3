package grupo8.retos.retotres.repositorios;

import org.springframework.data.repository.CrudRepository;

import grupo8.retos.retotres.modelo.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{
    
}
