package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Client;

import java.util.List;

public class GetCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public List<Client> execute(){
      return customerDataStore.getAllCustomers();
    }
}
