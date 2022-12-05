package com.iesam.chispas.data;

import java.util.List;
import java.util.TreeMap;

import com.iesam.chispas.domain.models.Client;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<String, Client> dataStore = new TreeMap<>();

    @Override
    public void saveCustomer(Client cliente) {
        dataStore.put(cliente.getId(), cliente);
    }

    @Override
    public void deleteCustomer(Client cliente) {
        dataStore.remove(cliente);
    }

    @Override
    public void updateCustomer(Client cliente) {
        dataStore.replace(cliente.getId(), cliente);
    }

    @Override
    public List<Client> getAllCustomers() {

        return dataStore.values().stream().toList();
    }

    @Override
    public Client findById(Integer code) {
        return dataStore.get(code);
    }
}
