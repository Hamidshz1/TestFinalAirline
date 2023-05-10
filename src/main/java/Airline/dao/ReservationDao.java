package Airline.dao;

import Airline.model.Reservation;
import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateful
public class ReservationDao {
    @PersistenceContext(unitName = "flight_customer")
    private EntityManager entityManager;

    public void createReservation(Reservation reservation) {
        entityManager.persist(reservation);
    }

    public Reservation getReservationById(Long reservationId) {
        return entityManager.find(Reservation.class, reservationId);
    }

    public void updateReservation(Reservation reservation) {
        entityManager.merge(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        entityManager.remove(reservation);
    }
}
