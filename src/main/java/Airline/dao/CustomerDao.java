package Airline.dao;

import Airline.model.Customers;
import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateful
public class CustomerDao {
    @PersistenceContext(unitName = "flight_customer")
    private EntityManager entityManager;

    public void createCustomer(Customers customer) {
        entityManager.persist(customer);
    }

    public Customers getCustomerById(Long customerId) {
        return entityManager.find(Customers.class, customerId);
    }

    public void updateCustomer(Customers customer) {
        entityManager.merge(customer);
    }

    public void deleteCustomer(Customers customer) {
        entityManager.remove(customer);
    }
}
