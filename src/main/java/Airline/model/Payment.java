package Airline.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import java.util.List;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "card_number")
    private String cardNumber;
    
    @Column(name = "card_holder_name")
    private String cardHolderName;
    
    @Column(name = "expiration_date")
    private String expirationDate;
    
    @Column(name = "cvv")
    private int cvv;

    @OneToMany(mappedBy = "payment", cascade = CascadeType.ALL)
    private List<Customers> customers;

    public Payment() {
    }

    public Payment(String cardNumber, String cardHolderName, String expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Card Number: " + cardNumber + "\n" +
               "Card Holder: " + cardHolderName + "\n" +
               "Expiration Date: " + expirationDate + "\n" +
               "CVV: " + cvv;
    }
}
