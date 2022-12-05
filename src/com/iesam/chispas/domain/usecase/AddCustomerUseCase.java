package com.iesam.chispas.domain.usecase;


import com.iesam.chispas.data.*;
import com.iesam.chispas.domain.models.Client;

public class AddCustomerUseCase {

    private CustomerDataStore customerDataStore;
    public AddCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public void execute(Client customer) {
        customerDataStore.saveCustomer(customer);
    }

}
