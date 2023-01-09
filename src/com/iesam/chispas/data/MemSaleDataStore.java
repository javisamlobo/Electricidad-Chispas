package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Sale;
import java.util.List;
import java.util.TreeMap;

public class MemSaleDataStore implements CommodityDataStore {
    private TreeMap<String, Sale> dataStore = new TreeMap<>();

    @Override
    public void saveSale(Sale sale) {
        dataStore.put(sale.getCode(), sale);
    }

    @Override
    public void deleteSale(Sale sale) {
        dataStore.remove(sale);
    }

    @Override
    public void updateSale(Sale sale) {
        dataStore.replace(sale.getCode(), sale);
    }

    @Override
    public List<Sale> getAllSales() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Sale finById(Integer code) {
        return dataStore.get(code);
    }
}
