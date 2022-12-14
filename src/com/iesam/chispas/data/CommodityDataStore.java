package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Sale;

import java.util.List;

public interface CommodityDataStore {
    void saveSale(Sale sale);
    void deleteSale(Sale sale);
    void updateSale(Sale sale);
    List<Sale> getAllSales();
    Sale finById(String cod);
}
