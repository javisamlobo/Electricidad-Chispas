package com.iesam.chispas.data;

import java.util.List;
import java.util.TreeMap;

import com.iesam.chispas.domain.models.Client;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<Integer, Client> dataStore = new TreeMap<>();

    @Override
    public void saveCustomer(Client client) {
        dataStore.put(client.getCode(), client);
    }

    @Override
    public void deleteCustomer(Client client) {
        dataStore.remove(client.getCode());
    }

    @Override
    public void updateCustomer(Client client) {
        dataStore.replace(client.getCode(), client);
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
