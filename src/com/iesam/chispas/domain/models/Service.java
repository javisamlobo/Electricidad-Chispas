package com.iesam.chispas.domain.models;

public class Service implements Sale {

    private String code;
    private String name;
    private Integer price;

    private String iva;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name= name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String getIva() {
        return iva;
    }

    @Override
    public void setIva(String iva) {
        this.iva= iva;
    }
}
