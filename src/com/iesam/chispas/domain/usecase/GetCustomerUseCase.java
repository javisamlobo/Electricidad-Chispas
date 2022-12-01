package com.iesam.chispas.domain.usecase.*;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.Client;

import java.util.List;

public class GetCustomerUseCase {

    public List<Client> execute(){
       CustomerDataStore customerDataStore = new MemCustomerDataStore();
       return customerDataStore.getAllCustomers();
    }
}
