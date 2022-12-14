package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CommodityDataStore;
import com.iesam.chispas.data.MemSaleDataStore;
import com.iesam.chispas.domain.models.Sale;

public class AddCommodityUseCase {
    private CommodityDataStore commodityDataStore;
    public AddCommodityUseCase(CommodityDataStore commodityDataStore){
               this.commodityDataStore = commodityDataStore;
    }
    public void execute(Sale commodity){
        commodityDataStore.saveSale(commodity);
    }
}
