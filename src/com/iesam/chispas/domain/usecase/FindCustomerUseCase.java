package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Client;

public class FindCustomerUseCase {
    private CustomerDataStore customerDataStore;
    public FindCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
   public Client execute(){
        return customerDataStore.findById(Client);
   }
    //}
}
