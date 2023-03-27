package com.oliveira.hexagonal.application.ports.in;

import com.oliveira.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
