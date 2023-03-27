package com.oliveira.hexagonal.application.ports.out;

import com.oliveira.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
