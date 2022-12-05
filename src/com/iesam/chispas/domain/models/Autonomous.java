package com.iesam.chispas.domain.models;

public class Autonomous implements Client {

    private  Integer code;
    private String name;
    private String surname;
    private String dni;
    private Integer postalCode;
    private String town;
    private String province;
    private String email;
    private Integer telephone;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }

    @Override
    public String getId() {
        return dni;
    }

    @Override
    public Integer getPostalCode() {
        return postalCode;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public Integer getTelephone() {
        return telephone;
    }

    @Override
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(String id) {
        this.dni = id;
    }

    @Override
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
