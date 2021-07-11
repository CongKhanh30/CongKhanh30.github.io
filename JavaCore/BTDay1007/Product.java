public class Product {
    private String productId;

    private String productName;

    private long unitPrice;

    private int quantity;

    private int amountSales;

    private Category manufacturer;

    private String description;

    public Product(){
        
    }


    public String getProductId() {

        return productId;

    }

    public void setProductId(String productId) {

        this.productId = productId;

    }

    public String getProductName() {

        return productName;

    }

    public void setProductName(String productName) {

        this.productName = productName;

    }

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public long getUnitPrice() {

        return unitPrice;

    }

    public void setUnitPrice(long unitPrice) {

        this.unitPrice = unitPrice;

    }

    public int getQuantity() {

        return quantity;

    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }

    public int getAmountSales() {

        return amountSales;

    }

    public void setAmountSales(int amountSales) {

        this.amountSales = amountSales;

    }

    public Category getCategory() {

        return manufacturer;

    }

    public void setCategory (Category manufacturer) {

        this.manufacturer = manufacturer;

    }

    public Product(String productId, String productName, long unitPrice, int quantity, int amountSales, String description,
            Category manufacturer) {

        this.productId = productId;

        this.productName = productName;

        this.unitPrice = unitPrice;

        this.quantity = quantity;

        this.amountSales = amountSales;

        this.manufacturer = manufacturer;

        this.description = description;

    }

    @Override
    public String toString() {
        return "Product [amountSales=" + amountSales + ", description=" + description + ", productId=" + productId
                + ", productName=" + productName + ", quantity=" + quantity + ", unitPrice=" + unitPrice
                + ", manufacturer=" + manufacturer + "]";
    }

}
