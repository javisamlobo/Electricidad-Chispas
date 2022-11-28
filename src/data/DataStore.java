package data;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer(Client cliente);
    void deleteCustomer(Client cliente);
    void updateCustomer(Client cliente);
    List<Client> getAllCustomers();
    Client findById(Integer codCliente);
}
