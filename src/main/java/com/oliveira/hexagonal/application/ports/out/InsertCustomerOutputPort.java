package com.oliveira.hexagonal.application.ports.out;

import com.oliveira.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
