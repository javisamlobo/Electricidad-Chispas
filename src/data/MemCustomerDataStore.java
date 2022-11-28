package data;

import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<String, Client> dataStore = new TreeMap<String, Client>();

    @Override
    public void saveCustomer(Client cliente) {
       dataStore.put(cliente.codCliente, cliente);
    }

    @Override
    public void deleteCustomer(Client cliente) {
        dataStore.remove(cliente);
    }

    @Override
    public void updateCustomer(Client cliente) {
        dataStore.replace(cliente.CodCliente, cliente);
    }

    @Override
    public List<Client> getAllCustomers() {

        return dataStore.values().stream().toList();
    }

    @Override
    public Client findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}
