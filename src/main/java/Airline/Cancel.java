package Airline;

import Airline.model.Reservation;

public class Cancel {
    private String cancellationCode;
    private Reservation reservation;
    
    public Cancel(String cancellationCode, Reservation reservation) {
        this.cancellationCode = cancellationCode;
        this.reservation = reservation;
    }
    
    public String getCancellationCode() {
        return cancellationCode;
    }
    
    public void setCancellationCode(String cancellationCode) {
        this.cancellationCode = cancellationCode;
    }
    
    public Reservation getReservation() {
        return reservation;
    }
    
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    public void cancelReservation() {
        reservation.cancelReservation();
        System.out.println("Reservation canceled: " + reservation.getReservationCode());
    }
    
    @Override
    public String toString() {
        return "Cancellation Code: " + cancellationCode + "\n" +
               "Reservation Details: " + reservation.toString();
    }
}
