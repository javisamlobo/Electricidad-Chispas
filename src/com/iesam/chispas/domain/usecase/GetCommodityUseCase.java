package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CommodityDataStore;
import com.iesam.chispas.domain.models.Sale;

import java.util.List;

public class GetCommodityUseCase {
    private CommodityDataStore commodityDataStore;
    public GetCommodityUseCase(CommodityDataStore commodityDataStore){
        this.commodityDataStore = commodityDataStore;
    }
    public List<Sale> execute(){
        return commodityDataStore.getAllSales();
    }
}
