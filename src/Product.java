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
}
