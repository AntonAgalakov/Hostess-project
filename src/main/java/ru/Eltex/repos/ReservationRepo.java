package ru.Eltex.repos;

import org.springframework.data.repository.CrudRepository;
import ru.Eltex.domain.Reservation;
import java.util.List;

public interface ReservationRepo extends CrudRepository<Reservation, Long> {
    List<Reservation>findByNtable(String ntable);
    List<Reservation>findByData(String data);
    List<Reservation>findByDataAndNtable(String data, String ntable);
}