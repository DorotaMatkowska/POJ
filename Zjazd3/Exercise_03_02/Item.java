package Exercise_03_02;


/*
Dorota Matkowska
zadanie 3
*/


public class Item {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public Item(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice=unitPrice;
    }
    public String getid()
    {
        return id;
    }
    public String getdesc(){
        return desc;
    }
    public int getqty(){
        return qty;
    }
    public void setqty(int qty){
        this.qty=qty;
    }
    public double getunitPrice(){
        return unitPrice;
    }
    public void setunitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "Item[id = " + id + " desc= " + desc + " qty= " + qty + " unitPrice= " + unitPrice+  "]";
    }
}
