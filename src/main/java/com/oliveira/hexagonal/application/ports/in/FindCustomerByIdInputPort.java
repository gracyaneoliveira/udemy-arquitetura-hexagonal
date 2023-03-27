package com.oliveira.hexagonal.application.ports.in;

import com.oliveira.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
