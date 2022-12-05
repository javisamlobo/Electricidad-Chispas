package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CommodityDataStore;
import com.iesam.chispas.domain.models.Sale;

public class UpdateCommodityUseCase {
    private CommodityDataStore commodityDataStore;
    public UpdateCommodityUseCase(CommodityDataStore commodityDataStore){
        this.commodityDataStore = commodityDataStore;
    }
    public void execute(Sale sale){
        commodityDataStore.updateSale(sale);
    }
}
