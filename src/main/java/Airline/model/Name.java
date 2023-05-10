package Airline.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable //  indica che una classe può essere incorporata come parte altra entita
public class Name {
	  @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + "@" + lastName;
    }
}
