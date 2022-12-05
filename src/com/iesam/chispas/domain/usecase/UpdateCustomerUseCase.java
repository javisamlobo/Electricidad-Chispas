package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Client;

public class UpdateCustomerUseCase {
    private CustomerDataStore customerDataStore;
    public UpdateCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public void execute(Client client){
        customerDataStore.updateCustomer(client);
    }
}
