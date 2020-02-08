package ru.Eltex;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ReservationRepo extends CrudRepository<Reservation, Long> {
    List<Reservation> findByTag(String tag);
}
