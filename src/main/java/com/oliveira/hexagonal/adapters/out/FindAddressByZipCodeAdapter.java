package com.oliveira.hexagonal.adapters.out;

import com.oliveira.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.oliveira.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.oliveira.hexagonal.application.core.domain.Address;
import com.oliveira.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
