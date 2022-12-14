package com.iesam.chispas.presentation;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.*;
import com.iesam.chispas.domain.usecase.*;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        InvoicePrinter invoicePrinter = new InvoicePrinter();

        Autonomous autonomo = new Autonomous();
        autonomo.setCode(1);
        autonomo.setId("70562154J");
        autonomo.setName("Pepe");
        autonomo.setSurname("Perez");
        autonomo.setPostalCode(05002);
        autonomo.setTown("Ávila");
        autonomo.setProvince("Ávila");
        autonomo.setTelephone(920565458);
        autonomo.setEmail("pepeperez@gmail.com");

        Corporation sociedad = new Corporation();
        sociedad.setCode(1);
        sociedad.setId("B-89654215");
        sociedad.setName("Innovation.SL");
        sociedad.setEmail("atencion@inno.com");
        sociedad.setTelephone(615489856);
        sociedad.setTown("Ávila");
        sociedad.setProvince("Ávila");
        sociedad.setPostalCode(05001);

        Product producto = new Product();
        producto.setCode("bn45");
        producto.setName("Remo");
        producto.setBrand("Arvine");
        producto.setModel("Bmsed");
        producto.setIva("Tipo 21");
        producto.setPrice(100);

        Service servicio = new Service();
        servicio.setCode("imjjd45");
        servicio.setName("Actualizacion");
        servicio.setPrice(125);
        servicio.setIva("Tipo 4");

        Invoice factura = new Invoice();
        factura.setCode("oct25112022001");
        factura.setDate("25/11/2022");
        factura.setClient(autonomo);
        factura.setSale(producto);
        factura.setTaxBase(100);
        factura.setTotal(121);

        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        addCustomerUseCase.execute(sociedad);

        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);
        List<Client> customer = getCustomerUseCase.execute();
        for (int i = 0; i <  customer.size(); i++){
            printClient(customer.get(i));
        }
        System.out.println("Eliminado......");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(autonomo);

        List<Client> customer2 = getCustomerUseCase.execute();
        for (int i = 0; i < customer2.size(); i++){
            printClient(customer2.get(i));
        }

        System.out.println("Update");
        sociedad.setEmail("asdasdas");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase.execute(sociedad);

        List<Client> customer3 = getCustomerUseCase.execute();
        for (int i = 0; i < customer3.size(); i++){
            printClient(customer3.get(i));
        }
        //invoicePrinter.print(factura);
    }

    public static void printClient( Client client) {
            System.out.println("Cod: " + client.getCode() + " Nombre: " + client.getName() + " Email: " + client.getEmail());
        }





}