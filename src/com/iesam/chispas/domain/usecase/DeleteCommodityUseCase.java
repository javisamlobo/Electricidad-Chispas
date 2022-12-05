package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CommodityDataStore;
import com.iesam.chispas.domain.models.Sale;

public class DeleteCommodityUseCase {
    private CommodityDataStore commodityDataStore;
    public DeleteCommodityUseCase(CommodityDataStore commodityDataStore){
        this.commodityDataStore = commodityDataStore;
    }
    public void execute(Sale sale){ commodityDataStore.deleteSale(sale);}
}
