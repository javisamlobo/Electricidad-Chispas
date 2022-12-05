package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Client;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer(Client cliente);
    void deleteCustomer(Client cliente);
    void updateCustomer(Client cliente);
    List<Client> getAllCustomers();
    Client findById(Integer code);


}
