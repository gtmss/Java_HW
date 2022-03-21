package ch3.Ex_12_3;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double priceItem;

    public Invoice(String partNumber, String partDescription, int quantity, double priceItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.priceItem = priceItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getquantity() {
        return quantity;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public double getInvoiceAmount(){

        if (quantity < 0) {
            quantity = 0;
        }

        if (priceItem < 0) {
            priceItem = 0.0;
        }

        if (quantity > 0 && priceItem > 0) {
            return priceItem * quantity;
        } else return 0;

    }
}
