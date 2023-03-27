package com.oliveira.hexagonal.config;

import com.oliveira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.oliveira.hexagonal.adapters.out.InsertCustomerAdapter;
import com.oliveira.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.oliveira.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
