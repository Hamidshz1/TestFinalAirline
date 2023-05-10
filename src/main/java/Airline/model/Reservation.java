package Airline.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Column;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "reservation_code")
    private String reservationCode;
    
    @Column(name = "passenger_name")
    private String passengerName;
    
    @Column(name = "flight_number")
    private String flightNumber;
    
    @Column(name = "confirmed")
    private boolean confirmed;

    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
    private Customers customer;

    public Reservation() {
    }

    public Reservation(String reservationCode, String passengerName, String flightNumber) {
        this.reservationCode = reservationCode;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.confirmed = false;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void confirmReservation() {
        confirmed = true;
    }

    public void cancelReservation() {
        confirmed = false;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
}
