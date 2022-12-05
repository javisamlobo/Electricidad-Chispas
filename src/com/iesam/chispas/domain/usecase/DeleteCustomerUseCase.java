package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Client;

public class DeleteCustomerUseCase {
    private CustomerDataStore customerDataStore;
    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Client client) {
        customerDataStore.deleteCustomer(client);
    }
}
