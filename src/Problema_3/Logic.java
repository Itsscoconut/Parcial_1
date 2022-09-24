package Problema_3;

public class Logic {
    private String productName;
    private int quantity;
    private float price;


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public boolean verify(){
        if(price!=0&&price>0){
            return true;
        }else{
            return false;
        }
    }

    public float finalPrice(){
        if(verify()){
            price=(price*quantity)+0.07f;
        }
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

}
