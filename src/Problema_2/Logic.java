package Problema_2;

public class Logic {
    private float quantity;

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean verify(){
        if(quantity!=0&&quantity>0){
            return true;
        }else{
            return false;
        }
    }

    public float show(){
        return quantity/3.5f;
    }
}
