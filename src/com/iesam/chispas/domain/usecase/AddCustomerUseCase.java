package com.iesam.chispas.domain.usecase;


import com.iesam.chispas.data.*;
import com.iesam.chispas.domain.models.Client;

public class AddCustomerUseCase {

    public void execute(Client customer) {
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }

}
