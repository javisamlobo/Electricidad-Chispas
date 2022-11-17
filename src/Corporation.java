public class Corporation implements Client{

    private String name;
    private String cif;
    private Integer postalCode;
    private String town;
    private String province;
    private String email;
    private Integer telephone;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return cif;
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
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(String id) {
        this.cif = id;
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
}
