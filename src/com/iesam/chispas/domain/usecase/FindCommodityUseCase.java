package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CommodityDataStore;
import com.iesam.chispas.domain.models.Sale;

public class FindCommodityUseCase {
    private CommodityDataStore commodityDataStore;
    public FindCommodityUseCase (CommodityDataStore commodityDataStore){
        this.commodityDataStore = commodityDataStore;
    }
    public Sale execute(Integer code){
     return commodityDataStore.finById(code);
    }
}
