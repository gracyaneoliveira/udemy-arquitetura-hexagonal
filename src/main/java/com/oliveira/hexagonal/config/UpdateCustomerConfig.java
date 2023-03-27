package com.oliveira.hexagonal.config;

import com.oliveira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.oliveira.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.oliveira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.oliveira.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
