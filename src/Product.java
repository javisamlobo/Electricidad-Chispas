public class Product implements Sale{

    private String productCode;
    private String name;
    private String brand;
    private String model;
    private Float price;
    private String iva;

    //metodos

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getCode() {
        return productCode;
    }

    @Override
    public void setCode(String code) {
        this.productCode = code;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
            this.iva = iva;
    }
}
