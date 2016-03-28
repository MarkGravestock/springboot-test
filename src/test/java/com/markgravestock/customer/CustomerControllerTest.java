package com.markgravestock.customer;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CustomerControllerTest {

    private CustomerRepository customerRepository;
    private CustomerController sut;

    @Before
    public void setUp() throws Exception {
        customerRepository = mock(CustomerRepository.class);
        sut = new CustomerController(customerRepository);
    }

    @Test
    public void customersFetchesAllCustomers() {
        sut.customers();

        verify(customerRepository).findAll();
    }

    @Test
    public void constructorSavesSomeCustomersEvenThoughThisIsABitSuspect() {
        verify(customerRepository, atLeast(1)).save(any(Customer.class));
    }
}