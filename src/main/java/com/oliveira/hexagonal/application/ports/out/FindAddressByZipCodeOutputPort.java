package com.oliveira.hexagonal.application.ports.out;

import com.oliveira.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);
}
