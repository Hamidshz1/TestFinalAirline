package Airline.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "seat_id")
    private String seatID;
    
    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    public Seat() {
    }

    public Seat(String seatID, boolean status) {
        setSeatID(seatID);
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSeatID(String seatID) {
        if (seatID.matches("[a-zA-Z0-9]+$") && seatID.length() == 3) {
            this.seatID = seatID.toUpperCase();
        } else {
            System.out.println("Invalid Seat ID");
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSeatID() {
        return seatID;
    }

    public boolean isStatus() {
        return status;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return getSeatID() + "\t" + isStatus();
    }
}
