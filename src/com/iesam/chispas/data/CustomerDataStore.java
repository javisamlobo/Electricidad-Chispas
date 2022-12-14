package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Client;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer(Client client);
    void deleteCustomer(Client client);
    void updateCustomer(Client client);
    List<Client> getAllCustomers();
    Client findById(Integer code);


}
