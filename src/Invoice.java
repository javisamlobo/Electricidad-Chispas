public class Invoice {
    private String code;
    private String date;
    private Integer taxBase;
    private Integer total;
    private Client client;
    private Sale sale;

    //metodos

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(Integer taxBase) {
        this.taxBase = taxBase;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
