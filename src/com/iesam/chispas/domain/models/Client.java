package com.iesam.chispas.domain.models;

public interface Client {

    public String getName();
    public String getId();
    public Integer getPostalCode();
    public String getTown();
    public String getProvince();
    public String getEmail();
    public Integer getTelephone();
    public void setName( String name);
    public void setId( String id);
    public void setPostalCode (Integer postalCode);
    public void setTown ( String town);
    public void setProvince (String province);
    public void setEmail (String email);
    public void setTelephone (Integer telephone);

}
